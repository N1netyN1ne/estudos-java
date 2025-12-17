package Semana5.empresa;

import Semana5.empresa.Funcionario;

public class Gerente extends Funcionario {
    public Gerente(){}
    public Gerente(String nome, double salario, double bonus){
        super(nome,salario);
        this.bonus = bonus;
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento()+this.bonus;
    }

    @Override
    public String toString(){
        return  super.toString()+"\nBonus: "+this.bonus;
    }
}
