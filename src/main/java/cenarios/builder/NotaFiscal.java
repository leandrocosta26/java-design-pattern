package cenarios.builder;

import cenarios.orcamento.Item;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    public NotaFiscal() {
        this.items = new ArrayList<>();
    }

    private String nome;
    private String codigo;
    private List<Item> items;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", items=" + items +
                '}';
    }
}
