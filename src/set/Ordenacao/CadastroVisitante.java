package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroVisitante {
    //atributos
    private Set<Visitant> visitantSet;

    public CadastroVisitante() {
        this.visitantSet = new HashSet<>();
    }

    public void adicionarVisitant(long documento, String nome, boolean pagamentoConfirmado){
        visitantSet.add(new Visitant(documento, nome, pagamentoConfirmado));
    }

    public void removerVisitantePorDocumento(long documento){
        Visitant visitantRemover = null;
        for(Visitant v : visitantSet){
            if(v.getDocumento() == documento){
                visitantRemover = v;
                break;
            }
        }
        visitantSet.remove(visitantRemover);
    }

    public boolean visitanteRegistrado(long documento){
        return visitantSet.contains(new Visitant(documento, "", false));
    }

    public Set<Visitant> exibirVisitantesOrdenadosPorNome(){
        Set<Visitant> comparatorPorNome = new TreeSet<>(new ComparatorPorNome());
        comparatorPorNome.addAll(visitantSet);
        return comparatorPorNome;
    }

    public Set<Visitant> exibirVisitantesPorDocumento(){
        return new TreeSet<>(visitantSet);
    }

    public void quantidadeVisitantesRegistrados(){
        System.out.println(visitantSet.size());
    }

    public boolean visitanteRegistradoPorNome(String nome) {
        for (Visitant v : visitantSet) {
            if (v.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void removerTodosVisitantesRegistro(){
        visitantSet.clear();
    }

    public void listarVisitantesPagamentoConfirmado(){
        Set<Visitant> visitantsComPagamentoConfirmado = new TreeSet<>(new ComparatorPorNome());
        for(Visitant v : visitantSet){
            if(v.isPagamentoConfirmado()){
                visitantsComPagamentoConfirmado.add(v);
            }
        }
        System.out.println(visitantsComPagamentoConfirmado);
    }
}
