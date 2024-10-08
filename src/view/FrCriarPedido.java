package view;

import controller.DbConnection;
import controller.PedidoController;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Peca;
import model.Pedido;

/**
 * @author s.lucas
 */
public class FrCriarPedido extends javax.swing.JFrame {

    /**
     * Creates new form FrCriarPedido
     */
    public FrCriarPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
        verNumeroAtual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtConsultar = new javax.swing.JLabel();
        txtNumeroPedido = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridPecas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btCriarPedido = new javax.swing.JButton();
        txtValorTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btRemoverPeca = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        txtIdPeca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConsultar.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        txtConsultar.setForeground(new java.awt.Color(255, 102, 51));
        txtConsultar.setText("CRIAR PEDIDO ");
        jPanel2.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 30));

        txtNumeroPedido.setEditable(false);
        txtNumeroPedido.setBackground(new java.awt.Color(220, 220, 220));
        jPanel2.add(txtNumeroPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        txtNomeCliente.setBackground(new java.awt.Color(220, 220, 220));
        jPanel2.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 296, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Valor Total");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        gridPecas.setBackground(new java.awt.Color(220, 220, 220));
        gridPecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código", "Nome", "Preço", "Estoque", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPane2.setViewportView(gridPecas);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 490, 155));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Peças");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        btCriarPedido.setBackground(new java.awt.Color(220, 220, 220));
        btCriarPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCriarPedido.setText("CRIAR ");
        btCriarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarPedidoActionPerformed(evt);
            }
        });
        jPanel2.add(btCriarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 110, 40));

        txtValorTotal.setEditable(false);
        txtValorTotal.setBackground(new java.awt.Color(220, 220, 220));
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });
        jPanel2.add(txtValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 51));
        jLabel8.setText("Nome do Cliente");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btRemoverPeca.setBackground(new java.awt.Color(220, 220, 220));
        btRemoverPeca.setText("REMOVER");
        btRemoverPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverPecaActionPerformed(evt);
            }
        });
        jPanel3.add(btRemoverPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        btAdicionar.setBackground(new java.awt.Color(220, 220, 220));
        btAdicionar.setText("ADICIONAR");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        jPanel3.add(btAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        txtIdPeca.setBackground(new java.awt.Color(220, 220, 220));
        txtIdPeca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdPecaKeyPressed(evt);
            }
        });
        jPanel3.add(txtIdPeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 115, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("Código da Peça");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jButton1.setBackground(new java.awt.Color(220, 220, 220));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 30, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("AÇÕES");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 360, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Número");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Preview.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //--------------------------------------------------------------------------------------//

    private void btCriarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarPedidoActionPerformed
        if (validaCampos()) {
            gravar();
        }
    }//GEN-LAST:event_btCriarPedidoActionPerformed
    //--------------------------------------------------------------------------------------//

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        addpeca();
    }//GEN-LAST:event_btAdicionarActionPerformed
    //--------------------------------------------------------------------------------------//

    private void btRemoverPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverPecaActionPerformed
        removerPecaDoPedido();
    }//GEN-LAST:event_btRemoverPecaActionPerformed
    //--------------------------------------------------------------------------------------//

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrListaPecas frlistpecas = new FrListaPecas();

        frlistpecas.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdPecaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPecaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addpeca();
        }
    }//GEN-LAST:event_txtIdPecaKeyPressed
    //--------------------------------------------------------------------------------------//

    private void addpeca() {
        String idPecaStr = txtIdPeca.getText();
        if (idPecaStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, informe o ID da peça.");
            return;
        }

        int idPeca;
        try {
            idPeca = Integer.parseInt(idPecaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Por favor, insira um número válido.");
            return;
        }

        Peca peca = buscarPecaPorId(idPeca);
        if (peca != null) {
            adicionarLinhaNaTabela(peca);

            // recalcula o valor que está no text field "txtValorTotal"
            DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();
            txtValorTotal.setText(String.valueOf(calculaPrecoTotal(model)));

        } else {
            JOptionPane.showMessageDialog(this, "Peça não encontrada.");
        }

    }
    //--------------------------------------------------------------------------------------//

    private void gravar() {

        Pedido pedido = new Pedido();

        pedido.setNumeroPedido(txtNumeroPedido.getText());
        pedido.setCliente(txtNomeCliente.getText());
        DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();
        pedido.setValorTotal(calculaPrecoTotal(model));

        PedidoController controller = new PedidoController();
        boolean confirm = controller.cadastrarPedido(pedido, obterListaPecas());

        if (confirm) {
            JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao inserir a peça.");
        }

    }
    //--------------------------------------------------------------------------------------//

    private void verNumeroAtual() {
        String sql = "SELECT * FROM tbl_pedidos ORDER BY id DESC LIMIT 1";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;
        ResultSet resultado = null;
        Integer ultimoNumero = 0;
        try {
            comando = gerenciador.prepararComando(sql);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                ultimoNumero = resultado.getInt("numeroPedido");
                ultimoNumero++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        txtNumeroPedido.setText(ultimoNumero.toString());
    }
    //--------------------------------------------------------------------------------------//

    private double calculaPrecoTotal(DefaultTableModel model) {
        double precoTotal = 0.0;

        for (int i = 0; i < model.getRowCount(); i++) { // itera sobre todas as linhas da tabela
            Object valorPreco = model.getValueAt(i, 3);

            precoTotal += ((Number) valorPreco).doubleValue();
        }

        return precoTotal;
    }
    //--------------------------------------------------------------------------------------//

    private List<Peca> obterListaPecas() {
        List<Peca> listaPecas = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();

        for (int i = 0; i < model.getRowCount(); i++) { // itera sobre todas as linhas da tabela
            int id = (int) model.getValueAt(i, 0);
            String codigoInterno = (String) model.getValueAt(i, 1);
            String nome = (String) model.getValueAt(i, 2);
            double preco = (double) model.getValueAt(i, 3);
            int quantidadeEstoque = (int) model.getValueAt(i, 4);
            String marca = (String) model.getValueAt(i, 5);

            // Cria um novo objeto Peca e adiciona à lista
            Peca peca = new Peca(id, codigoInterno, nome, preco, quantidadeEstoque, marca);
            listaPecas.add(peca);
        }

        return listaPecas; // Retorna a lista de peças
    }
    //--------------------------------------------------------------------------------------//

    private Peca buscarPecaPorId(int id) {
        String sql = "SELECT * FROM tbl_peca WHERE id = ?";
        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id);
            resultado = comando.executeQuery();

            if (resultado.next()) {
                // Cria uma nova peça a partir dos dados retornados
                return new Peca(
                        resultado.getInt("id"),
                        resultado.getString("codigoInterno"),
                        resultado.getString("nome"),
                        resultado.getDouble("preco"),
                        resultado.getInt("quantidadeEstoque"),
                        resultado.getString("marca")
                );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar peça: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return null; // Retorna null se não encontrar a peça
    }
    //--------------------------------------------------------------------------------------//

    private void adicionarLinhaNaTabela(Peca peca) {
        DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();

        Object[] linha = {
            peca.getId(),
            peca.getCodigoInterno(),
            peca.getNome(),
            peca.getPreco(),
            peca.getQuantidadeEstoque(),
            peca.getMarca()
        };
        model.addRow(linha);
    }
    //--------------------------------------------------------------------------------------//

    private void removerPecaDoPedido() {

        if (gridPecas.getSelectedRow() != -1) {
            int posicaoSelecionada = gridPecas.getSelectedRow();
            int confirm = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja remover esta peça do pedido?");

            if (confirm == JOptionPane.YES_OPTION) {

                DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();
                model.removeRow(posicaoSelecionada);
                txtValorTotal.setText(String.valueOf(calculaPrecoTotal(model)));

            } else {
                JOptionPane.showMessageDialog(null, "Ação cancelada.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Para remover uma peça do pedido, selecione uma linha.");

        }

    }
    //--------------------------------------------------------------------------------------//

    private boolean validaCampos() {
        // Verifica se o campo "Nome do Cliente" está vazio
        if (txtNomeCliente.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Nome do Cliente' é obrigatório.");
            return false;
        }

        // Verifica se há pelo menos uma linha na tabela de peças
        DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Adicione pelo menos uma peça ao pedido.");
            return false;
        }

        // Se tudo estiver correto, retorna true
        return true;
    }

    //--------------------------------------------------------------------------------------//
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
            java.util.logging.Logger.getLogger(FrCriarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCriarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCriarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCriarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCriarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCriarPedido;
    private javax.swing.JButton btRemoverPeca;
    private javax.swing.JTable gridPecas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtConsultar;
    private javax.swing.JTextField txtIdPeca;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
