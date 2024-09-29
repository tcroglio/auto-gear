package model;

/**
 * @author tiago
 */
public class Peca {

    private int id;
    private String codigoInterno;
    private String nome;
    private String descricao;
    private String marca;
    private double preco;
    private int quantidadeEstoque;

    // construtor vazio
    public Peca() {
    }

    // construtor utilizado na tela de criação de pedido
    public Peca(String codigoInterno, String nome, double preco, int quantidadeEstoque, String marca) {
        this.codigoInterno = codigoInterno;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.marca = marca;
    }

    // construtor utilizado na tela de criação de pedido
    public Peca(int id, String codigoInterno, String nome, double preco, int quantidadeEstoque, String marca) {
        this.id = id;
        this.codigoInterno = codigoInterno;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.marca = marca;
    }

    // construtor completo
    public Peca(int id, String codigoInterno, String nome, String descricao, String marca, double preco, int quantidadeEstoque, double peso) {
        this.id = id;
        this.codigoInterno = codigoInterno;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoPeca) {
        this.codigoInterno = codigoPeca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
