package br.com.bandtec.atividadeindividual;

public abstract class localFarmacia implements Farmacia{

    private String nome;
    private String nomeRemedio;
    private Integer quantRemedios;
    private Double valorRemedio;

    public localFarmacia(String nome, String nomeRemedio, Integer quantRemedios, Double valorRemedio) {
        this.nome = nome;
        this.nomeRemedio = nomeRemedio;
        this.quantRemedios = quantRemedios;
        this.valorRemedio = valorRemedio;
    }

    @Override
    public Double getLucroMes() {
        return getQuantRemedios() * getValorRemedio();
    }

    public String getNomeFarmacia() {
        return nome;
    }

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public Integer getQuantRemedios() {
        return quantRemedios;
    }

    public Double getValorRemedio() {
        return valorRemedio;
    }

    public void setQuantRemedios(Integer quantRemedios) {
        this.quantRemedios = quantRemedios;
    }
}
