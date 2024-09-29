package view;

import controller.PedidoController;
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

        txtConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtConsultar.setForeground(new java.awt.Color(255, 102, 51));
        txtConsultar.setText("CONSULTAR PEDIDO");
        jPanel1.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 30));

        gridPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Número Pedido", "Cliente", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(gridPedidos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 450, 155));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("ORDENAR");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        txtFiltro.setBackground(new java.awt.Color(153, 153, 153));
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        jPanel2.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 42, 170, -1));

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENTE", "CÓDIGO" }));
        jPanel2.add(cbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        cbOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CÓDIGO", "CLIENTE", "VALOR" }));
        jPanel2.add(cbOrderBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        btListar.setForeground(new java.awt.Color(255, 102, 51));
        btListar.setText("BUSCAR");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });
        jPanel2.add(btListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("FILTRO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("BUSCAR POR");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 340, 140));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btExcluir.setForeground(new java.awt.Color(255, 102, 51));
        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btListaPecas.setForeground(new java.awt.Color(255, 102, 51));
        btListaPecas.setText("LISTAR PEÇAS");
        btListaPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaPecasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("FUNÇÕES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btListaPecas)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir)
                .addGap(18, 18, 18)
                .addComponent(btListaPecas)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 150, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Preview.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
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

                int numeroPedido = Integer.parseInt(textoCelulaId);

                PedidoController controller = new PedidoController();
                boolean deuCerto = controller.deletarPedido(numeroPedido);

                if (deuCerto) {
                    JOptionPane.showMessageDialog(null, "Pedido de código " + numeroPedido + " excluído com sucesso!");
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
            String textoCelulaNumeroPedido = gridPedidos.getValueAt(posicaoSelecionada, 0).toString();

            Pedido pedido = new Pedido(); // cria um novo objeto de pedido
            pedido.setNumeroPedido(textoCelulaNumeroPedido);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_btListarActionPerformed

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
