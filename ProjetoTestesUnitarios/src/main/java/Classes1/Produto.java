package Classes1;
import java.util.ArrayList;
import java.util.List;

public  class Produto {

    private String nome;
    private Double valor;
    private List<Produto> listaProduto;



    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
        this.listaProduto = new ArrayList<>(100);
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

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return  true;

        }

        if(obj instanceof Produto){
            if(this.nome.equals(((Produto) obj).getNome()) && this.valor.equals(((Produto) obj).getValor())){
                return true;

            }

        }

        return false;
    }

    public void addProduto(Produto produto){

        listaProduto.add(produto);
    }

    public boolean removerProduto(String nome){
        for (int i = 0; i < listaProduto.size(); i++){
            if(listaProduto.get(i).getNome().equals(nome)){
                listaProduto.remove(i);
                return true;
            }

        }

        return false;
    }

}




