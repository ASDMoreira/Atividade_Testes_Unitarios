package Classes1;

import java.util.ArrayList;
import java.util.List;

public class Corrente extends Produto {



    private List<Produto> listaCorrentes;


    public Corrente(String nome, Double valor) {
        super(nome, valor);
        this.listaCorrentes = new ArrayList<>(100);
    }


    public void adicionarCorrente(Produto produto){

        listaCorrentes.add(produto);
    }


    public boolean verificarValor(double valor){
        for(int i = 0; i < listaCorrentes.size(); i++){
            if(listaCorrentes.get(i).getValor().equals(valor)){
                return true;

            }

        }

        return false;
    }


}
