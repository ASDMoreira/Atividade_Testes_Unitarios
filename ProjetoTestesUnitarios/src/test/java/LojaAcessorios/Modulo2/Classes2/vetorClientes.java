package LojaAcessorios.Modulo2.Classes2;

import LojaAcessorios.Modulo1.Classes1.Produto;

import java.util.ArrayList;
import java.util.List;

public class VetorClientes {

    private List<Pessoas> listaClientes;

    public VetorClientes() {

        this.listaClientes = new ArrayList<>(100);
    }

    public void adicionarCliente(Pessoas pessoa){
        listaClientes.add(pessoa);
    }


    public boolean verificarCpfCliente(String produto){
        for(int i = 0; i < listaClientes.size(); i++){
            if(listaClientes.get(i).getCpf().equals(produto)){
                return true;

            }

        }
        return false;
    }
















    public List<Pessoas> getListaClientes() {

        return listaClientes;
    }

    public void setListaClientes(List<Pessoas> listaClientes) {

        this.listaClientes = listaClientes;
    }
}
