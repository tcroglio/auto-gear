package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Peca;

/**
 * @author tiago
 */
public class PecaController {

    public PecaController() {
    }

    //--------------------------------------------------------------------------------------//
    public boolean cadastrarPeca(Peca peca) {
        String sql = "INSERT INTO tbl_peca (codigoInterno, nome, descricao, marca, preco, quantidadeEstoque)"
                + " VALUES (?, ?, ?, ?, ?, ?)";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);

            comando.setString(1, peca.getCodigoInterno());
            comando.setString(2, peca.getNome());
            comando.setString(3, peca.getDescricao());
            comando.setString(4, peca.getMarca());
            comando.setDouble(5, peca.getPreco());
            comando.setInt(6, peca.getQuantidadeEstoque());

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            gerenciador.fecharConexao(comando, null);
        }

        return false;
    }

    //--------------------------------------------------------------------------------------//
    public List<Peca> listaPecas(int tipoFiltro, String filtro, int orderBy) {
        String sql = "SELECT * FROM tbl_peca";

        List<Peca> pecalist = new ArrayList<>();
        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        // BUSCA
        if (!filtro.equals("")) {
            if (tipoFiltro == 0) { // BUSCA PELO NOME
                sql += " WHERE nome LIKE ? ";

            } else if (tipoFiltro == 1) { // BUSCA PELO EMAIL
                sql += " WHERE descricao LIKE ? ";

            } else {
                sql += " WHERE marca LIKE ?";
            }
        }

        // ORDENA
        if (orderBy != 0) {

            switch (orderBy) {
                case 1: // ORDENA PELO CÓDIGO EM ASCENDENTE
                    sql += " ORDER BY codigoInterno ";
                    break;

                case 2: // ORDENA PELO CÓDIGO EM DESCENDENTE
                    sql += " ORDER BY codigoInterno DESC ";
                    break;

                case 3: // ORDENA PELO NOME EM ASCENDENTE
                    sql += " ORDER BY nome ";
                    break;

                case 4: // ORDENA PELO NOME EM DESCENDENTE
                    sql += " ORDER BY nome DESC ";
                    break;

                case 5: // ORDENA PELO EMAIL EM ASCENDENTE
                    sql += " ORDER BY preco ";
                    break;

                case 6: // ORDENA PELO EM DESCENDENTE
                    sql += " ORDER BY preco DESC ";
                    break;

                case 7: // ORDENA PELO EM DESCENDENTE
                    sql += " ORDER BY quantidadeEstoque ";
                    break;

                case 8: // ORDENA PELO EM DESCENDENTE
                    sql += " ORDER BY quantidadeEstoque DESC ";
                    break;
            }
        }

        try {
            comando = gerenciador.prepararComando(sql); // prepara o comando

            // SETA A STRING CASO O USUÁRIO TENHA INSERIDO ALGO NA BUSCA
            if (!filtro.equals("")) {
                comando.setString(1, "%" + filtro + "%");
            }

            // executa a query construída
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Peca peca = new Peca();
                peca.setId(resultado.getInt("id"));
                peca.setCodigoInterno(resultado.getString("codigoInterno"));
                peca.setNome(resultado.getString("nome"));
                peca.setDescricao(resultado.getString("descricao"));
                peca.setMarca(resultado.getString("marca"));
                peca.setPreco(resultado.getDouble("preco"));
                peca.setQuantidadeEstoque(resultado.getInt("quantidadeEstoque"));

                pecalist.add(peca);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            gerenciador.fecharConexao(comando, resultado);

        }
        return pecalist;
    }

    //--------------------------------------------------------------------------------------//
    public boolean deletarPeca(int id_peca) {
        String sql = "DELETE FROM tbl_peca WHERE id = ?";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id_peca);
            comando.executeUpdate();

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a peça: " + ex);

        } finally {

            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    //--------------------------------------------------------------------------------------//
    public boolean editarPeca(Peca peca) {
        String sql = "UPDATE tbl_peca SET nome = ?, descricao = ?, marca = ?, preco = ?, quantidadeEstoque = ?"
                + " WHERE id = ?";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);

            comando.setString(1, peca.getNome());
            comando.setString(2, peca.getDescricao());
            comando.setString(3, peca.getMarca());
            comando.setDouble(4, peca.getPreco());
            comando.setInt(5, peca.getQuantidadeEstoque());
            comando.setInt(6, peca.getId());
            comando.executeUpdate();

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a peça: " + ex);
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }
    //--------------------------------------------------------------------------------------//

}
