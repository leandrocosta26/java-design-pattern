package cenarios.orcamento;

public class ICMS extends Impostos {

    public ICMS() {
    }

    public ICMS(Impostos impostos) {
        super(impostos);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.02 + this.comporImposto(orcamento);
    }
}
