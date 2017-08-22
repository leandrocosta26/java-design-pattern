package cenarios.lombok;

import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Builder
public class Usuario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate dataNascimento;
}
