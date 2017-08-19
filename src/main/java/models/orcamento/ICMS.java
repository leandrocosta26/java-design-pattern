package models.orcamento;

public class ICMS implements Impostos {
    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.02;
    }
}
