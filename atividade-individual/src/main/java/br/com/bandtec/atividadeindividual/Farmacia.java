package br.com.bandtec.atividadeindividual;

public abstract class Farmacia {

    private String nomeRemedio;
    private Integer quantRemedios;
    private Double valorRemedio;

    public Farmacia(String nomeRemedio, Integer quantRemedios, Double valorRemedio) {
        this.nomeRemedio = nomeRemedio;
        this.quantRemedios = quantRemedios;
        this.valorRemedio = valorRemedio;
    }

    public abstract  Double getValorTroco();

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public Double getValorRemedio() {
        return valorRemedio;
    }

    public Integer getQuantRemedios() {
        return quantRemedios;
    }
}
