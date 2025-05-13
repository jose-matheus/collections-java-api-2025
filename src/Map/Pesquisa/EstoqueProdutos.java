package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        produtosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirTodosProdutos(){
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!produtosMap.isEmpty()){
            for(Produto p : produtosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
