package LojaAcessorios.Modulo1.Classes1;

import java.util.ArrayList;
import java.util.List;

public class vetorProdutos {

    private List<Produto> listaProdutos;

    public vetorProdutos(int tamanho) {
        this.listaProdutos = new ArrayList<>(tamanho);
    }

    public void adicionarProduto(Produto produto){
        listaProdutos.add(produto);
    }



    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
