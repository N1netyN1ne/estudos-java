package semana1a3;

import javax.sound.midi.SysexMessage;

public class Semana1Variaveis {
    public static void main(String[] args){
        //BLOCO A - Variaveis e tipos
        System.out.println("Inicio dos testes de variáveis em java :)");
        String nome = "Ryan";
        int idade = 24;
        boolean estudante = true;
        String curso = "ciência da computação";
        int semestre = 7;
        double altura = 1.75;
        double peso = 60;

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("É estudante? "+estudante);
        System.out.println("Curso: "+curso);
        System.out.println("Semestre: "+semestre);

        System.out.println("Altura: "+altura+"m");
        System.out.println("Peso: "+peso+"Kg");

        //BLOCO B Operadores aritiméticos em Java
        int a = 10;
        int b = 3;
        double precoProduto1 = 50;
        double precoProduto2 = 30;
        double salario = 2743;



        int soma = a+b;
        int subtracao = a-b;
        int multiplicacao = a*b;
        double divisao = (double) a/b;
        int resto = a%b;
        double total = precoProduto1+precoProduto2;
        double valorHora = salario/198;

        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Multiplicação: "+multiplicacao);
        System.out.println("Divisão: "+divisao);
        System.out.println("Resto: "+resto);
        System.out.println("Total da compra: R$"+total);
        System.out.println("Valor da hora: R$"+valorHora);

        //BLOCO C - Operadores de comparação em Java
        int x = 10;
        int y = 20;
        int idadeMinima = 18;
        int idadeUsuario = 16;
        String senhaCorreta = "1234";
        String senhaDigitada = "12345";

        System.out.println("x > y? "+(x>y));
        System.out.println("x < y? "+(x<y));
        System.out.println("x == 10? "+(x==10));
        System.out.println("x != 10?"+(x!=10));
        System.out.println("y >= 20? "+(y>=20));
        System.out.println("y < 15? "+(y<=15));

        System.out.println("Pode dirigir ?"+ (idadeUsuario>=idadeMinima));
        System.out.println("Senha correta: "+senhaCorreta);
        System.out.println("Senha digitada:"+senhaDigitada);

        //Bloco D Operadores lógicos em Java
        int idadePessoa = 20;
        boolean temCarteira = true;

        boolean podeDirigir = idadePessoa >= 18 && temCarteira;
        System.out.println("Pode dirigir ? "+podeDirigir);

        boolean temRG = false;
        boolean podeEntrarNoEvento = idadePessoa >=18 || temRG;

        System.out.println("Pode entrar no evento ? "+podeEntrarNoEvento);

        boolean chovendo = true;
        System.out.println("Não está chovendo ?"+!chovendo);

        boolean temIngresso = true;
        boolean nomeNaLista = false;

        boolean podeEntrar=  temIngresso || nomeNaLista;
        System.out.println("Pode entrar? "+podeEntrar);

        boolean maiorDeIdade = true;
        boolean acompanhadoResponsavel = false;

        boolean podeVerFilme = maiorDeIdade || acompanhadoResponsavel;
        System.out.println("Pode ver o filme ? "+ podeVerFilme);

        int idadeCliente = 17;
        boolean temCarteiraEstudante = true;
        double precoInteira = 40;
        double meiaEntrada = precoInteira/2;
        boolean temDireitoMeia = idadeCliente < 18 || temCarteiraEstudante == true;
        double precoFinal;

        if(temDireitoMeia){
            precoFinal = meiaEntrada;
        }else{
            precoFinal = precoInteira;
        }

        System.out.println("Idade do cliente: "+idadeCliente);
        System.out.println("Carte de estudante: "+ temCarteiraEstudante);
        System.out.println("Tem direito à meia? "+temDireitoMeia);
        System.out.println("Preço a pagar: R$ "+precoFinal);

    }
}
