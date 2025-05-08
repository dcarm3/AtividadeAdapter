# Atividade 09 – Adapter Pattern 
Daniel Cardoso Martins Ra: 22262100-2

- `Pessoa.java`  
  Representa o modelo de pessoa com nome, idade e email

- `RepositorioDePessoas.java`  
  Interface que define a operação `listarPessoas()`.

- `PessoaCsvAdapter.java`  
  Implementação do padrão Adapter. Lê dados de um `.csv` e converte para objetos `Pessoa`.

- `Main.java`  
  Classe principal que utiliza o `PessoaCsvAdapter` como se fosse um repositório comum.

---

## 🗂 Exemplo de Arquivo CSV

```csv
nome,idade,email
João bob,69,joao@email.com
Maria Dalva,420,maria@email.com
Carlinhos Horse,123,carlos@email.com
