package LojaAcessorios.Modulo1.Classes1;

import java.util.ArrayList;
import java.util.List;

public class Pulseira extends Produto{


    private List<Produto> listaPulseira;


    public Pulseira(String nome, Double valor) {
        super(nome, valor);
        this.listaPulseira = new ArrayList<>(100);
    }

    public void adicionarPulseira(Produto produto){
        listaPulseira.add(produto);
    }

    public boolean removerPulseira(String nome){
        for (int i = 0; i < listaPulseira.size(); i++){
            if(listaPulseira.get(i).getNome().equals(nome)){
                listaPulseira.remove(i);
                return true;
            }

        }
        return false;
    }
}
