package models.desconto;

import models.orcamento.Orcamento;

public class ValorAcimaDeMil implements Desconto {
    private Desconto desconto;

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() > 1000 ? orcamento.getValor() * (7.0/100) : desconto.calcula(orcamento);
    }

    @Override
    public void proximo(Desconto desconto) {
        this.desconto = desconto;
    }
}
