package models.formato;

public class Conta {

    public Conta(String nome, String numero, double valor, Tipos tipos) {
        this.nome = nome;
        this.numero = numero;
        this.valor = valor;
        this.tipos = tipos;
    }

    private Tipos tipos;
    private String nome;
    private String numero;
    private double valor;

    public String getTipo() { return tipos.toString();}

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "tipos=" + tipos +
                ", nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", valor=" + valor +
                '}';
    }
}
