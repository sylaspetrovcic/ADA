import java.time.LocalDate;
import java.util.Arrays;

public class TesteLivro {
    public static void main(String[] args) {
        Livro[] livros = new Livro[2];
        Autor autor = new Autor("Brasileiro","Érico Veríssimo",89,
                livros);
        Livro livro = new Livro(autor,"Olhai os lirios do campo","Romance",
                LocalDate.of(1950,5,20));
        Livro livro1 = new Livro(autor,"Incidente em Antares","Romance",
                LocalDate.of(1935,03,28));
        livro.genero = "Romance";
        Livro[] Livros = new Livro[2];
        Livros[0] = livro;
        Livros[1] = livro1;
        System.out.println(autor.nome +"\nGênero: " + livro.genero + " "+ "\nLivros: \n"+ livro.nomeDoLivro +
               "\n"+ livro1.nomeDoLivro);



            
        }
    }

