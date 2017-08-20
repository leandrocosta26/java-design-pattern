package cenarios.orcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private List<Item> itens;

    public Orcamento(double valor) {
        this.itens = new ArrayList<>();
    }

    public Orcamento() {
        this.itens = new ArrayList<>();
    }

    public double getValor() {
        return this.itens.stream().mapToDouble(Item::getValor).sum();
    }

    public void adiciona(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }
}
