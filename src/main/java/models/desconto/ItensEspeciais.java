package models.desconto;

import models.orcamento.Item;
import models.orcamento.Orcamento;

public class ItensEspeciais implements Desconto {

    public static final String CANETA = "CANETA";
    public static final String LAPIS = "LAPIS";

    private Desconto desconto;

    @Override
    public double calcula(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getNome().contains(LAPIS) || item.getNome().contains(CANETA)) {
                return orcamento.getValor() * (5.0 / 100);
            }
        }
        return desconto.calcula(orcamento);
    }

    @Override
    public void proximo(Desconto desconto) {
        this.desconto = desconto;
    }
}
