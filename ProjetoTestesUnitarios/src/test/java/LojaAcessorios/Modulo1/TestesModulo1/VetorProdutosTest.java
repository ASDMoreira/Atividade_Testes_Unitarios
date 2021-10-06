package LojaAcessorios.Modulo1.TestesModulo1;
import LojaAcessorios.Modulo1.Classes1.Produto;
import LojaAcessorios.Modulo1.Classes1.VetorProdutos;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class VetorProdutosTest extends TestCase {


    @Test
    public void testAdicionarProduto() {

        VetorProdutos vetor1 = new VetorProdutos();
        VetorProdutos vetor2 = new VetorProdutos();

        vetor1.adicionarProduto(
                new Produto("Cordão", 100.00));
        vetor2.adicionarProduto(
                new Produto("Pulseira", 50.00));

        Assert.assertEquals(vetor1, vetor1);

    }


    @Test
    public void testVerificarValorProdutoTrue() {
        VetorProdutos vetor3 = new VetorProdutos();
        vetor3.adicionarProduto(
                new Produto("Pingente", 20.00));

        Assert.assertTrue(vetor3.verificarValorProduto("Pingente"));
    }


    @Test
    public void testVerificarValorProdutoFalse() {
        VetorProdutos vetor4 = new VetorProdutos();
        vetor4.adicionarProduto(
                new Produto("Pingente", 20.00));

        Assert.assertFalse(vetor4.verificarValorProduto("Colar"));
    }


}