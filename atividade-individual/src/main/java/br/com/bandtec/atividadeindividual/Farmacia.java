package br.com.bandtec.atividadeindividual;

public abstract class Farmacia {

    private String nomeRemedio;
    private Integer quantRemedios;

    public Farmacia(String nomeRemedio, Integer quantRemedios) {
        this.nomeRemedio = nomeRemedio;
        this.quantRemedios = quantRemedios;
    }

    public abstract  Double getValorFrete();
    public abstract  Double getValorCompra();

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public Integer getQuantRemedios() {
        return quantRemedios;
    }
}
