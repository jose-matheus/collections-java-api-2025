package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContato;

    public AgendaContatos() {
        agendaContato = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContato.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContato.isEmpty()){
            agendaContato.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContato);
    }

    public Integer pesquisarContatoNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContato.isEmpty()){
            numeroPorNome = agendaContato.get(nome);
        }
        return numeroPorNome;
    }
}
