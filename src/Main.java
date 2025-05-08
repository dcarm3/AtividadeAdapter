import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepositorioDePessoas repositorio = new PessoaCsvAdapter("src\\pessoas.csv");
        List<Pessoa> pessoas = repositorio.listarPessoas();
        for (Pessoa pessoa : pessoas) {System.out.println(pessoa);
        }
    }
}
