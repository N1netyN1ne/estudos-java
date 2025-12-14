package semana4;

import java.util.ArrayList;

public class CarrinhoDeCompra {
    CarrinhoDeCompra(){}
    private ArrayList<Produto> ListaDeProdutos = new ArrayList<Produto>();

    public ArrayList<Produto> getListaDeProdutos() {
        return ListaDeProdutos;
    }

    public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
        ListaDeProdutos = listaDeProdutos;
    }

    public boolean adicionarProduto(Produto produto){
        return ListaDeProdutos.add(produto);
    }

    public double calcularTotal(){
        double soma=0;

        for(Produto produto:ListaDeProdutos){
            soma+= produto.getPreco();
        }
        return soma;
    }

    public void listarProdutos(){
        System.out.println("===Carrinho===");
        for(Produto produto:ListaDeProdutos){
            System.out.println("Produto: "+produto.getNome()+"\nPreço: "+produto.getPreco());
        }
    }



}
