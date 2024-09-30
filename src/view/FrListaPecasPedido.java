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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridPecas = new javax.swing.JTable();
        txtNomeCliente = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        lbConsultar = new javax.swing.JLabel();
        txtNumeroPedido = new javax.swing.JTextField();
        txtTotalPedido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gridPecas.setBackground(new java.awt.Color(220, 220, 220));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 580, 264));

        txtNomeCliente.setEditable(false);
        jPanel1.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 30));

        btnFechar.setBackground(new java.awt.Color(220, 220, 220));
        btnFechar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFechar.setText("x");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 40, 30));

        lbConsultar.setFont(new java.awt.Font("Segoe UI Black", 3, 32)); // NOI18N
        lbConsultar.setForeground(new java.awt.Color(255, 102, 51));
        lbConsultar.setText("CONSULTAR PEDIDO");
        jPanel1.add(lbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, -1));

        txtNumeroPedido.setEditable(false);
        txtNumeroPedido.setBackground(new java.awt.Color(220, 220, 220));
        txtNumeroPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumeroPedido.setForeground(new java.awt.Color(255, 102, 51));
        txtNumeroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeroPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 71, 30));

        txtTotalPedido.setEditable(false);
        jPanel1.add(txtTotalPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("Total Pedido");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Nome do Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Pedido número ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 500));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextField txtTotalPedido;
    // End of variables declaration//GEN-END:variables
}
