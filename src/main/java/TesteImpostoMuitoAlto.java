import models.orcamento.ISS;
import models.orcamento.ImpostoAlto;
import models.orcamento.Item;
import models.orcamento.Orcamento;

public class TesteImpostoMuitoAlto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adiciona(new Item(100, "Patinete"));
        orcamento.adiciona(new Item(400, "Bicicleta"));

        ISS complexo = new ISS(new ImpostoAlto());
        System.out.println(complexo.calcular(orcamento));
    }
}
