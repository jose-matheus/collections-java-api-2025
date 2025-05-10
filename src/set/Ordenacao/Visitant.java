package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Visitant implements Comparable<Visitant> {
    //atributos
    private final long documento;
    private String nome;
    private boolean pagamentoConfirmado;

    public Visitant(long documento, String nome, boolean pagamentoConfirmado) {
        this.documento = documento;
        this.nome = nome;
        this.pagamentoConfirmado = pagamentoConfirmado;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Visitant visitant)) return false;
        return getDocumento() == visitant.getDocumento();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDocumento());
    }

    public long getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public boolean isPagamentoConfirmado() {
        return pagamentoConfirmado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPagamentoConfirmado(boolean pagamentoConfirmado) {
        this.pagamentoConfirmado = pagamentoConfirmado;
    }

    @Override
    public String toString() {
        return "Visitant{" +
                "documento=" + documento +
                ", nome='" + nome + '\'' +
                ", pagamentoConfirmado=" + pagamentoConfirmado +
                '}';
    }

    @Override
    public int compareTo(Visitant v) {
        return Long.compare(this.documento,v.getDocumento());
    }
}

class ComparatorPorNome implements Comparator<Visitant>{

    @Override
    public int compare(Visitant v1, Visitant v2) {
        return String.CASE_INSENSITIVE_ORDER.compare(v1.getNome(), v2.getNome());
    }
}
