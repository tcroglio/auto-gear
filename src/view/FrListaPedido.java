package view;

import controller.PedidoController;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Pedido;

/**
 * @author s.lucas
 */
public class FrListaPedido extends javax.swing.JFrame {

    public FrListaPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtConsultar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridPedidos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        cbFiltro = new javax.swing.JComboBox<>();
        cbOrderBy = new javax.swing.JComboBox<>();
        btListar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        btListaPecas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConsultar.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        txtConsultar.setForeground(new java.awt.Color(255, 102, 51));
        txtConsultar.setText("CONSULTAR PEDIDO");
        jPanel1.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 30));

        gridPedidos.setBackground(new java.awt.Color(204, 204, 204));
        gridPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Cód. Interno", "Cliente", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gridPedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(gridPedidos);
        if (gridPedidos.getColumnModel().getColumnCount() > 0) {
            gridPedidos.getColumnModel().getColumn(0).setMinWidth(0);
            gridPedidos.getColumnModel().getColumn(0).setPreferredWidth(2);
            gridPedidos.getColumnModel().getColumn(1).setMinWidth(0);
            gridPedidos.getColumnModel().getColumn(1).setPreferredWidth(4);
            gridPedidos.getColumnModel().getColumn(3).setMinWidth(0);
            gridPedidos.getColumnModel().getColumn(3).setPreferredWidth(4);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 650, 230));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("ORDENAR");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        txtFiltro.setBackground(new java.awt.Color(204, 204, 204));
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
        });
        jPanel2.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 42, 230, -1));

        cbFiltro.setBackground(new java.awt.Color(204, 204, 204));
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Código Interno", "ID" }));
        cbFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbFiltroKeyPressed(evt);
            }
        });
        jPanel2.add(cbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 130, -1));

        cbOrderBy.setBackground(new java.awt.Color(204, 204, 204));
        cbOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "ID DESC", "Cód. Interno", "Cód. Interno DESC", "Cliente A-Z", "Cliente Z-A", "Valor >", "Valor <" }));
        cbOrderBy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbOrderByKeyPressed(evt);
            }
        });
        jPanel2.add(cbOrderBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        btListar.setBackground(new java.awt.Color(204, 204, 204));
        btListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btListar.setText("FILTRAR");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });
        btListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btListarKeyPressed(evt);
            }
        });
        jPanel2.add(btListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("FILTRO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("BUSCAR POR");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 460, 140));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 54, 110, -1));

        btListaPecas.setBackground(new java.awt.Color(204, 204, 204));
        btListaPecas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btListaPecas.setText("VER PEÇAS");
        btListaPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaPecasActionPerformed(evt);
            }
        });
        jPanel3.add(btListaPecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 95, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("FUNÇÕES");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 22, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 150, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Preview.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here: if (gridPedidos.getSelectedRow() != -1) {
        if (gridPedidos.getSelectedRow() != -1) {

            int posicaoSelecionada = gridPedidos.getSelectedRow();
            String textoCelulaId = gridPedidos.getValueAt(posicaoSelecionada, 0).toString();

            int confirm = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir este pedido?");

            if (confirm == JOptionPane.YES_OPTION) {

                int id_pedido = Integer.parseInt(textoCelulaId);

                PedidoController controller = new PedidoController();
                boolean deuCerto = controller.deletarPedido(id_pedido);

                if (deuCerto) {
                    JOptionPane.showMessageDialog(null, "Pedido de código " + id_pedido + " excluído com sucesso!");
                    listar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ação cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Para excluir uma peça, selecione uma linha.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btListaPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaPecasActionPerformed

        if (gridPedidos.getSelectedRow() != -1) { // verifica se tem uma linha selecionada
            int posicaoSelecionada = gridPedidos.getSelectedRow();
            String textoCelulaId = gridPedidos.getValueAt(posicaoSelecionada, 0).toString();
            int id_pedido = Integer.parseInt(textoCelulaId);

            Pedido pedido = new Pedido(); // cria um novo objeto de pedido
            pedido.setId(id_pedido);

            FrListaPecasPedido frListaPecasPedido = new FrListaPecasPedido(); // cria a tela de fala qual pedido deve ser listado
            frListaPecasPedido.setPedido(pedido); // passando o usuário para a outra tela
            frListaPecasPedido.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Para visualizar as peças de um pedido, selecione uma linha.");

        }

    }//GEN-LAST:event_btListaPecasActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        listar();
    }//GEN-LAST:event_btListarActionPerformed

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void btListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btListarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_btListarKeyPressed

    private void cbFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbFiltroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_cbFiltroKeyPressed

    private void cbOrderByKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbOrderByKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_cbOrderByKeyPressed

    private void listar() {
        DefaultTableModel model = (DefaultTableModel) gridPedidos.getModel();
        model.setNumRows(0);

        PedidoController controller = new PedidoController();

        int tipoFiltro = cbFiltro.getSelectedIndex();
        String filtro = txtFiltro.getText();
        int orderBy = cbOrderBy.getSelectedIndex();

        List<Pedido> listaPedidos = controller.listaPedido(tipoFiltro, filtro, orderBy);

        if (!listaPedidos.isEmpty()) { // método retornou algum resultado

            for (Pedido pedido : listaPedidos) {

                Object[] linha = {
                    pedido.getId(),
                    pedido.getNumeroPedido(),
                    pedido.getCliente(),
                    pedido.getValorTotal()
                };
                model.addRow(linha);
            }
        } else { // nenhum resultado
            Object[] linha = {
                "Nenhum resultado para esta pesquisa."
            };
            model.addRow(linha);
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
            java.util.logging.Logger.getLogger(FrListaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrListaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrListaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrListaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrListaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btListaPecas;
    private javax.swing.JButton btListar;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JComboBox<String> cbOrderBy;
    private javax.swing.JTable gridPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtConsultar;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
