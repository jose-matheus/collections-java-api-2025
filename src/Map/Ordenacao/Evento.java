package Map.Ordenacao;

public class Evento {

    private String nome;
    private String nomeAtracao;

    public Evento(String nome, String nomeAtracao) {
        this.nome = nome;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", nomeAtracao='" + nomeAtracao + '\'' +
                '}';
    }
}
