/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.PecaController;
import javax.swing.JOptionPane;
import model.Peca;

/**
 * @author tiago
 */
public class FrCadastrarPeca extends javax.swing.JFrame {

    /**
     * Creates new form FrCadastrarPeca
     */
    public FrCadastrarPeca() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodInterno = new javax.swing.JTextField();
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

        jCheckBox1.setText("jCheckBox1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRAR PEÇA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));
        jPanel1.add(txtCodInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 71, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 370, -1));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 500, 160));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 200, -1));

        jLabel2.setText("NOME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 37, -1));

        jLabel3.setText("DESCRIÇÃO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 71, -1));

        jLabel4.setText("CÓDIGO INTERNO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("MARCA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 50, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ESTOQUE"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("PREÇO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 43, 70, -1));
        jPanel2.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 65, 71, -1));
        jPanel2.add(txtQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 127, 71, -1));

        jLabel7.setText("QUANTIDADE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 105, -1, -1));

        jButton2.setText("Visualizar Estoque");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        btnVisualizarEstoque.setText("VISUALIZAR ESTOQUE");
        jPanel2.add(btnVisualizarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 190, 240));

        btnCancelar.setText("CANCELAR");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (verificaCampos()) {
            gravar();
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void gravar() {
        Peca peca = new Peca();
        peca.setCodigoInterno(txtCodInterno.getText());
        peca.setNome(txtNome.getText());
        peca.setDescricao(txtDescricao.getText());
        peca.setMarca(txtMarca.getText());

        // Converte o texto do campo de preço para double
        try {
            double preco = Double.parseDouble(txtPreco.getText());
            peca.setPreco(preco);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O campo preço deve conter um valor numérico válido.");
            return;
        }

        // Converte o texto do campo de quantidade para int
        try {
            int quantidade = Integer.parseInt(txtQuant.getText());
            peca.setQuantidadeEstoque(quantidade);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O campo quantidade deve conter um número inteiro válido.");
            return;
        }

        // Chama o controller para salvar a peça
        PecaController controller = new PecaController();
        boolean confirm = controller.cadastrarPeca(peca);

        if (confirm) {
            JOptionPane.showMessageDialog(null, "Peça " + peca.getNome() + " cadastrada com sucesso!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao inserir a peça.");
        }
    }

    public boolean verificaCampos() {
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo nome deve ser preenchido.");
            return false;

        } else if (!txtNome.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null, "O campo nome possui caracteres inválidos.");
            return false;

        } else if (txtMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo marca deve ser preenchido.");
            return false;

        } else if (!txtMarca.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null, "O campo marca possui caracteres inválidos.");
            return false;

        } else if (txtPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo preço deve ser preenchido.");
            return false;

        } else if (!txtPreco.getText().matches("^\\d+(\\.\\d{1,2})?$")) {
            JOptionPane.showMessageDialog(null, "O campo preço deve conter um valor numérico válido com até 2 casas decimais.");
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

        } else if (txtCodInterno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo código interno deve ser preenchido.");
            return false;

        } else if (!txtCodInterno.getText().matches("^[a-zA-Z0-9]+$")) {
            JOptionPane.showMessageDialog(null, "O campo código interno deve conter apenas letras e números.");
            return false;
        }

        return true;
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
            java.util.logging.Logger.getLogger(FrCadastrarPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadastrarPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadastrarPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadastrarPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCadastrarPeca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVisualizarEstoque;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField txtCodInterno;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables
}
