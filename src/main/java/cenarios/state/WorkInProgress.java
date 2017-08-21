package cenarios.state;

import cenarios.orcamento.Orcamento;

/**
 * Created by lcosta5 on 8/21/17.
 */
public class WorkInProgress implements State {
    @Override
    public void apply(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - orcamento.getValor() * (2.0/100));
    }

    @Override
    public void workInProgress(Orcamento orcamento) {
        throw new RuntimeException("State is work in progress");
    }

    @Override
    public void approve(Orcamento orcamento) {
        orcamento.setState(new Approved());
    }

    @Override
    public void reproved(Orcamento orcamento) {
        orcamento.setState(new Reproved());
    }

    @Override
    public void finish(Orcamento orcamento) {
        throw new RuntimeException("Not possible this orcamento need pass to approved");
    }
}
