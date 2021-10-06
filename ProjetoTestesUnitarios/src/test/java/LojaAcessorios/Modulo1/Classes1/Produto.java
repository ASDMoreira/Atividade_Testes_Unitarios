package LojaAcessorios.Modulo1.Classes1;

import java.util.ArrayList;
import java.util.List;

public  class Produto {

    private String nome;
    private Double valor;

    private List<Object> obj;
    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
        this.obj  = new ArrayList<>(100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }



}
