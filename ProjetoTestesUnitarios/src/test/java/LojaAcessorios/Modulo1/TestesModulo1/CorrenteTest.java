package LojaAcessorios.Modulo1.TestesModulo1;


import Classes1.Corrente;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CorrenteTest extends TestCase {

    @Test
    public void testAdicionarCorrente() {
        Corrente corrente1 = new Corrente("Colar", 100.00);
        Corrente corrente2 = new Corrente("Cordão", 50.00);

        Assert.assertEquals(corrente1,corrente1);


    }

    @Test
    public void testVerificarValorTrue(){
        Corrente corrente = new Corrente("Colar Estrela", 150.00);
        corrente.adicionarCorrente(corrente);

        Assert.assertTrue(corrente.verificarValor(150.00));

    }

    @Test
    public void testVerificarValorFalse(){
        Corrente corrente = new Corrente("Colar Estrela", 150.00);
        corrente.adicionarCorrente(corrente);
        Assert.assertFalse(corrente.verificarValor(50.00));

    }




}