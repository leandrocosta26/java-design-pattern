package models.investimento;

import java.util.Random;

public class Arrojado implements Investidor {

    private Random random;

    public Arrojado() {
        this.random = new Random();
    }

    @Override
    public double obterLucro(Investimento investimento) {
        int chute = random.nextInt(10);
        if(chute >= 0 && chute <= 1) return investimento.getValor() * 0.5;
        else if (chute >= 2 && chute <= 4) return investimento.getValor() * 0.3;
        else return investimento.getValor() * 0.006;
    }
}