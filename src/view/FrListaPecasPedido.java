package view;

import controller.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Pedido;

/**
 * @author tiago
 */
public class FrListaPecasPedido extends javax.swing.JFrame {

    private Pedido pedido;

    public FrListaPecasPedido() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        gridPecas = new javax.swing.JTable();
        lbConsultar = new javax.swing.JLabel();
        txtNumeroPedido = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        txtTotalPedido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gridPecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cód. Interno", "Nome", "Estoque", "Preço", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gridPecas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(gridPecas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 146, 563, 264));

        lbConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbConsultar.setForeground(new java.awt.Color(255, 102, 51));
        lbConsultar.setText("CONSULTAR PEÇAS DO PEDIDO Nº");
        getContentPane().add(lbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        txtNumeroPedido.setEditable(false);
        txtNumeroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 52, 71, 30));

        btnFechar.setForeground(new java.awt.Color(255, 102, 51));
        btnFechar.setText("FECHAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 416, 104, -1));

        txtTotalPedido.setEditable(false);
        getContentPane().add(txtTotalPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 71, -1));

        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Nome do Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNomeCliente.setEditable(false);
        getContentPane().add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 264, -1));

        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("Total Pedido");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroPedidoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String sql = "SELECT * FROM tbl_pedidos WHERE id = ?";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            comando = gerenciador.prepararComando(sql); // prepara o comando
            comando.setInt(1, pedido.getId());
            resultado = comando.executeQuery();

            if (resultado.next()) { // Mover o cursor para a primeira linha
                txtNumeroPedido.setText(resultado.getString("numeroPedido"));
                listarPecasPedido();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer a busca na tbl_pedidos: " + ex);

        } finally {
            gerenciador.fecharConexao(comando, resultado);

        }


    }//GEN-LAST:event_formWindowOpened

    private void listarPecasPedido() {
        String sql = "SELECT * FROM tbl_pedidopc"
                + " INNER JOIN tbl_peca"
                + " ON tbl_pedidopc.id_peca = tbl_peca.id"
                + " INNER JOIN tbl_pedidos"
                + " ON tbl_pedidopc.id_pedido = tbl_pedidos.id"
                + " WHERE tbl_pedidopc.id_pedido = ?";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;
        ResultSet resultado = null;
        DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();
        model.setNumRows(0);

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, pedido.getId());
            resultado = comando.executeQuery();

            while (resultado.next()) {
                txtTotalPedido.setText("R$ " + resultado.getString("valorTotal"));
                txtNomeCliente.setText(resultado.getString("cliente"));
                
                Object[] linha = {
                    resultado.getInt("id"),
                    resultado.getString("codigoInterno"),
                    resultado.getString("nome"),
                    resultado.getInt("quantidadeEstoque"),
                    resultado.getDouble("preco"),
                    resultado.getString("marca")
                };
                model.addRow(linha);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer a busca na tbl_pedidopc " + ex);

        } finally {
            gerenciador.fecharConexao(comando, resultado);

        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrListaPecasPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrListaPecasPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrListaPecasPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrListaPecasPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrListaPecasPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JTable gridPecas;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextField txtTotalPedido;
    // End of variables declaration//GEN-END:variables
}
