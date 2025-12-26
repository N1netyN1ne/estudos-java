package semana6;

import semana6.banco.ContaBancaria;
import semana6.banco.SaldoInsuficienteException;
import semana6.biblioteca.Livro;
import semana6.calculadora.Calculadora;
import semana6.enums.Operacao;
import semana6.processadordetexto.ProcessadorDeTexto;
import semana6.enums.NivelDificuldade;

import java.util.HashSet;

public class Semana6 {
    public static void main(String[] args){
        //Tratamento de divisão por zero
        try{
            System.out.println(Calculadora.dividir(50,2));
            System.out.println(Calculadora.dividir(10,0));
        } catch (ArithmeticException e){
            System.err.println("Denominador menor ou igual a zero!");
        }

        //Exceção customizada para saque
        System.out.println();
        try{
            ContaBancaria c1 = new ContaBancaria("Ryan");
            c1.depositar(2000);
            c1.sacar(3200);
        }catch (SaldoInsuficienteException e){
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        //Tratamento de NullPointerException
        System.out.println();
        System.out.println(ProcessadorDeTexto.processar("Pedro"));
        System.out.println(ProcessadorDeTexto.processar(null));

        //Enums(Enumerações) para Níveis de Dificuldade
        System.out.println();
        NivelDificuldade nivel = NivelDificuldade.MEDIO;

        for(NivelDificuldade niveis: NivelDificuldade.values()){
            System.out.println("Nivel de dificuldade: " + niveis.getValor() + " " + niveis);
        }

        switch (nivel.getValor()){
            case 1:
                System.out.println("Modo fácil ativado");
                break;
            case 2:
                System.out.println("Modo médio ativado");
                break;
            case 3:
                System.out.println("Modo dificil ativado");
                break;
            case 4:
                System.out.println("Modo muito dificil ativado");
                break;
            default:
                break;
        }

        //Enum para Operações matemáticas

        System.out.println("Soma de 10 + 5: " + Operacao.SOMA.executar(10,5));
        System.out.println("Subtração de 20 - 35: " + Operacao.SUBTRACAO.executar(20,35));
        System.out.println("Multiplicação de 40 * 87: " + Operacao.MULTIPLICACAO.executar(40,87));
        try{
            System.out.println("Divisão de 50 / 3: " + Operacao.DIVISAO.executar(50,0));
        }catch (ArithmeticException e){
            System.err.println("Erro ao dividir: " + e.getMessage());
        }

        //toString(), equals() e hascode()
        System.out.println();
        Livro[] livros = new Livro[3];

        livros[0] = new Livro("Xama","Ryan","1");
        livros[1] = new Livro("chama","Ryan","1");
        livros[2] = new Livro("Pedra","Raian","2");

        for(Livro livro:livros){
            System.out.println(livro.toString());
        }
        System.out.println("Livro 1 é igual ao 2 ?" + livros[0].equals(livros[1]));
        System.out.println("Hash code livro 1: " + livros[0].hashCode());
        System.out.println("Hash code livro 2: " + livros[1].hashCode());

        HashSet<Livro> hash = new HashSet<Livro>();
        for(Livro livro:livros){
            hash.add(livro);
        }
        System.out.println("Tamanho do hashset " + hash.size());

        System.out.println("Livros no hash");
        for(Livro livro: hash){
            System.out.println(livro.toString());
        }























    }
}
