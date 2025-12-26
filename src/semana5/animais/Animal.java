package semana5.animais;

import java.util.Objects;

public abstract class Animal {
    public Animal(){}
    public Animal(String nome){
        this.nome = nome;
    }
    private String nome;

    public String getNome() {
        return nome;
    }
    public void emitirSom(){
        System.out.println("Som de animal!");
    }
}
