package cenarios.state;

import cenarios.orcamento.Orcamento;

/**
 * Created by lcosta5 on 8/21/17.
 */
public class Approved implements State {

    @Override
    public void apply(Orcamento orcamento) {
        orcamento.setValor(orcamento.getValor() - orcamento.getValor() * (5.0/100));
    }

    @Override
    public void approve(Orcamento orcamento) {
        throw new RuntimeException("The state is approved");
    }

    @Override
    public void reproved(Orcamento orcamento) {
        throw new RuntimeException("The state is approved an not can set reproved");
    }

    @Override
    public void finish(Orcamento orcamento) {
        orcamento.setState(new Finish());
    }
}
