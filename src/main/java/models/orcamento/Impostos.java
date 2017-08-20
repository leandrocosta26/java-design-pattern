package models.orcamento;

public abstract class Impostos {

    private Impostos impostos;

    public Impostos(){}

    public Impostos(Impostos impostos) {
        this.impostos = impostos;
    }

    public abstract double calcular(Orcamento orcamento);

    protected final double comporImposto(Orcamento orcamento){
        return this.impostos == null ? 0 :  this.impostos.calcular(orcamento);
    }
}
