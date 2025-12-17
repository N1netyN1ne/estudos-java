package Semana5.animais;

public class Cachorro extends Animal{
    public Cachorro(){}
    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au au! Eu sou " + getNome());
    }
}
