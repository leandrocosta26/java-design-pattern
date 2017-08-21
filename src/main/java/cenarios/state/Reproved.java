package cenarios.state;

import cenarios.orcamento.Orcamento;

/**
 * Created by lcosta5 on 8/21/17.
 */
public class Reproved implements State {
    @Override
    public void apply(Orcamento orcamento) {
        throw new RuntimeException("Orcamento is reproved");
    }

    @Override
    public void workInProgress(Orcamento orcamento) {
        throw new RuntimeException("Orcamento is reproved");
    }

    @Override
    public void approve(Orcamento orcamento) {
        throw new RuntimeException("Orcamento is reproved");
    }

    @Override
    public void reproved(Orcamento orcamento) {
        throw new RuntimeException("Orcamento is reproved");
    }

    @Override
    public void finish(Orcamento orcamento) {
        throw new RuntimeException("Orcamento is reproved");
    }
}
