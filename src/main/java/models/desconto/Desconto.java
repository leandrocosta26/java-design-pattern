package models.desconto;

import models.orcamento.Orcamento;

public interface Desconto {

    double calcula(Orcamento orcamento);
    void proximo(Desconto desconto);
}
