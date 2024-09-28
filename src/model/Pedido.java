package model;

import java.util.List;

public class Pedido {

    private String numeroPedido;
    private String cliente;
    private List<Peca> pecas;
    private double valorTotal;

    // Construtor da classe Pedido
    public Pedido() {
    }

    // Método para adicionar uma peça ao pedido
    public void adicionarPeca(Peca peca) {
        this.pecas.add(peca);
        this.valorTotal += peca.getPreco(); // Atualiza o valor total ao adicionar peça
    }

    // Método para remover uma peça do pedido
    public void removerPeca(Peca peca) {
        if (this.pecas.remove(peca)) {
            this.valorTotal -= peca.getPreco(); // Atualiza o valor total ao remover peça
        }
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    

    // Método para exibir os detalhes do pedido
    public void exibirDetalhesPedido() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Peças no pedido: ");
        for (Peca peca : pecas) {
            System.out.println("- " + peca.getNome() + " (Preço: " + peca.getPreco() + ")");
        }
        System.out.println("Valor total: " + valorTotal);
    }
    
}