package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for(Item o : itemList){
            if(o.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(o);
            }
        }
        itemList.removeAll(itemRemover);
    }

    public double calcularValorTotal(){

        double valortotal = 0;
        for(Item o : itemList){
            valortotal += o.getPreco() * o.getQuantidade();
        }
        return valortotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("arroz", 14.09, 4);
        carrinhoDeCompras.adicionarItem("feijao", 14.23, 4);
        carrinhoDeCompras.adicionarItem("macarrao", 14.23, 4);
        carrinhoDeCompras.adicionarItem("arroz", 14.55, 4);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("arroz");

        System.out.printf("Valor total do carrinho %.2f%n",carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }

}
