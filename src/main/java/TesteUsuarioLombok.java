import cenarios.lombok.Usuario;

import java.time.LocalDate;

public class TesteUsuarioLombok {

    public static void main(String[] args) {
        Usuario usuario = Usuario.builder().cpf("32423432423").dataNascimento(LocalDate.now()).nome("Leandro").sobrenome("costa").build();
        System.out.println(usuario);
    }
}
