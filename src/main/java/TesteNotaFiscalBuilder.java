import cenarios.builder.NotaFiscal;
import cenarios.builder.NotaFiscalBuilder;
import cenarios.orcamento.Item;

import java.util.ArrayList;
import java.util.List;

public class TesteNotaFiscalBuilder {
    public static void main(String[] args) {
        NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
        List<Item> items = new ArrayList<>();
        items.add(new Item(10, "Caneta"));
        items.add(new Item(1, "Lapis"));
        items.add(new Item(3, "Apontado"));
        NotaFiscal gabriel_ramalho = notaFiscalBuilder.nome("Gabriel ramalho").codigo("123131").items(items).builder();
        System.out.println(gabriel_ramalho);
    }
}
