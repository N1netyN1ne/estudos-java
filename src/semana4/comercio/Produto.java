package semana4.comercio;

public class Produto {
    public Produto(){}
    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean reporEstoque(int quantidade){
        if(quantidade > 0){
            this.quantidadeEstoque+=quantidade;
            return true;
        }else{
            System.out.println("Insira uma quantidade maior que 0");
            return false;
        }
    }

    public boolean vender(int quantidade){
        if(this.quantidadeEstoque >= quantidade){
            this.quantidadeEstoque -=quantidade;
            return true;
        }else{
            System.out.println("Estoque insuficiente");
            return false;
        }
    }

    public void exibirInfo(){
        System.out.println("Produto: "+this.nome+"\nPreco: "+this.preco+"\nQuantidade em estoque: "+this.quantidadeEstoque);
    }
}
