package view;

import controller.PecaController;
import controller.UserController;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Peca;

/**
 * @author s.lucas
 */
public class FrListaPecas extends javax.swing.JFrame {

    /**
     * Creates new form FrLIstaPecas
     */
    public FrListaPecas() {
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbConsultar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridPecas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btFiltrar = new javax.swing.JButton();
        lbFiltro = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        cbFiltro = new javax.swing.JComboBox<>();
        cbOrderBy = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("ORDENAR");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbConsultar.setForeground(new java.awt.Color(255, 102, 51));
        lbConsultar.setText("CONSULTAR PEÇAS");
        jPanel1.add(lbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setForeground(new java.awt.Color(255, 102, 51));

        gridPecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código Interno", "Nome", "Estoque", "Preço", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
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
        if (gridPecas.getColumnModel().getColumnCount() > 0) {
            gridPecas.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 710, 350));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btExcluir.setBackground(new java.awt.Color(51, 51, 51));
        btExcluir.setForeground(new java.awt.Color(255, 102, 51));
        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(51, 51, 51));
        btEditar.setForeground(new java.awt.Color(255, 102, 51));
        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("FUNÇÕES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 140, 140));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        btFiltrar.setBackground(new java.awt.Color(51, 51, 51));
        btFiltrar.setForeground(new java.awt.Color(255, 102, 51));
        btFiltrar.setText("FILTRAR");
        btFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltrarActionPerformed(evt);
            }
        });
        btFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btFiltrarKeyPressed(evt);
            }
        });

        lbFiltro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFiltro.setForeground(new java.awt.Color(255, 102, 51));
        lbFiltro.setText("FILTRO");

        txtFiltro.setBackground(new java.awt.Color(153, 153, 153));
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

        cbFiltro.setBackground(new java.awt.Color(51, 51, 51));
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Cód. Interno", "Marca", "Estoque > que", "Estoque < que", "Preço > que", "Preço < que" }));
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });
        cbFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbFiltroKeyPressed(evt);
            }
        });

        cbOrderBy.setBackground(new java.awt.Color(51, 51, 51));
        cbOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "ID DESC", "Cod. Interno", "Cod. Intero DESC", "Nome A-Z", "Nome Z-A", "Estoque <", "Estoque >", "Preço <", "Preço >", "Marca A-Z", "Marca Z-A" }));
        cbOrderBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrderByActionPerformed(evt);
            }
        });
        cbOrderBy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbOrderByKeyPressed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("ORDENAR");

        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("BUSCAR POR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 380, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        if (gridPecas.getSelectedRow() != -1) {
            int posicaoSelecionada = gridPecas.getSelectedRow();
            String textoCelulaId = gridPecas.getValueAt(posicaoSelecionada, 0).toString();

            int confirm = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esta peça?");

            if (confirm == JOptionPane.YES_OPTION) {

                int id_peca = Integer.parseInt(textoCelulaId);

                PecaController controller = new PecaController();
                boolean deuCerto = controller.deletarPeca(id_peca);

                if (deuCerto) {
                    JOptionPane.showMessageDialog(null, "Peça de código " + id_peca + " excluída com sucesso!");
                    listar();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ação cancelada.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Para excluir uma peça, selecione uma linha.");

        }


    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:

        if (gridPecas.getSelectedRow() != -1) {
            int posicaoSelecionada = gridPecas.getSelectedRow();
            String textoCelulaId = gridPecas.getValueAt(posicaoSelecionada, 0).toString();
            int id_peca = Integer.parseInt(textoCelulaId);

            Peca peca = new Peca();
            peca.setId(id_peca);

            FrAltPeca frAltPeca = new FrAltPeca();
            frAltPeca.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent e) {
                    listar();  // Atualiza a tabela chamando o método listar
                }
            });

            frAltPeca.setVisible(true);
            frAltPeca.setPeca(peca); // passando o objeto da peça para a outra tela

        } else {
            JOptionPane.showMessageDialog(null, "Para editar uma peça, selecione uma linha.");

        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void btFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltrarActionPerformed
        listar();
    }//GEN-LAST:event_btFiltrarActionPerformed

    private void cbOrderByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrderByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrderByActionPerformed

    private void btFiltrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btFiltrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_btFiltrarKeyPressed

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

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_txtFiltroKeyPressed

    public void listar() {
        DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();
        model.setNumRows(0);

        PecaController controller = new PecaController();

        int tipoFiltro = cbFiltro.getSelectedIndex();
        String filtro = txtFiltro.getText();
        int orderBy = cbOrderBy.getSelectedIndex();

        List<Peca> listaPecas = controller.listaPecas(tipoFiltro, filtro, orderBy);

        if (!listaPecas.isEmpty()) { // método retornou algum resultado

            for (Peca peca : listaPecas) {

                Object[] linha = {
                    peca.getId(),
                    peca.getCodigoInterno(),
                    peca.getNome(),
                    peca.getQuantidadeEstoque(),
                    peca.getPreco(),
                    peca.getMarca()
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

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrListaPecas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrListaPecas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrListaPecas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrListaPecas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrListaPecas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFiltrar;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JComboBox<String> cbOrderBy;
    private javax.swing.JTable gridPecas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JLabel lbFiltro;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
