package LojaAcessorios.Modulo2.TestesModulos2;

import Classes2.Pessoas;
import Classes2.VetorClientes;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class VetorClientesTest extends TestCase {

    @Test
    public void testAdicionarCliente() {
        VetorClientes vetorC1 = new VetorClientes();
        VetorClientes vetorC2 = new VetorClientes();

        vetorC1.adicionarCliente(
                new Pessoas("Ana", "1234-1234", "111.111.111-11"));
        vetorC2.adicionarCliente(
                new Pessoas("Kássia", "1111-2222", "222.222.222-22"));

        Assert.assertEquals(vetorC1, vetorC1);


    }

    @Test
    public void testVerificarCpfClienteTrue() {
        VetorClientes vetorC = new VetorClientes();
        vetorC.adicionarCliente(
                new Pessoas("Ana", "1234-1234", "111.111.111-11"));

        Assert.assertTrue(vetorC.verificarCpfCliente("111.111.111-11"));
    }

    @Test
    public void testVerificarCpfClienteFalse() {
        VetorClientes vetorC = new VetorClientes();
        vetorC.adicionarCliente(
                new Pessoas("Ana", "1234-1234", "111.111.111-11"));

        Assert.assertFalse(vetorC.verificarCpfCliente("222.222.222-22"));
    }
}