package models.formato;

public class Porcentagem implements Formato{

    private Formato formato;

    @Override
    public String processa(Conta conta) {
        return  Tipos.PORCENTO.toString().equals(conta.getTipo().toString()) ?
                conta.getNome() + "%" +
                String.valueOf(conta.getValor()) + "%" +
                String.valueOf(conta.getValor()) : conta.toString();
    }

    public void next(Formato formato){
        this.formato = formato;
    }
}
