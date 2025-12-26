package semana6.enums;

import semana6.calculadora.Calculadora;

public enum Operacao {
    SOMA{
        @Override
        public double executar(double a,double b){
            return a+b;
        }
    },
    SUBTRACAO{
        @Override
        public double executar(double a, double b){
            return a-b;
        }
    },
    MULTIPLICACAO {
        @Override
        public double executar(double a, double b){
            return a*b;
        }
    },
    DIVISAO{
        @Override
        public double executar(double a, double b){
           if(b == 0){
               throw new ArithmeticException("Divisão por 0 não permitida");
           }
           return a/b;
        }
    };

    public abstract double executar(double a, double b);
}
