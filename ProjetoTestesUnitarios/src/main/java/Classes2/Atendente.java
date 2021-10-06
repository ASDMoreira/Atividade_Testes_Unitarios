package Classes2;

import java.util.ArrayList;
import java.util.List;

public class Atendente extends Pessoas{

    List<Pessoas> listaAtendente;
    public Atendente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        this.listaAtendente = new ArrayList<>(100);
    }

    public void adicionarAtendente(Pessoas pessoa){
        listaAtendente.add(pessoa);
    }

    public boolean removerAtendente(String telefone){
        for (int i = 0; i < listaAtendente.size(); i++){
            if(listaAtendente.get(i).getTelefone().equals(telefone)){
                listaAtendente.remove(i);
                return true;
            }

        }

        return false;
    }
}
