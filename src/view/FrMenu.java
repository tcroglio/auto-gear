package view;

import javax.swing.JOptionPane;

/**
 * @author tiago
 */
public class FrMenu extends javax.swing.JFrame {

    public FrMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menCadastrar = new javax.swing.JMenu();
        CadUsuario = new javax.swing.JMenuItem();
        CadPecas = new javax.swing.JMenuItem();
        menConsultar = new javax.swing.JMenu();
        ConsUsuario = new javax.swing.JMenuItem();
        ConsPecas = new javax.swing.JMenuItem();
        menPedido = new javax.swing.JMenu();
        PedCriar = new javax.swing.JMenuItem();
        PedConsultar = new javax.swing.JMenuItem();
        menSobre = new javax.swing.JMenu();
        SobreSobre = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(255, 102, 51));

        menCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        menCadastrar.setText("CADASTRAR");
        menCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        CadUsuario.setText("Usuário");
        CadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadUsuarioActionPerformed(evt);
            }
        });
        menCadastrar.add(CadUsuario);

        CadPecas.setText("Peças");
        CadPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadPecasActionPerformed(evt);
            }
        });
        menCadastrar.add(CadPecas);

        jMenuBar1.add(menCadastrar);

        menConsultar.setText("CONSULTAR");
        menConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ConsUsuario.setText("Usuário");
        ConsUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsUsuarioActionPerformed(evt);
            }
        });
        menConsultar.add(ConsUsuario);

        ConsPecas.setText("Peças");
        ConsPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsPecasActionPerformed(evt);
            }
        });
        menConsultar.add(ConsPecas);

        jMenuBar1.add(menConsultar);

        menPedido.setText("PEDIDOS");
        menPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        PedCriar.setText("Criar Pedido");
        PedCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedCriarActionPerformed(evt);
            }
        });
        menPedido.add(PedCriar);

        PedConsultar.setText("Consultar Pedido");
        PedConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedConsultarActionPerformed(evt);
            }
        });
        menPedido.add(PedConsultar);

        jMenuBar1.add(menPedido);

        menSobre.setText("SOBRE");
        menSobre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        SobreSobre.setText("Sobre");
        SobreSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreSobreActionPerformed(evt);
            }
        });
        menSobre.add(SobreSobre);

        jMenuBar1.add(menSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadUsuarioActionPerformed
        FrCadastrarUser cadUser = new FrCadastrarUser();

        cadUser.setVisible(true);
    }//GEN-LAST:event_CadUsuarioActionPerformed

    private void CadPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadPecasActionPerformed

        FrCadastrarPeca cadPeca = new FrCadastrarPeca();

        cadPeca.setVisible(true);

    }//GEN-LAST:event_CadPecasActionPerformed

    private void ConsUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsUsuarioActionPerformed
        FrListaUser frListaUser = new FrListaUser();

        frListaUser.setVisible(true);
    }//GEN-LAST:event_ConsUsuarioActionPerformed

    private void SobreSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreSobreActionPerformed
        FrSobre frSobre = new FrSobre();

        frSobre.setVisible(true);
    }//GEN-LAST:event_SobreSobreActionPerformed

    private void PedCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedCriarActionPerformed
        FrCriarPedido frCriarPedido = new FrCriarPedido();

        frCriarPedido.setVisible(true);
    }//GEN-LAST:event_PedCriarActionPerformed

    private void ConsPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsPecasActionPerformed
        FrListaPecas frListPecas = new FrListaPecas();

        frListPecas.setVisible(true);
    }//GEN-LAST:event_ConsPecasActionPerformed

    private void PedConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedConsultarActionPerformed
        FrListaPedido frListPedido = new FrListaPedido();

        frListPedido.setVisible(true);
    }//GEN-LAST:event_PedConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadPecas;
    private javax.swing.JMenuItem CadUsuario;
    private javax.swing.JMenuItem ConsPecas;
    private javax.swing.JMenuItem ConsUsuario;
    private javax.swing.JMenuItem PedConsultar;
    private javax.swing.JMenuItem PedCriar;
    private javax.swing.JMenuItem SobreSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JMenu menCadastrar;
    private javax.swing.JMenu menConsultar;
    private javax.swing.JMenu menPedido;
    private javax.swing.JMenu menSobre;
    // End of variables declaration//GEN-END:variables
}
