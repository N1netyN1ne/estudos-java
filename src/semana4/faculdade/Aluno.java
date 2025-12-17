package semana4.faculdade;

public class Aluno {
    public Aluno(){}
    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void exibirInfo(){
        System.out.println("Nome: "+this.nome+"\nNota: "+this.nota);
    }
}
