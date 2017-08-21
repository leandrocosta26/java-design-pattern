import cenarios.orcamento.Item;
import cenarios.orcamento.Orcamento;

/**
 * Created by lcosta5 on 8/21/17.
 */
public class TesteState {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adiciona(new Item(123, "Bicicleta"));
        orcamento.adiciona(new Item(123, "Patinete"));

        orcamento.aplicarDesconto();

        System.out.println(orcamento.getValor());

        orcamento.aprovar();

        orcamento.aplicarDesconto();

        System.out.println(orcamento.getValor());

        orcamento.finish();

        orcamento.aplicarDesconto();

        System.out.println(orcamento.getValor());
    }
}
