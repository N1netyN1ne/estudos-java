package semana6.banco;

public class ContaBancaria {
    public ContaBancaria(){}
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }
    private String titular;
    private double saldo;
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo+=valor;
            return true;
        }else{
            System.out.println("Insira um valor maior que 0");
            return false;
        }
    }

    public boolean sacar (double valor){
        if(valor <= this.saldo){
            this.saldo-=valor;
            return true;
        }else{
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
    }

    public void exibirSaldo(){
        System.out.println("Titular: " + this.titular+" | Saldo: " + this.saldo);
    }


}
