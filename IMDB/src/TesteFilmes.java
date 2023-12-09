import java.util.ArrayList;

public class TesteFilmes {
    public static void main(String[] args) {
        Filme filme = new Filme("Como se fosse a primeira vez","Comédia", new String[]{"Adam Sandler",
                "Drew Barrymore", "Rob Sheneider", "Sean Astin"},112, "Peter Segal");
        OperacoesFilmes operacaoFilmes = new OperacoesFilmes();
        operacaoFilmes.salvarFilme(filme);
        Filme filme1 = new Filme("Segredos de um escândalo","Drama",new String[]{
                "Natalie Portman", "Chris Tenzis", "Charles Melton", "Julianne Moore"},117,
                "Todd Haynes");
        operacaoFilmes.salvarFilme(filme1);
        Filme filme2 = new Filme("Segredos de um escândalo","Drama",new String[]{
                "Natalie Portman", "Chris Tenzis", "Charles Melton", "Julianne Moore"},117,
                "Todd Haynes");
        operacaoFilmes.salvarFilme(filme2);



        ArrayList<Filme>filmeSalvos = operacaoFilmes.getUsuariosDoBancoDeDados();
        operacaoFilmes.excluir("Segredos de um escândalo");

        for(Filme item : filmeSalvos ){
            System.out.println("Filmes salvos no banco de dados : " + item.getTitulo());
        }
    }
}