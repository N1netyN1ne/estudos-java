package semana1a3;

import javax.sound.midi.SysexMessage;

public class Semana2CondionaisELacos {
    public static void  main(String[] args){
        System.out.println("Semana 2 - Condicionais e laços!");
        //BLOCO 1 - IF / ELSE / ELSE IF

        //Classificador de idade
        int idade =15;

        if(idade < 12){
            System.out.println("Criança");
        } else if (idade<18) {
            System.out.println("adolescente");
        }else{
            System.out.println("Adulto");
        }

        //Situação de aluno
        double n1 = 7;
        double n2 = 5.5;
        double n3 = 8;

        double media = (n1+n2+n3)/3;

        System.out.println("Media: "+media);

        if(media>=7){
            System.out.println("Aprovado");
        } else if (media>=5) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }

        //Desconto simples em compra

        double valorDaCompra = 120;

        if(valorDaCompra>=100){
            System.out.println("Frete gratis");
        }else{
            System.out.println("Sem frete grátis");
        }

        //BLOCO 2 Switch
        //Útil quando tem muitas opções para uma mesma variável (ex.: menu, dia da semana).


        //Dia da semana por numero
        int dia = 6;

        switch (dia){
            case 1:
                System.out.println("Domnigo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia invalido");
        }

        //Operações matematicas simples

        double num1 = 10;
        double num2 = 5;
        char operador = '+';

        switch (operador){
            case '+':
                System.out.println("Resultado: "+(num1+num2));
                break;
            case '-':
                System.out.println("Resultado: "+(num1-num2));
                break;
            case '*':
                System.out.println("Resultado: "+(num1*num2));
                break;
            case '/':
                System.out.println("Resultado: "+(num1/num2));
                break;
            default:
                System.out.println("Operador inválido");
        }
        // BLOCO 3 Laços(FOR, WHILE, DO-WHILE)

        //Imprimindo de 1 a 10(for)

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        //Imprimindo apenas pares de 0 a 20

        for(int i=0;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //Somar de 1 a 100 (while)
        int numero = 1;
        int soma = 0;

        while(numero<100){
            soma+=numero;
            numero++;
        }
        System.out.println("Soma de 1 a 100= "+soma);


        //Contagem regressiva do-while

        int cont = 5;
        do{
            System.out.println("Contagem: "+cont);
            cont--;
        }while(cont >=0);

        //Mini-sistema de menu

        int opcao = 1;
        double saldo = 1000;

        System.out.println("===Menu===");
        System.out.println("1- Ver saldo");
        System.out.println("2- Depositar 100");
        System.out.println("3- Sacar 50");
        System.out.println("4- Sair");

        switch (opcao){
            case 1:
                System.out.println("Seu saldo é R$ "+saldo);
                break;
            case 2:
                saldo+=100;
                System.out.println("Deposito realizado com sucesso, saldo disponivel R$ "+saldo);
                break;
            case 3:
                saldo-=50;
                System.out.println("Saque realidado com sucesso, saldo disponivel R$ "+saldo);
                break;
            case 4:
                System.out.println("Saindo....");
                break;
            default:
                System.out.println("Opção inválida");
        }



    }
}
