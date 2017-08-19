package models.desconto;

import models.orcamento.Orcamento;

public class SemDesconto implements Desconto {

    @Override
    public double calcula(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void proximo(Desconto desconto) {return;}
}
