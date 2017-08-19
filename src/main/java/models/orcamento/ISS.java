package models.orcamento;

public class ISS implements Impostos {

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
