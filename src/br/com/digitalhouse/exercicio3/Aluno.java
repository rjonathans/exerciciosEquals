package br.com.digitalhouse.exercicio3;

import java.util.Objects;

public class Aluno {
    private String name;
    private String numeroDeAluno;

    public Aluno(String name, String numeroDeAluno) {
        this.name = name;
        this.numeroDeAluno = numeroDeAluno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNumeroDeAluno(String numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", numeroDeAluno='" + numeroDeAluno + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(getName(), aluno.getName()) ||
                Objects.equals(getNumeroDeAluno(), aluno.getNumeroDeAluno());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumeroDeAluno());
    }
}
