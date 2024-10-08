package view;

import controller.DbConnection;
import controller.PecaController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Peca;
import utils.Utils;

/**
 * @author tiago
 */
public class FrAltPeca extends javax.swing.JFrame {

    private Peca peca;

    public FrAltPeca() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoPeca = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtQuant = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnVisualizarEstoque = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("EDITAR PEÇA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtCodigoPeca.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.add(txtCodigoPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 71, -1));

        txtNome.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 370, -1));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        txtDescricao.setBackground(new java.awt.Color(220, 220, 220));
        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 450, 160));

        txtMarca.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 200, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("NOME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 50, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("DESCRIÇÃO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("CÓDIGO INTERNO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("MARCA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 70, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("PREÇO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, -1));

        txtPreco.setBackground(new java.awt.Color(220, 220, 220));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, -1));

        txtQuant.setEditable(false);
        txtQuant.setBackground(new java.awt.Color(220, 220, 220));
        jPanel2.add(txtQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("QUANTIDADE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jButton2.setText("Visualizar Estoque");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        btnVisualizarEstoque.setBackground(new java.awt.Color(220, 220, 220));
        btnVisualizarEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVisualizarEstoque.setText("VISUALIZAR");
        btnVisualizarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarEstoqueActionPerformed(evt);
            }
        });
        jPanel2.add(btnVisualizarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 180, 240));

        btnCancelar.setBackground(new java.awt.Color(220, 220, 220));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 110, 30));

        btnConfirmar.setBackground(new java.awt.Color(220, 220, 220));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Preview.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVisualizarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarEstoqueActionPerformed
        FrListaPecas frlistpecas = new FrListaPecas();

        frlistpecas.setVisible(true);
    }//GEN-LAST:event_btnVisualizarEstoqueActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (verificaCampos()) {
            alterarPeca();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String sql = "SELECT * FROM tbl_peca WHERE id = ?";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            comando = gerenciador.prepararComando(sql); // prepara o comando
            comando.setInt(1, peca.getId());
            resultado = comando.executeQuery();

            if (resultado.next()) { // Mover o cursor para a primeira linha

                txtCodigoPeca.setText(Integer.toString(resultado.getInt("id")));
                txtCodigoPeca.setText(resultado.getString("codigoInterno"));
                txtNome.setText(resultado.getString("nome"));
                txtMarca.setText(resultado.getString("marca"));
                txtDescricao.setText(resultado.getString("descricao"));
                txtPreco.setText(Double.toString(resultado.getDouble("preco")));
                txtQuant.setText(Integer.toString(resultado.getInt("quantidadeEstoque")));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar usuário: " + ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);

        }


    }//GEN-LAST:event_formWindowOpened

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    public void alterarPeca() {
        peca.setCodigoInterno(txtCodigoPeca.getText());
        peca.setNome(txtNome.getText());
        peca.setMarca(txtMarca.getText());
        peca.setDescricao(txtDescricao.getText());
        peca.setPreco(Double.parseDouble(txtPreco.getText()));
        peca.setQuantidadeEstoque(Integer.parseInt(txtQuant.getText()));

        PecaController controller = new PecaController();

        if (controller.editarPeca(peca)) {
            JOptionPane.showMessageDialog(null, "Peça " + peca.getNome() + " editada com sucesso!");
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Houve um erro ao editar a peça! Tente novamente.");
        }

    }

    public boolean verificaCampos() {
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo nome deve ser preenchido.");
            return false;

        } else if (!txtNome.getText().matches("^[\\p{L}\\d ]+$")) {
            JOptionPane.showMessageDialog(null, "O campo nome possui caracteres inválidos.");
            return false;

        } else if (txtMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo marca deve ser preenchido.");
            return false;

        } else if (!txtMarca.getText().matches("^[\\p{L}\\d ]+$")) {
            JOptionPane.showMessageDialog(null, "O campo marca possui caracteres inválidos.");
            return false;

        } else if (txtPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo preço deve ser preenchido.");
            return false;

        } else if (!txtPreco.getText().matches("^\\d+(\\.\\d{1,2})?$")) {
            JOptionPane.showMessageDialog(null, "O campo preço deve conter um valor numérico válido com até 2 casas decimais. \nEXEMPLO: 1990.90");
            return false;

        } else if (txtQuant.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo quantidade deve ser preenchido.");
            return false;

        } else if (!txtQuant.getText().matches("^\\d+$")) {
            JOptionPane.showMessageDialog(null, "O campo quantidade deve conter apenas números inteiros.");
            return false;

        } else if (txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo descrição deve ser preenchido.");
            return false;

        } else if (txtCodigoPeca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo código interno deve ser preenchido.");
            return false;

        } else if (!txtCodigoPeca.getText().matches("^[a-zA-Z0-9]+$")) {
            JOptionPane.showMessageDialog(null, "O campo código interno deve conter apenas letras e números.");
            return false;
        }

        return true;
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
            java.util.logging.Logger.getLogger(FrAltPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAltPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAltPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAltPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrAltPeca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVisualizarEstoque;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCodigoPeca;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables
}
