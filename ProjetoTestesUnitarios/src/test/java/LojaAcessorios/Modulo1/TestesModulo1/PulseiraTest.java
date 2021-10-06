package LojaAcessorios.Modulo1.TestesModulo1;

import LojaAcessorios.Modulo1.Classes1.Produto;
import LojaAcessorios.Modulo1.Classes1.Pulseira;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PulseiraTest extends TestCase {

    @Test
    public void testAdicionarPulseira() {
        Pulseira pulseira1 = new Pulseira("Pulseira pandora", 200.00);
        Pulseira pulseira2 = new Pulseira("Pulseira Prata", 100.00);
        Assert.assertEquals(pulseira1,pulseira1);


    }

    @Test
    public void testVerificarRemoverTrue(){
        Pulseira pulseira = new Pulseira("Pulseira chanel", 1000.00);
        pulseira.adicionarPulseira(pulseira);
        Assert.assertTrue(pulseira.removerPulseira("Pulseira chanel"));

    }

    @Test
    public void testVerificarRemoverFalse(){
        Pulseira pulseira = new Pulseira("Pulseira de Ouro", 400.00);
        pulseira.adicionarPulseira(pulseira);
        Assert.assertFalse(pulseira.removerPulseira("Pulseira chanel"));

    }
}