package cenarios.state;

import cenarios.orcamento.Orcamento;

/**
 * Created by lcosta5 on 8/21/17.
 */
public class Finish implements State {
    @Override
    public void apply(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - orcamento.getValor() * (3.0/100));
    }

    @Override
    public void workInProgress(Orcamento orcamento) {
        throw new RuntimeException("The state is finish");
    }

    @Override
    public void approve(Orcamento orcamento) {
        throw new RuntimeException("The state is finish");
    }

    @Override
    public void reproved(Orcamento orcamento) {
        throw new RuntimeException("The state is finish");
    }

    @Override
    public void finish(Orcamento orcamento) {
        throw new RuntimeException("The state is finish");
    }
}
