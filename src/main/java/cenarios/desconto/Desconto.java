package cenarios.desconto;

import cenarios.orcamento.Orcamento;

public interface Desconto {

    double calcula(Orcamento orcamento);
    void proximo(Desconto desconto);
}
