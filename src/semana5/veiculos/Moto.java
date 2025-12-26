package semana5.veiculos;

public class Moto extends Veiculo{
    public Moto(){}
    public Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Cilindradas: " + cilindradas);
    }



}
