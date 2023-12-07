import java.util.ArrayList;

public class OperacoesUsuarios {
   private ArrayList<Usuario>usuariosDoBancoDeDados;
public OperacoesUsuarios(){
    this.usuariosDoBancoDeDados = new ArrayList<>();
}

    public void salvarUsuario(Usuario usuario)  {
        boolean emailJaExistente = false;
        for (Usuario u : this.usuariosDoBancoDeDados) {
            if (u.getEmail().equals(usuario.getEmail())) {
                emailJaExistente = true;
                break;
            }
        }

        if (!emailJaExistente) {
            usuariosDoBancoDeDados.add(usuario);
            System.out.println("Usuário salvo no banco de dados: " + usuario.getNome());
        } else {
            System.out.println("Erro: Este email já está sendo usado por outro usuário.");
        }
        }

   public void excluirUsuario(Usuario usuario){
       usuariosDoBancoDeDados.remove(usuario);
       System.out.println("Usuario removido : " + usuario.getNome() );
    }

    public ArrayList<Usuario> getUsuariosDoBancoDeDados() {
        return this.usuariosDoBancoDeDados;
    }


}
