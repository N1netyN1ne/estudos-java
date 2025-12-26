package semana6.enums;

public enum NivelDificuldade {
    FACIL(1),
    MEDIO(2),
    DIFICIL(3),
    MUITO_DIFICIL(4);

    private int valor;
    private NivelDificuldade(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
}
