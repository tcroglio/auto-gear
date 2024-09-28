package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Peca;
import model.Pedido;

/**
 * @author s.lucas
 */
public class PedidoController {
    //--------------------------------------------------------------------------------------//

    public boolean cadastrarPedido(Pedido pedido, List<Peca> listapecas) {
        String sqlPedido = "INSERT INTO tbl_pedidos (numeroPedido, cliente, valorTotal) VALUES (?, ?, ?)";
        String sqlPedidoPeca = "INSERT INTO tbl_pedidopc (id_pedido, id_peca) VALUES (?, ?)";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comandoPedido = null;
        PreparedStatement comandoPedidoPeca = null;

        try {
            comandoPedido = gerenciador.prepararComando(sqlPedido);
            comandoPedido.setString(1, pedido.getNumeroPedido());
            comandoPedido.setString(2, pedido.getCliente());
            comandoPedido.setDouble(3, pedido.getValorTotal());

            int linhasAfetadas = comandoPedido.executeUpdate();

            if (linhasAfetadas > 0) {
                int idPedido = getLastInsertedId(gerenciador);

                comandoPedidoPeca = gerenciador.prepararComando(sqlPedidoPeca);

                for (Peca peca : listapecas) {
                    comandoPedidoPeca.setInt(1, idPedido); 
                    comandoPedidoPeca.setInt(2, peca.getId()); 
                    comandoPedidoPeca.addBatch(); 
                }

                comandoPedidoPeca.executeBatch();
                return true; 
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            gerenciador.fecharConexao(comandoPedido, null);
            gerenciador.fecharConexao(comandoPedidoPeca, null);
        }

        return false; 
    }

    private int getLastInsertedId(DbConnection gerenciador) throws SQLException {
        String sql = "SELECT LAST_INSERT_ID()"; 
        try (PreparedStatement comando = gerenciador.prepararComando(sql); ResultSet resultado = comando.executeQuery()) {
            if (resultado.next()) {
                return resultado.getInt(1); 
            }
        }
        return -1; 
    }

    //--------------------------------------------------------------------------------------//
    public List<Pedido> listaPedido(int tipoFiltro, String filtro, int orderBy) {
        String sql = "SELECT * FROM tbl_pedidos";

        List<Pedido> pedidolist = new ArrayList<>();
        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        // BUSCA
        if (!filtro.equals("")) {
            if (tipoFiltro == 0) { // BUSCA PELO NUMERO DO PEDIDO
                sql += " WHERE numeroPedido LIKE ? ";

            } else { // BUSCA PELO EMAIL
                sql += " WHERE cliente LIKE ? ";

            }
        }

        // ORDENA
        if (orderBy != 0) {

            switch (orderBy) {
                case 1: // ORDENA PELO numeroPedido EM ASCENDENTE
                    sql += " ORDER BY numeroPedido ";
                    break;

                case 2: // ORDENA PELO numeroPedido EM DESCENDENTE
                    sql += " ORDER BY numeroPedido DESC ";
                    break;

                case 3: // ORDENA PELO cliente EM ASCENDENTE
                    sql += " ORDER BY cliente ";
                    break;

                case 4: // ORDENA PELO cliente EM DESCENDENTE
                    sql += " ORDER BY cliente DESC ";
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
                Pedido pedido = new Pedido();
                pedido.setNumeroPedido(resultado.getString("numeroPedido"));
                pedido.setCliente(resultado.getString("cliente"));
                pedido.setValorTotal(resultado.getDouble("valorTotal"));

                pedidolist.add(pedido);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            gerenciador.fecharConexao(comando, resultado);

        }
        return pedidolist;
    }

    //--------------------------------------------------------------------------------------//
    public boolean deletarPedido(int id_pedido) {
        String sql = "DELETE FROM tbl_pedidos WHERE id = ?";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id_pedido);
            comando.executeUpdate();

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o pedido: " + ex);

        } finally {

            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    //--------------------------------------------------------------------------------------//
    public boolean editarPeca(Pedido pedido) {
        String sql = "UPDATE tbl_pedido SET numeroPedido = ?, cliente = ?, valorTotal = ?"
                + " WHERE id = ?";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);

            comando.setString(1, pedido.getNumeroPedido());
            comando.setString(2, pedido.getCliente());
            comando.setDouble(3, pedido.getValorTotal());
            comando.executeUpdate();

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o pedido: " + ex);
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }
    //--------------------------------------------------------------------------------------//

}
