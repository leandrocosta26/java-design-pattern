package cenarios.formato;

public class Csv implements Formato{

    private Formato formato;

    @Override
    public String processa(Conta conta) {
        return  Tipos.CSV.toString().equals(conta.getTipo().toString()) ?  String.format("nome; numero; valor;\n %s;%s;%s",
                conta.getNome(),
                String.valueOf(conta.getNumero()) ,
                String.valueOf(conta.getValor())) : formato.processa(conta);
    }

    public void next(Formato formato){
        this.formato = formato;
    }
}
