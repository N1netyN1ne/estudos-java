import java.util.ArrayList;

public class Semana3ArraysEMetodos {
    static int somarNums(int num1, int num2){
        return num1+num2;
    }

    static double calcularMedia(double[] notas){
        double soma =0;

        for(double nota:notas){
            soma+=nota;
        }
        return soma/notas.length;
    }

    static boolean ePar(int num){
        return num % 2 == 0;
    }

    static int maiorQueLimite(int[] ints, int limite){
        int cont=0;

        for(int i:ints){
            if(i>limite){
                cont++;
            }
        }
        return cont;
    }

    static void listarAlunosEMedias(String[] alunos, double[] medias){
        for(int i=0;i < alunos.length;i++){
            System.out.println("Aluno: "+alunos[i]+"\nMedia: "+medias[i]);
        }
    }

    static void listarAlunoMaiorMedia(String[] alunos, double[] medias){
        System.out.println();
        double maiorMedia = medias[0];

        for(int i=0;i < medias.length;i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
            }
        }
        for(int i=0; i < medias.length;i++){
            if(medias[i]==maiorMedia){
                System.out.println("Alunos com maior média: "+alunos[i]+ "\nMédia: "+maiorMedia);
            }
        }
    }

    static void listarAlunoMenorMedia(String[] alunos, double[] medias){
        System.out.println();
        double menorMedia = medias[0];

        for(int i=0;i < medias.length;i++) {
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
            }
        }
        for(int i=0; i < medias.length;i++){
            if(medias[i]==menorMedia){
                System.out.println("Alunos com menor média: "+alunos[i]+ "\nMédia: "+menorMedia);
            }
        }
    }

    static void listarMediaGeral(double[] medias){
        double soma=0;

        for(double media:medias){
            soma+=media;
        }
        double mediaGeral = soma/medias.length;
        System.out.println("Média geral da turma: "+mediaGeral);

    }

    public static void main(String[] args){
        //Bloco 1 - Arrays
        //Soma de numeros em um array
        System.out.println();
        int[] nums = {2,4,6,8,10};
        int soma=0;
        for (int num : nums) {
            soma += num;
        }
            System.out.println("A soma é: "+soma);

        //Média de notas
        System.out.println();
        double[] notas = {6,7.5,9,10};
        double media=0;
        double somaNotas=0;

        for (double nota : notas) {
            somaNotas += nota;
        }
        media=somaNotas/notas.length;

        System.out.println("A média do aluno é: "+media);
        if(media>=7){
            System.out.println("Aprovado");
        } else if (media>=5) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }

        //Encontrar o maior número
        System.out.println();
        int[] numeros = {10,20,30,40,50,60};
        int maior=0;

        for(int num:numeros){
            if(num>maior){
                maior=num;
            }
        }
        System.out.println("O maior numero é "+maior);

        //contar valores acima de um limite
        System.out.println();
        double[] precos={10,12.5,19.99,49.90,5.95};
        double limite=19.9;
        int cont=0;

        for (double preco:precos) {
            if(preco>limite)cont++;
        }
        System.out.println("Quantidade de produtos acima do limte: "+cont);

        //Bloco 2 - ArrayList
        //Lista de nomes
        System.out.println();
        ArrayList<String>nomes = new ArrayList<String>();

        nomes.add("Ryan");
        nomes.add("Leonardo");
        nomes.add("Noelia");
        nomes.add("Vitória");
        nomes.add("Sampaio");

        System.out.println("Todos os nomes");
        for(String nome:nomes){
            System.out.println(nome);
        }

        System.out.println("Nomes acima de 5 caracteres");
        for(String nome:nomes){
            if(nome.length()>5){
                System.out.println(nome);
            }
        }

        //Lista de numeros inteiros
        System.out.println();
        ArrayList<Integer> numeros2 = new ArrayList<Integer>();
        numeros2.add(1);
        numeros2.add(3);
        numeros2.add(5);
        numeros2.add(7);
        numeros2.add(9);
        numeros2.add(11);

        int soma2=0;
        double media2=0;

        for(int num:numeros2){
            soma2+=num;
        }
        System.out.println("Soma dos numeros da lista: "+soma2);

        media2= (double) soma2 /numeros2.size();
        System.out.println("A média dos numeros é: "+media2);

        //Remover elementos menores que um valor
        System.out.println();
        ArrayList<Integer> numeros3 = new ArrayList<Integer>();
        int limite3 = 0;

        numeros3.add(50);
        numeros3.add(-20);
        numeros3.add(46);
        numeros3.add(-99);
        numeros3.add(-24);

        for(int i=numeros3.size()-1;i >= 0;i--){
            if(numeros3.get(i)<limite3){
                numeros3.remove(i);
            }
        }
        for(int i2:numeros3){
            System.out.println("Numeros maiores que o limite: "+i2);
        }

        //Bloco 3 - Métodos (funções)
        //Método para somar dois numeros
        System.out.println();
        System.out.println("1 + 2 = "+somarNums(1,2));
        System.out.println("10 + 50 = "+somarNums(10,50));

        //Método para calcular média de um array
        System.out.println();
        double[] notas2 = {5,6,7,8,10};
        System.out.println("A média das notas é: "+calcularMedia(notas2));

        //Método para verificar se um número é par
        System.out.println();
        System.out.println("3 é par ? "+ePar(3));
        System.out.println("4 é par ? "+ePar(4));
        System.out.println("75 é par ? "+ePar(75));

        //Método para contar quantos são maiores que um valor
        System.out.println();
        int[] nums2 = {5,10,15,20,25,30,35,40,45,50};
        int limite2 = 20;

        System.out.println("Quantos são maiores que "+limite2+": "+maiorQueLimite(nums2,limite2));

        //Mini sistema integrador (arrays+métodos)
        System.out.println();
        String[] alunos = {"Ryan","Leonardo","Noelia","Alexandre","Carlos"};
        double[] mediaFinal = {8,6,5,8,7};

        listarAlunosEMedias(alunos,mediaFinal);
        listarAlunoMaiorMedia(alunos,mediaFinal);
        listarAlunoMenorMedia(alunos,mediaFinal);
        listarMediaGeral(mediaFinal);
    }
}
