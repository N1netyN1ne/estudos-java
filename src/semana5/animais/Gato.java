package semana5.animais;

public class Gato extends Animal{
    public Gato(){}
    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau! Eu sou " + getNome());
    }
}
