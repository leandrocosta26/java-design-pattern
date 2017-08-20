package cenarios.investimento;

import java.util.Random;

public class Conservador implements Investidor {

    private Random random;

    public Conservador() {
        this.random = new Random();
    }

    @Override
    public double obterLucro(Investimento investimento) {
        return this.random.nextInt(2) == 0 ? investimento.getValor() * 0.025 : investimento.getValor() * 0.007;
    }

}
