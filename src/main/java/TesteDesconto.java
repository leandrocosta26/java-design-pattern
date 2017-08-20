import cenarios.desconto.*;
import cenarios.orcamento.Item;
import cenarios.orcamento.Orcamento;

public class TesteDesconto {

    public static void main(String[] args) {
        ValorAcimaDeMil valorAcimaDeMil = new ValorAcimaDeMil();
        MaisDeCincoItens maisDeCincoItens = new MaisDeCincoItens();
        ItensEspeciais itensEspeciais = new ItensEspeciais();
        SemDesconto semDesconto = new SemDesconto();
        Orcamento orcamento = new Orcamento();
        orcamento.adiciona(new Item(240, "Bicicleta"));
        orcamento.adiciona(new Item(240, "Motocicleta"));
        orcamento.adiciona(new Item(940, "Cadeira de balanço"));

        valorAcimaDeMil.proximo(maisDeCincoItens);
        maisDeCincoItens.proximo(itensEspeciais);
        itensEspeciais.proximo(semDesconto);
        System.out.println(valorAcimaDeMil.calcula(orcamento));
    }

}
