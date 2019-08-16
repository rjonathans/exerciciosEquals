package br.com.digitalhouse;

import br.com.digitalhouse.exercicio2.Coca;
import br.com.digitalhouse.exercicio3.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alexandre",19845495435d);
        Pessoa p2 = new Pessoa("William",19845495435d);

        Coca sprite = new Coca(300,8.50d);
        Coca delVale = new Coca(300,8.50d);

        System.out.println("A comparação entre "+p1+"\ne "+ p2+ "\nresultou em : "+p1.equals(p2));
        System.out.println("\nA comparação entre as cocas "+sprite+"\ne "+delVale+" deu:"+sprite.equals(delVale));

        System.out.println("*********************************");

        Aluno a1 = new Aluno("Mariano","123456");
        Aluno a2 = new Aluno("Mariano","123456");
        Aluno a3 = new Aluno("Mariano","123456");
        Aluno a4 = new Aluno("Mariano","123456");

        List<Aluno> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(a1);  //sem equals e hashCode..... false
        listaDeAlunos.add(a2);  //sem equals e hashCode..... false
        listaDeAlunos.add(a3);  //sem equals e hashCode..... false
        listaDeAlunos.add(a4);  //sem equals e hashCode..... false

        for (int i=0;i<listaDeAlunos.size();i++){
            System.out.println(listaDeAlunos.contains(i));
        }


        // QUANDO REESCREVEMOS O EQUALS NA CLASSE PESSOA O METODO EQUALS COMPARA O RG DOS OBJETOS

    }





}
