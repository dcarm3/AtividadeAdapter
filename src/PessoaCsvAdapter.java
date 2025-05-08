
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PessoaCsvAdapter implements RepositorioDePessoas {
    private String caminhoArquivo;

    public PessoaCsvAdapter(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    @Override
    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] partes = linha.split(",");

                if (partes.length >= 3) {
                    String nome = partes[0];
                    int idade = Integer.parseInt(partes[1].trim());
                    String email = partes[2];

                    pessoas.add(new Pessoa(nome, idade, email));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pessoas;
    }
}
