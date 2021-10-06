package Classes2;

import java.util.ArrayList;
import java.util.List;

public class TotalPagar{

    private List<Double> listaValor;

    public TotalPagar() {
        this.listaValor = new ArrayList<>(100);
    }

    public void addTotal(double preco){
        listaValor.add(preco);
    }

    public double totalPagar(){
        float soma = 0;
        for(int i = 0; i < listaValor.size(); i++){
            soma += listaValor.get(i);

        }
        return soma;
    }

    public boolean addTotal2(double preco){

            if(listaValor.add(preco)){
                return true;
            }
        return false;
    }

    public boolean pegarValor(double preco){

        for(int i = 0; i < listaValor.size(); i++){
            if(listaValor.get(i).equals(preco)){
                return true;

            }
        }

        return false;
    }
}
