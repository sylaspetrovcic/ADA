public class TesteSenha {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        System.out.println(usuario.alterarSenha("senha123"));
        System.out.println(usuario.alterarSenha("senha123")); // Senha alterada com sucesso
        System.out.println(usuario.alterarSenha("outraSenha456")); // Senha alterada com sucesso
        System.out.println(usuario.alterarSenha("senha123")); // Senha não pode ser igual às três últimas utilizadas
        System.out.println(usuario.alterarSenha("maisUmaSenha789")); // Senha alterada com sucesso

        System.out.println(usuario.getSenhas());
    }
}
