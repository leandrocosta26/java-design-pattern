package models.orcamento;

public class ImpostoAlto extends  Impostos{
    public ImpostoAlto() {
    }

    public ImpostoAlto(Impostos impostos) {
        super(impostos);
    }

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * (20/100);
    }
}
