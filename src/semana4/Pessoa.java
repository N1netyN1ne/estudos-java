package semana4;

public class Pessoa {
    Pessoa(){}
    Pessoa(String nome, int idade){
        this.nome = nome;
        if(idade > 0){
            this.idade = idade;
        }else{
            System.out.println("Idade inválida");
            this.idade = 0;
        }
    }
    private String nome;
    private int idade;

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        }else{
            System.out.println("Idade inválida");
            this.idade = 0;
        }
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é "+nome+" e tenho "+idade+" anos.");
    }



}
