package o.o.basico;

import o.o.basico.Maquina;

public class Pessoa {
   private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Maquina m= new Maquina("safa");
        m.setMarca("dfsd");
        m.getMarca();

    }
}
