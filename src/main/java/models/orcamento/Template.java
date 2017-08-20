package models.orcamento;

public abstract class Template implements Impostos {

    @Override
    public final double calcular(Orcamento orcamento) {
        return deveAplicarMaximaTaxacao(orcamento) ? maximaTaxacao(orcamento) : minimaTaxacao(orcamento);
    }

    protected abstract boolean deveAplicarMaximaTaxacao(Orcamento orcamento);
    protected abstract double maximaTaxacao(Orcamento orcamento);
    protected abstract double minimaTaxacao(Orcamento orcamento);
}
