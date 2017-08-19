package models.investimento;

import java.util.Random;

public class Moderado implements Investidor {

    public static final int PORCENT = 100;

    @Override
    public double obterLucro(Investimento investimento) {
        return new Random().nextDouble() > 0.5 ? investimento.getValor() * (2.5/ PORCENT) : investimento.getValor() * (0.7/ PORCENT);
    }
}
