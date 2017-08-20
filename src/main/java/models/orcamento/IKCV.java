package models.orcamento;

public class IKCV extends Template {

    private boolean exiteItemAcimaDeQuinhentos(Orcamento orcamento){
        for(Item item : orcamento.getItens()){
            return item.getValor() > 500;
        }
        return false;
    }

    @Override
    protected boolean deveAplicarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && exiteItemAcimaDeQuinhentos(orcamento);
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
