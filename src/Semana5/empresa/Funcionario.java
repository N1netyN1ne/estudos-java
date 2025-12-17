package Semana5.empresa;

public abstract class Funcionario {
    Funcionario(){}
    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    private String nome;
    private double salario;

    public double calcularPagamento(){
        return this.salario;
    }

    public String toString(){
        return "Funcionario: " + this.nome + "\nSalário: " + this.salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
