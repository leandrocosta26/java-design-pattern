package models.orcamento;

public class ICCC implements Impostos {
    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }
}
