package LojaAcessorios.Modulo2.Classes2;

import LojaAcessorios.Modulo1.Classes1.Produto;

import java.util.ArrayList;
import java.util.List;

public class Pessoas {

    private String nome;
    private String telefone;
    private String cpf;
    private List<Pessoas> listaPessoas;

    public Pessoas(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.listaPessoas = new ArrayList<>(100);
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public void addPessoa(Pessoas pessoa){
        listaPessoas.add(pessoa);
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return  true;

        }

        if(obj instanceof Pessoas){
            if(this.nome.equals(((Pessoas) obj).getNome()) && this.telefone.equals(((Pessoas) obj).telefone)
                    && this.cpf.equals(((Pessoas) obj).getCpf())){
                return true;

            }

        }

        return false;
    }

    public boolean verificarSePessoaExiste(String cpf){
        for(int i = 0; i < listaPessoas.size(); i++){
            if(listaPessoas.get(i).getCpf().equals(cpf)){
                return true;
            }

        }

        return false;
    }

}
