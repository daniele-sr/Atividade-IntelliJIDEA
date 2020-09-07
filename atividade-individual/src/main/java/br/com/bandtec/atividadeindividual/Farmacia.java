package br.com.bandtec.atividadeindividual;

public abstract class Farmacia {

    private String nomeFarmacia;
    //private String nomeRemedio;
   // private Integer quantRemedios;
   // private Double valorRemedio;


    public Farmacia(String nomeFarmacia) {
        this.nomeFarmacia = nomeFarmacia;
    }

    public abstract  Double getValor();

    public String getNomeFarmacia() {
        return nomeFarmacia;
    }
}
