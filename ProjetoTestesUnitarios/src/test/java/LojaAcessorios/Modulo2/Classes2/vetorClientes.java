package LojaAcessorios.Modulo2.Classes2;

import LojaAcessorios.Modulo1.Classes1.Produto;

import java.util.ArrayList;
import java.util.List;

public class vetorClientes {

    private List<Pessoas> listaClientes;

    public vetorClientes(int tamanho) {

        this.listaClientes = new ArrayList<>(tamanho);
    }

    public void adicionarCliente(Pessoas pessoa){

        listaClientes.add(pessoa);
    }






    public List<Pessoas> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Pessoas> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
