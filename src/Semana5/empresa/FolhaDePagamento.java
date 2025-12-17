package Semana5.empresa;

import java.util.ArrayList;

public class FolhaDePagamento {
    public FolhaDePagamento(){}

    public double calcularTotalFolha(ArrayList<Funcionario> funcionarios){
        double soma =0;

        for(Funcionario funcionario:funcionarios){
            soma += funcionario.calcularPagamento();
        }
        return soma;
    }

    public void listarPagamentos(ArrayList<Funcionario> funcionarios){
        for(Funcionario funcionario:funcionarios){
            System.out.println("\nNome: " + funcionario.getNome()
            + "\nTipo: " + funcionario.getClass().getSimpleName()
            + "\nPagamento " + funcionario.calcularPagamento());
        }
    }
}
