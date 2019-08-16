package br.com.digitalhouse.exercicio2;

import java.util.Objects;

public class Coca {

    private Integer tamanho;
    private Double preco;

    public Coca(Integer novoTamanho,Double novoPreco){
        tamanho = novoTamanho;
        preco = novoPreco;
    }


    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coca)) return false;
        Coca coca = (Coca) o;
        return Objects.equals(tamanho, coca.tamanho);
    }

    @Override
    public String toString() {
        return "Coca{" +
                "tamanho=" + tamanho +
                ", preco=" + preco +
                '}';
    }
}
