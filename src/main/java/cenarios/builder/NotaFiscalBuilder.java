package cenarios.builder;

import cenarios.orcamento.Item;

import java.util.List;

public class NotaFiscalBuilder {

    private NotaFiscal notaFiscal;

    public NotaFiscalBuilder(){
        this.notaFiscal = new NotaFiscal();
    }

    public NotaFiscalBuilder nome(String nome){
        this.notaFiscal.setNome(nome);
        return this;
    }

    public NotaFiscalBuilder codigo(String codigo){
        this.notaFiscal.setCodigo(codigo);
        return this;
    }

    public NotaFiscalBuilder items(List<Item> items){
        this.notaFiscal.setItems(items);
        return this;
    }

    public NotaFiscal builder(){
        return this.notaFiscal;
    }
}
