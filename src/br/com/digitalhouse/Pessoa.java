package br.com.digitalhouse;

import javax.jws.Oneway;
import java.util.Objects;

public class Pessoa {

    private String name;
    private Double rg;

    public Pessoa(String novoName, Double novoRg) {
        name = novoName;
        rg = novoRg;
    }

    public String getName() {
        return name;
    }

    public void setName(String novoName) {
        name = novoName;
    }

    public Double getRg() {
        return rg;
    }

    public void setRg(Double novoRg) {
        rg = novoRg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getRg(), pessoa.getRg());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRg());
    }

    //    @Override
//    public boolean equals(Object outraPessoa){
//        if (this == outraPessoa){
//            return true;
//        }if (!(outraPessoa instanceof Pessoa)) {
//            return false;
//        }
//        return this.rg == ((Pessoa) outraPessoa).getRg();
//    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", rg=" + rg +
                '}';
    }
}


