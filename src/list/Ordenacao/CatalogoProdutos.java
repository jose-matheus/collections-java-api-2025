package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoProdutos {

    private List<Produto> produtoList = new ArrayList<>();

    public CatalogoProdutos() {
        this.produtoList = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidadeEstoque){
        produtoList.add(new Produto(nome, preco, quantidadeEstoque));
    }

    public List<Produto> ordenarPorNome(){
        List<Produto> produtoPorNome = new ArrayList<>(produtoList);
        Collections.sort(produtoPorNome);
        return produtoPorNome;
    }

    public List<Produto> ordenarPorPreco(){
        List<Produto> produtoPorPreco = new ArrayList<>(produtoList);
        produtoPorPreco.sort(new OrdenarPorPreco());
        return produtoPorPreco;
    }

    public void exibirProduto(){
        System.out.println(produtoList);
    }

}
