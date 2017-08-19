import models.investimento.*;

import java.util.ArrayList;
import java.util.List;

public class TesteInvestidor {

    public static void main(String[] args) {
        List<Investidor> investidores =  new ArrayList<>();
        Investimento investimento = new Investimento(2000);

        investidores.add(new Arrojado());
        investidores.add(new Conservador());
        investidores.add(new Moderado());

        investidores.stream().forEach(investidor -> System.out.println(investidor.obterLucro(investimento)));
    }
}
