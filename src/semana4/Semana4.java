package semana4;

public class Semana4 {
    public  static  void main(String[] args){
        System.out.println();
        //Classe Pessoa
        Pessoa p1 = new Pessoa("Ryan",24);
        Pessoa p2 = new Pessoa("Leonardo",23);
        Pessoa p3 = new Pessoa("Noelia",18);

        p1.apresentar();
        p2.apresentar();
        p3.apresentar();

        Pessoa p4 = new Pessoa("Pedro",-2);
        System.out.println(p4.getIdade());

        //Classe ContaBancaria
        System.out.println();

        ContaBancaria c1 = new ContaBancaria("Ryan");
        c1.depositar(3000);
        c1.sacar(500);

        c1.exibirSaldo();
        c1.sacar(40000);
        c1.depositar(-20);

        //Classe Produto
        System.out.println();

        Produto prod1 = new Produto("Banana",10,10);
        Produto prod2 = new Produto("Maçã",8,20);
        Produto prod3 = new Produto("Pera",5,3);

        prod1.reporEstoque(10);
        prod1.vender(2);
        prod1.exibirInfo();

        prod2.reporEstoque(5);
        prod2.vender(7);
        prod2.exibirInfo();

        prod3.reporEstoque(3);
        prod3.vender(4);
        prod3.exibirInfo();

        //Classe Aluno / Curso
        System.out.println();

        Curso curso1 = new Curso("tendencia em ciência da computação");
        Aluno a1 = new Aluno("Ryan",9.5);
        Aluno a2 = new Aluno("Leo",6);

        curso1.adicionarAluno(a1);
        curso1.adicionarAluno(a2);

        curso1.listarAlunos();

        System.out.println("Media da turma: "+curso1.calcularMediaDaTurma());
        curso1.listarAprovados(6);

        //Mini-sistema loja
        Produto produto1 = new Produto("Queijo mussarela",50,5);
        Produto produto2 = new Produto("Presunto",30,10);
        Produto produto3 = new Produto("Pão",0.25,100);

        CarrinhoDeCompra carrinho1 = new CarrinhoDeCompra();

        carrinho1.adicionarProduto(produto1);
        carrinho1.adicionarProduto(produto2);
        carrinho1.adicionarProduto(produto3);

        carrinho1.listarProdutos();
        System.out.println("Total da compra: R$"+carrinho1.calcularTotal());












    }
}
