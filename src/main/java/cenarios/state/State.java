package cenarios.state;

import cenarios.orcamento.Orcamento;

/**
 * Created by lcosta5 on 8/21/17.
 */
public interface State {

    void apply(Orcamento orcamento);
    void approve(Orcamento orcamento);
    void reproved(Orcamento orcamento);
    void finish(Orcamento orcamento);
}
