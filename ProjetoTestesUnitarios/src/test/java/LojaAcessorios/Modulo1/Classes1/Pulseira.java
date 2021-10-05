package LojaAcessorios.Modulo1.Classes1;

import java.util.ArrayList;
import java.util.List;

public class Pulseira extends Produto{


    private List<Produto> listaPulseira;


    public Pulseira(String nome, Double valor) {
        super(nome, valor);
        this.listaPulseira = new ArrayList<>(100);
    }

    public void adicionarCorrente(Produto produto){
        listaPulseira.add(produto);
    }



}
