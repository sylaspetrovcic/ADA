import java.time.LocalDate;
import java.util.ArrayList;

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Marilda","marilda@gmail.com",
                LocalDate.of(1950,8,15));
        OperacoesUsuarios operacoesUsuarios = new OperacoesUsuarios();
        operacoesUsuarios.salvarUsuario(usuario);

        Usuario usuario1 = new Usuario("Sylas", "sylascp@gmail.com",
                LocalDate.of(1958,9,8));
        operacoesUsuarios.salvarUsuario(usuario1);

        Usuario usuario2 = new Usuario("Sylas", "sylascp@gmail.com",
                LocalDate.of(1958,9,8));
        operacoesUsuarios.salvarUsuario(usuario2);
        ArrayList<Usuario> usuariosSalvos = operacoesUsuarios.getUsuariosDoBancoDeDados();
        operacoesUsuarios.excluirUsuario(usuario1);

        for (Usuario item: usuariosSalvos
             ) {
            System.out.println("Usuários salvos no banco de dados "+" " + item.getNome() +
                    " , " + item.getEmail() + " , " +item.getDataNascimento());
        }

    }

}
