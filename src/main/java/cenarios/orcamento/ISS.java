package cenarios.orcamento;

public class ISS extends Impostos {

    public ISS() {
    }

    public ISS(Impostos impostos) {
        super(impostos);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + this.comporImposto(orcamento);
    }
}
