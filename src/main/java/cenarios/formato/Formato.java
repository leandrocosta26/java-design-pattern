package cenarios.formato;

public interface Formato {
    String processa(Conta conta);
    void next(Formato formato);
}
