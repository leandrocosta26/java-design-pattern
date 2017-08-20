package models.orcamento;

public class ICCC extends Impostos {

    public ICCC() {
    }

    public ICCC(Impostos impostos) {
        super(impostos);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.07 + this.comporImposto(orcamento);
    }
}
