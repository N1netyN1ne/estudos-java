package semana5.empresa;

public class Desenvolvedor extends Funcionario {
    Desenvolvedor(){}
    public Desenvolvedor(String nome, double salario, int horasExtras, double valorHoraExtra){
        super(nome,salario);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    private int horasExtras;
    private double valorHoraExtra;

    public int getHorasExtras() {
        return horasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularPagamento(){
        return super.calcularPagamento() + (this.valorHoraExtra*this.horasExtras);
    }

    @Override
    public String toString(){
        return super.toString() + "\nHoras extras: " + this.horasExtras + "\nValor hora extra: " + this.valorHoraExtra;
    }






}
