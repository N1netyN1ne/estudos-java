package semana4.faculdade;

import semana4.faculdade.Aluno;

import java.util.ArrayList;

public class Curso {
    public Curso(){}
    public Curso(String nome){
        this.nome = nome;
    }

    private String nome;
    private ArrayList<Aluno> Alunos = new ArrayList<Aluno>();

    public String getNome(){
        return this.nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return Alunos;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        Alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno){
        Alunos.add(aluno);
    }

    public void listarAlunos(){
        for(Aluno aluno:Alunos){
            aluno.exibirInfo();
        }
    }

    public double calcularMediaDaTurma(){
        double soma=0;
        int numDeNotas=0;

        for(Aluno aluno:Alunos){
            soma+=aluno.getNota();
            numDeNotas++;
        }
        return soma/numDeNotas;
    }
    public void listarAprovados(double notaCorte){
        System.out.println("Alunos aprovados");
        for(Aluno aluno:Alunos){
            if(aluno.getNota() >= notaCorte){
                aluno.exibirInfo();
                System.out.println();
            }
        }
    }
}
