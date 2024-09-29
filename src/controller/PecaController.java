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
            switch (tipoFiltro) {
                case 0:
                    // BUSCA PELO NOME
                    sql += " WHERE nome LIKE ? ";
                    break;
                case 1:
                    // BUSCA PELO EMAIL
                    sql += " WHERE codigoInterno LIKE ? ";
                    break;
                case 2:
                    sql += " WHERE marca LIKE ?";
                    break;
                case 3:
                    sql += " WHERE quantidadeEstoque > ?";
                    break;
                case 4:
                    sql += " WHERE quantidadeEstoque < ?";
                    break;
                case 5:
                    sql += " WHERE preco > ?";
                    break;
                case 6:
                    sql += " WHERE preco < ?";
                    break;
            }
        }

        // ORDENA
        switch (orderBy) {
            case 0 -> // ORDENA PELO ID EM ASCENDENTE
                sql += " ORDER BY id ";

            case 1 -> // ORDENA PELO ID EM DESCENDENTE
                sql += " ORDER BY id DESC ";

            case 2 -> // ORDENA PELO CÓDIGO INTERNO EM ASCENDENTE
                sql += " ORDER BY codigoInterno ";

            case 3 -> // ORDENA PELO CÓDIGO INTERNO EM DESCENDENTE
                sql += " ORDER BY codigoInterno DESC ";

            case 4 -> // ORDENA PELO NOME EM ASCENDENTE
                sql += " ORDER BY nome ";

            case 5 -> // ORDENA PELO NOME EM DESCENDENTE
                sql += " ORDER BY nome DESC ";

            case 6 -> // ORDENA PELO ESTOQUE EM ASCENDENTE
                sql += " ORDER BY quantidadeEstoque";

            case 7 -> // ORDENA PELO ESTOQUE EM DESCENDENTE
                sql += " ORDER BY quantidadeEstoque DESC";

            case 8 -> // ORDENA PELO PREÇO EM ASCENDENTE
                sql += " ORDER BY preco ";

            case 9 -> // ORDENA PELO PREÇO EM DESCENDENTE
                sql += " ORDER BY preco DESC ";

            case 10 -> // ORDENA PELA MARCA EM ASCENDENTE
                sql += " ORDER BY marca";

            case 11 -> // ORDENA PELA MARCA EM DESCENDENTE
                sql += " ORDER BY marca DESC ";
        }

        try {
            comando = gerenciador.prepararComando(sql); // prepara o comando

            // SETA A STRING CASO O USUÁRIO TENHA INSERIDO ALGO NA BUSCA
            if (!filtro.equals("")) {

                if (tipoFiltro >= 3) { //tipoFiltro >= quer dizer que o usuário decidiu filtrar por quantidade em estoque ou preço
                    comando.setString(1, filtro); // então o comando é setado sem a porcentagem %

                } else {

                    comando.setString(1, "%" + filtro + "%");
                }
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
        String sql = "UPDATE tbl_peca SET codigoInterno = ?, nome = ?, descricao = ?, marca = ?, preco = ?, quantidadeEstoque = ?"
                       + " WHERE id = ?";

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
            comando.setInt(7, peca.getId());
            comando.executeUpdate();

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar a peça: " + ex);

        } finally {
            gerenciador.fecharConexao(comando);

        }

        return false;
    }
    //--------------------------------------------------------------------------------------//

}
