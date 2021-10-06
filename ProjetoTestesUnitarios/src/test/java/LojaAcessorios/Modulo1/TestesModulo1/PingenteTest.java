package LojaAcessorios.Modulo1.TestesModulo1;

import LojaAcessorios.Modulo1.Classes1.Pingente;
import LojaAcessorios.Modulo1.Classes1.Produto;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PingenteTest extends TestCase {


    @Test
    public void testAdicionarPingente() {
        Pingente pingente1 = new Pingente("Pingente HP", 100.00);
        Pingente pingente2 = new Pingente("Pingente nome", 50.00);

        Assert.assertEquals(pingente1, pingente1);


    }

    @Test
    public void testVerificarRemoverTrue(){
        Pingente pingente = new Pingente("Pingente Estrela", 150.00);
        pingente.adicionarPingente(pingente);
        Assert.assertTrue(pingente.removerPingente(150.00));

    }

    @Test
    public void testVerificarRemoverFalse(){
        Pingente pingente = new Pingente("Pingente Estrela", 10.00);
        pingente.adicionarPingente(pingente);
        Assert.assertFalse(pingente.removerPingente(150.00));

    }
}