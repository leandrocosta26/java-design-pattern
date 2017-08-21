package cenarios.orcamento;

import cenarios.state.State;
import cenarios.state.WorkInProgress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private List<Item> itens;

    private Double valor;
    private State state;

    public Orcamento(double valor) {
        this.itens = new ArrayList<>();
    }

    public void setState(State state) {
        this.state = state;
    }

    public Orcamento() {
        this.itens = new ArrayList<>();
        this.state = new WorkInProgress();
    }

    public double getValor() {
        if(this.valor == null) {
            this.valor = this.itens.stream().mapToDouble(Item::getValor).sum();
        }
        return valor;
    }

    public void adiciona(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void aplicarDesconto(){
        this.state.apply(this);
    }

    public void aprovar(){
        this.state.approve(this);
    }

    public void reproved(){
        this.state.reproved(this);
    }

    public void finish(){
        this.state.finish(this);
    }


}
