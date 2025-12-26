package semana5.veiculos;

public class Carro extends Veiculo {
    public Carro(String marca,String modelo, int ano, int portas){
        super(marca,modelo,ano);
        this.portas = portas;
    }
    private int portas;

    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Portas: " + portas);
    }
}
