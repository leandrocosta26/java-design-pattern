import models.formato.*;

import java.util.ArrayList;
import java.util.List;

public class ProcessaFormato {
    public static void main(String[] args) {
        Csv csv = new Csv();
        Xml xml = new Xml();
        Porcentagem porcentagem = new Porcentagem();
        csv.next(xml);
        xml.next(porcentagem);
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta("Leandro", "123123", 2500.0, Tipos.CSV));
        contas.add(new Conta("Juliana", "123123", 2500.0, Tipos.PORCENTO));
        contas.stream().forEach(conta -> {
            System.out.println(csv.processa(conta));
        });
    }
}
