package view;

import controller.DbConnection;
import controller.PedidoController;
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
        txtIdPeca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        btRemoverPeca = new javax.swing.JButton();
        btCriarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtConsultar.setForeground(new java.awt.Color(255, 102, 51));
        txtConsultar.setText("CRIAR PEDIDO Nº");

        txtNumeroPedido.setEditable(false);

        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Nome do Cliente");

        gridPecas.setBackground(new java.awt.Color(51, 51, 51));
        gridPecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço", "Estoque", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(gridPecas);

        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Peças");

        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("Código da Peça");

        btAdicionar.setForeground(new java.awt.Color(255, 102, 51));
        btAdicionar.setText("ADICIONAR");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btRemoverPeca.setForeground(new java.awt.Color(255, 102, 51));
        btRemoverPeca.setText("REMOVER PEÇA");

        btCriarPedido.setForeground(new java.awt.Color(255, 102, 51));
        btCriarPedido.setText("CRIAR PEDIDO");
        btCriarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIdPeca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRemoverPeca)
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCriarPedido)
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar)
                    .addComponent(btRemoverPeca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCriarPedido)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btCriarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarPedidoActionPerformed
        gravar();
    }//GEN-LAST:event_btCriarPedidoActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        String idPecaStr = txtIdPeca.getText(); // Supondo que haja um campo de texto para o ID da peça
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
        } else {
            JOptionPane.showMessageDialog(this, "Peça não encontrada.");
        }

    }//GEN-LAST:event_btAdicionarActionPerformed

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

    private void verNumeroAtual() {
        String sql = "SELECT * FROM tbl_pedidos ORDER BY id DESC LIMIT 1";

        DbConnection gerenciador = new DbConnection();
        PreparedStatement comando = null;
        ResultSet resultado = null;
        Integer ultimoNumero = 0;
        try {
            comando = gerenciador.prepararComando(sql); // prepara o comando
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

    private double calculaPrecoTotal(DefaultTableModel model) {
        double precoTotal = 0.0;

        for (int i = 0; i < model.getRowCount(); i++) {
            Object valorPreco = model.getValueAt(i, 3);

            if (valorPreco instanceof Number) {
                precoTotal += ((Number) valorPreco).doubleValue(); // Acumula o preço
            }
        }

        return precoTotal; // Retorna o preço total
    }

    private List<Peca> obterListaPecas() {
        List<Peca> listaPecas = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();

        // Percorre todas as linhas do modelo
        for (int i = 0; i < model.getRowCount(); i++) {
            // Obtém os valores das colunas
            int id = (int) model.getValueAt(i, 0); // Supondo que a coluna 0 contém o ID
            String codigoInterno = (String) model.getValueAt(i, 1); // Código interno na coluna 1
            String nome = (String) model.getValueAt(i, 2); // Nome na coluna 2
            String descricao = (String) model.getValueAt(i, 3); // Descrição na coluna 3
            String marca = (String) model.getValueAt(i, 4); // Marca na coluna 4
            double preco = (double) model.getValueAt(i, 5); // Preço na coluna 5
            int quantidadeEstoque = (int) model.getValueAt(i, 6); // Quantidade em estoque na coluna 6

            // Cria um novo objeto Peca e adiciona à lista
            Peca peca = new Peca(id, codigoInterno, nome, descricao, marca, preco, quantidadeEstoque);
            listaPecas.add(peca);
        }

        return listaPecas; // Retorna a lista de peças
    }

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
                        resultado.getString("descricao"),
                        resultado.getString("marca"),
                        resultado.getDouble("preco"),
                        resultado.getInt("quantidadeEstoque")
                );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar peça: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return null; // Retorna null se não encontrar a peça
    }

    private void adicionarLinhaNaTabela(Peca peca) {
        DefaultTableModel model = (DefaultTableModel) gridPecas.getModel();

        Object[] linha = {
            peca.getCodigoInterno(),
            peca.getNome(),
            peca.getPreco(),
            peca.getQuantidadeEstoque(),
            peca.getMarca()
        };
        model.addRow(linha);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtConsultar;
    private javax.swing.JTextField txtIdPeca;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroPedido;
    // End of variables declaration//GEN-END:variables
}
