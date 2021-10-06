package LojaAcessorios.Modulo2.TestesModulos2;

import Classes2.Clientes;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ClientesTest extends TestCase {



    @Test
    public void testAddClientes(){
        Clientes vetorC1 = new Clientes("Ana", "1234-1234", "111.111.111-11");
        Clientes vetorC2 = new Clientes("Kássia", "1222-3333", "222.222.222-22");


        Assert.assertEquals(vetorC1, vetorC1);
    }

    @Test
    public void testExisteClienteTrue(){
        Clientes vetorC = new Clientes("João", "1234-1234", "333.333.333-33");
        vetorC.addClientes(vetorC);

        Assert.assertTrue(vetorC.verificarSeClienteExiste("João"));
    }

    @Test
    public void testExisteClienteFalse(){
        Clientes vetorC = new Clientes("João", "1234-1234", "333.333.333-33");
        vetorC.addClientes(vetorC);
        Assert.assertFalse(vetorC.verificarSeClienteExiste("Luiz"));
    }



}