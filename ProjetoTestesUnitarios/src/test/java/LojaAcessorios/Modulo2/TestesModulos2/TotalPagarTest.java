package LojaAcessorios.Modulo2.TestesModulos2;

import Classes2.TotalPagar;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class TotalPagarTest extends TestCase {

    @Test
    public void testTotalPagar() {

        TotalPagar total = new TotalPagar();
        total.addTotal(1.0);
        total.addTotal(1.0);

        Assert.assertEquals(2.0, total.totalPagar());
    }

    @Test
    public void testAddValorTrue(){
        TotalPagar total = new TotalPagar();
        Assert.assertTrue(total.addTotal2(10.0));
    }


    @Test
    public void testPegarValorFalse(){
        TotalPagar total = new TotalPagar();
        total.addTotal(10.00);
        Assert.assertFalse(total.pegarValor(5.0));
    }

}