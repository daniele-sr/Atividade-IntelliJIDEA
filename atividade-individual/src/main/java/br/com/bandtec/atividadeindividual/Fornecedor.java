package br.com.bandtec.atividadeindividual;

public class Fornecedor extends localFarmacia{

    private Integer quntVendidas;

    public Fornecedor(String nome, String nomeRemedio, Integer quantRemedios, Double valorRemedio, Integer quntVendidas) {
        super(nome, nomeRemedio, quantRemedios, valorRemedio);
        this.quntVendidas = quntVendidas;
    }

    @Override
    public Double getLucroMes() {
        return getValorRemedio() * getQuntVendidas();
    }

    public Integer getQuntVendidas() {
        return quntVendidas;
    }
}
