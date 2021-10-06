package Classes2;

import java.util.ArrayList;
import java.util.List;

public class Clientes extends Pessoas{


    private List<Pessoas> listaClientes;
    public Clientes(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        this.listaClientes = new ArrayList<>(100);
    }

    public void addClientes(Pessoas clientes){
        listaClientes.add(clientes);

    }


    public boolean verificarSeClienteExiste(String nome){
        for(int i = 0; i < listaClientes.size(); i++){
            if(listaClientes.get(i).getNome().equals(nome)){
                return true;
            }

        }

        return false;
    }












}
