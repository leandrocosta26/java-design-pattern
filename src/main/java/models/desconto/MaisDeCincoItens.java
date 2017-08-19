package models.desconto;

import models.orcamento.Orcamento;

public class MaisDeCincoItens implements Desconto {

    private Desconto desconto;

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getItens().size() > 5 ? orcamento.getValor() * (10 / 100) : desconto.calcula(orcamento);
    }

    @Override
    public void proximo(Desconto desconto) {
        this.desconto = desconto;
    }
}
