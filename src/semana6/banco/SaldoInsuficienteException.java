package semana6.banco;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(){}
    public SaldoInsuficienteException(String msg){
        super(msg);
    }

}
