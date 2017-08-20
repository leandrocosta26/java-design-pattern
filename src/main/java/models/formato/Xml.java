package models.formato;

public class Xml implements Formato {

    private Formato formato;

    @Override
    public String processa(Conta conta) {
        return conta.getTipo().toString().equals(Tipos.XML.toString()) ? String.format("<conta><nome>%s</nome><numero>%s</numero><valor>%s</valor></conta>", conta.getNome(),conta.getNumero(), String.valueOf(conta.getValor())) : this.formato.processa(conta);
    }

    @Override
    public void next(Formato formato) {
        this.formato = formato;
    }

}
