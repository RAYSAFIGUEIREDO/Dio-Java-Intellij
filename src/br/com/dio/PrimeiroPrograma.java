package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {


    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);


       /* Livro livro1 = new Livro(nome: "O problema dos 3 corpos", numPaginas:300);
System.out.println(livro1);*\


       /* int a = 5;
        int b = 3;
        System.out.println("Hello World!" + (a+b));*/
    }

}
class Livro{

  private String nome;
  private Integer numPaginas;


    public Livro(String nome, Integer nunPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNunPaginas() {
        return numPaginas;
    }

    public void setNunPaginas(Integer nunPaginas) {
        this.numPaginas = nunPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

