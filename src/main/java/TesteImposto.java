import models.orcamento.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adiciona(new Item(2000, "Notebook"));
        orcamento.adiciona(new Item(150, "Impressora"));
        List<Impostos> impostos = new ArrayList<>();

        impostos.add(new ISS());
        impostos.add(new ICCC());
        impostos.add(new ICMS());
        impostos.add(new IKCV());
        impostos.add(new ICPP());

        System.out.println("Total " + String.valueOf(impostos.stream().mapToDouble((Impostos value) -> value.calcular(orcamento)).sum()));
    }
}
