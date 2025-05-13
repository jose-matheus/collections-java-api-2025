package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() { this.eventoMap = new HashMap<>(); }

    public void adicionarEventos(LocalDate data, String nome, String nomeAtracao){
        eventoMap.put(data, new Evento(nome, nomeAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + "Acontecerá na data " + proximaData);
                break;
            }else{
                System.out.println("Não existe um evento nas proximas datas");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
    }
}
