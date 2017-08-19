import models.orcamento.*;

import java.util.ArrayList;
import java.util.List;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(2000);
        List<Impostos> impostos = new ArrayList<>();

        impostos.add(new ISS());
        impostos.add(new ICCC());
        impostos.add(new ICMS());

        impostos.stream().forEach(imposto -> System.out.println(imposto.calcular(orcamento)));
    }
}
