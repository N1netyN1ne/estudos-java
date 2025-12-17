package Semana5;

import Semana5.animais.Animal;
import Semana5.animais.Cachorro;
import Semana5.animais.Gato;
import Semana5.empresa.Desenvolvedor;
import Semana5.empresa.FolhaDePagamento;
import Semana5.empresa.Funcionario;
import Semana5.empresa.Gerente;
import Semana5.veiculos.Carro;
import Semana5.veiculos.Moto;
import Semana5.veiculos.Veiculo;

import java.util.ArrayList;

public class Semana5 {
    public static void main(String[] args){
        //Herança basica
        Gerente g1 = new Gerente("Ryan",5000,200);
        System.out.println(g1.calcularPagamento());
        System.out.println(g1.toString());

        //Empresa
        System.out.println();
        Gerente g2 = new Gerente("Ségio",6000,300);
        Desenvolvedor d1 = new Desenvolvedor("Ramos",3500,10,60);

        System.out.println(g2.toString());
        System.out.println("Salario final: " + g2.calcularPagamento());
        System.out.println(d1.toString());
        System.out.println("Salario final: " + d1.calcularPagamento());

        //Polimorfismo
        System.out.println();
        ArrayList<Funcionario> Funcionarios = new ArrayList<Funcionario>();
        Desenvolvedor d2 = new Desenvolvedor("Carlos",3500,2,60);
        Funcionarios.add(g1);
        Funcionarios.add(g2);
        Funcionarios.add(d1);
        Funcionarios.add(d2);


        System.out.println("===Quadro de Funcionarios===");
        for(Funcionario funcionario:Funcionarios){
            System.out.println("\n" + funcionario.toString());
            System.out.println("Pagamento: " + funcionario.calcularPagamento() + "\n");
        }

        //Herança em outro contexto (Veículos)
        System.out.println();
        ArrayList<Veiculo> ListaDeVeiculos = new ArrayList<Veiculo>();
        ListaDeVeiculos.add(new Carro("Nissan","V-Drive",2021,4));
        ListaDeVeiculos.add(new Carro("Volkswagen","Gol",2023,4));
        ListaDeVeiculos.add(new Moto("Honda","CG Titan",2002,125));
        ListaDeVeiculos.add(new Moto("Suzuki","Yes",2008,125));

        for(Veiculo veiculo: ListaDeVeiculos){
            veiculo.exibirInfo();
            System.out.println();
        }

        //Classe abstrata (conceito importante para depois em Spring)
        ArrayList<Animal> Animais = new ArrayList<Animal>();
        Animais.add(new Gato("Mel"));
        Animais.add(new Cachorro("Judy"));

        for(Animal animal: Animais){
            animal.emitirSom();
            System.out.println();
        }

        //Mini-sistema integrador: Folha de pagamento
        System.out.println();
        Funcionarios.add(new Desenvolvedor("Ryan", 3000, 0, 60));
        Funcionarios.add(new Gerente("Marques",5000,300));
        FolhaDePagamento f1 = new FolhaDePagamento();

        System.out.println("Total da folha de pagamento: R$" + f1.calcularTotalFolha(Funcionarios));
        f1.listarPagamentos(Funcionarios);



    }
}
