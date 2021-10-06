package Classes1;

import java.util.ArrayList;
import java.util.List;

public class Pingente extends Produto{


    private List<Produto> listaPingentes;


    public Pingente(String nome, Double valor) {
        super(nome, valor);
        this.listaPingentes = new ArrayList<>(100);
    }

    public void adicionarPingente(Produto produto){
        listaPingentes.add(produto);
    }

    public boolean removerPingente(double valor){
        for (int i = 0; i < listaPingentes.size(); i++){
            if(listaPingentes.get(i).getValor().equals(valor)){
                listaPingentes.remove(i);
                return true;
            }

        }

        return false;
    }
}
