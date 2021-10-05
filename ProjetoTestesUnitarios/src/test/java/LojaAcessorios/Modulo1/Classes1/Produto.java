package LojaAcessorios.Modulo1.Classes1;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private String valor;
    private String tamanho;
    private String material;
    private String tipo;


    public Produto(String nome, String valor, String tamanho, String material, String tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tamanho = tamanho;
        this.material = material;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
