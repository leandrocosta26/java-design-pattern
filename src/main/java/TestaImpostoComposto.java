import cenarios.orcamento.*;

public class TestaImpostoComposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adiciona(new Item(100, "Patinete"));
        orcamento.adiciona(new Item(400, "Bicicleta"));
        Impostos composto = new ICCC(new ICMS());
        System.out.println(composto.calcular(orcamento));
    }
}
