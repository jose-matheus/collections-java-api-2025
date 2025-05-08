package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void removerLivroTitulo(String titulo){
        List<Livro> livrosRemover = new ArrayList<>();
        for(Livro l : livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livrosRemover.add(l);
            }
        }
        livros.removeAll(livrosRemover);
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(l);
                }
            }
        }
        return livrosAutor;
    }

    public List<Livro> pesquisarIntervaloAnos(int dInicial, int dFinal){
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        if(!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAnoDePublicacao() >= dInicial && l.getAnoDePublicacao() <= dFinal) {
                    livrosNoIntervalo.add(l);
                }
            }
        }
        return livrosNoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public void exibirLivros(){
        if(livros.isEmpty()){
            System.out.println("Você não tem livros!");
        }else {
            System.out.println(livros);
        }
    }

}
