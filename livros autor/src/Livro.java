import java.time.LocalDate;

public class  Livro {
    Autor autor;
    String nomeDoLivro;
    String genero;
    LocalDate dataPublicacao;

    public Livro(Autor autor, String nomeDoLivro, String genero, LocalDate dataPublicacao) {
        this.autor = autor;
        this.nomeDoLivro = nomeDoLivro;
        this.genero = genero;
        this.dataPublicacao = dataPublicacao;
    }
}
