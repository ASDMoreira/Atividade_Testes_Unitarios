package LojaAcessorios.Modulo1.TestesModulo1;

import LojaAcessorios.Modulo1.Classes1.Corrente;
import LojaAcessorios.Modulo1.Classes1.Produto;
import LojaAcessorios.Modulo1.Classes1.VetorProdutos;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CorrenteTest extends TestCase {

    @Test
    public void testAdicionarCorrente() {
        Corrente corrente1 = new Corrente(" ", 0.0);
        Corrente corrente2 = new Corrente(" ", 0.0);
        corrente1.adicionarCorrente(new Produto("Colar", 100.00));
        corrente2.adicionarCorrente(new Produto("Cordão", 50.00));

        Assert.assertEquals(corrente1,corrente1);


    }

    @Test
    public void testVerificarValorTrue(){
        Corrente corrente = new Corrente(" ", 0.0);
        corrente.adicionarCorrente(new Produto("Colar Estrela", 150.00));

        Assert.assertTrue(corrente.verificarValor(150.00));

    }

    @Test
    public void testVerificarValorFalse(){
        Corrente corrente = new Corrente(" ", 0.0);
        corrente.adicionarCorrente(new Produto("Colar Estrela", 150.00));

        Assert.assertFalse(corrente.verificarValor(50.00));

    }




}