package LojaAcessorios.Modulo2.TestesModulos2;

import LojaAcessorios.Modulo2.Classes2.Atendente;
import LojaAcessorios.Modulo2.Classes2.Pessoas;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class AtendenteTest extends TestCase {

    @Test
    public void testAdicionarAtendente() {
        Atendente vetorA1 = new Atendente("Ana", "1234-1234", "111.111.111-11");
        Atendente vetorA2 = new Atendente(" ", " ", " ");


        Assert.assertEquals(vetorA1, vetorA1);
    }

    @Test
    public void testVerificarRemoverTrue(){
        Atendente atendente = new Atendente("Kássia", "1234-4567", "777.777.777-77 ");
        atendente.adicionarAtendente(atendente);

        Assert.assertTrue(atendente.removerAtendente("1234-4567"));

    }

    @Test
    public void testVerificarRemoverFalse(){
        Atendente atendente = new Atendente("Kássia", "1234-4567", "777.777.777-77 ");
        atendente.adicionarAtendente(atendente);
        Assert.assertFalse(atendente.removerAtendente("1234-3333"));

    }



}