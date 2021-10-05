package LojaAcessorios.Modulo1.Classes1;

import java.util.ArrayList;
import java.util.List;


public class VetorProdutos {


    private List<Produto> listaProdutos;

    public VetorProdutos() {

        this.listaProdutos = new ArrayList<>(100);
    }

    public void adicionarProduto(Produto produto){

        listaProdutos.add(produto);
    }


    public boolean verificarValorProduto(String produto){
        for(int i = 0; i < listaProdutos.size(); i++){
            if(listaProdutos.get(i).getNome().equals(produto)){
                return true;

            }

        }
        return false;
    }












    public List<Produto> getListaProdutos() {

        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {

        this.listaProdutos = listaProdutos;
    }
}
