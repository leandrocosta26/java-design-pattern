import cenarios.orcamento.ISS;
import cenarios.orcamento.ImpostoAlto;
import cenarios.orcamento.Item;
import cenarios.orcamento.Orcamento;

public class TesteImpostoMuitoAlto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adiciona(new Item(100, "Patinete"));
        orcamento.adiciona(new Item(400, "Bicicleta"));

        ISS complexo = new ISS(new ImpostoAlto());
        System.out.println(complexo.calcular(orcamento));
    }
}
