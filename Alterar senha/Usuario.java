import java.util.ArrayList;
import java.util.List;
public class Usuario {
    private List<String> senhas;
    public Usuario() {
        this.senhas = new ArrayList<>();
    }
    public String alterarSenha(String novaSenha) {
        if (senhas.contains(novaSenha) && senhas.indexOf(novaSenha) >= senhas.size() - 3) {
            return "Senha não pode ser igual às três últimas utilizadas";
        } else {
            senhas.add(novaSenha);
            return "Senha alterada com sucesso";
        }
    }

    public List<String> getSenhas() {
        return senhas;
    }
}



