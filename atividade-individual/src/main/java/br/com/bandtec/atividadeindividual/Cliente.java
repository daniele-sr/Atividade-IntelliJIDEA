package br.com.bandtec.atividadeindividual;

public class Cliente extends Farmacia {

    private Double valorDado; //valor dado pelo cliente para a compra

    public Cliente(String nomeRemedio, Integer quantRemedios, Double valorRemedio, Double valorDado) {
        super(nomeRemedio, quantRemedios, valorRemedio);
        this.valorDado = valorDado;
    }

    @Override
    public Double getValorTroco() {
        return getValorRemedio() - getValorDado();
    }

    public Double getValorDado() {
        return valorDado;
    }
}
