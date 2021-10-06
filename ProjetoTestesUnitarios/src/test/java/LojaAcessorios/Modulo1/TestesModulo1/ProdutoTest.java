package LojaAcessorios.Modulo1.TestesModulo1;

import Classes1.Produto;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;



//FALTA FAZER MAIS UM TESTE
public class ProdutoTest extends TestCase {

    @Test
    public void testGetNome() {
        Produto produto = new Produto("Colar de Perolas", 2000.00);
        Assert.assertEquals("Colar de Perolas", produto.getNome());

    }

    @Test
    public void testEqualsProduto() {
        Produto produto1 = new Produto("Pulseira de prata", 200.00);
        Produto produto2 = new Produto("Pingente", 20.00);


        Assert.assertEquals(produto1, produto1);

    }

    @Test
    public void testRemoverTrue(){
        Produto produto = new Produto("Pulseira", 20.00);
        produto.addProduto(produto);

        Assert.assertTrue(produto.removerProduto("Pulseira"));
    }

    @Test
    public void testRemoverFalse(){
        Produto produto = new Produto("Pulseira", 20.00);
        produto.addProduto(produto);

        Assert.assertFalse(produto.removerProduto("Pulseira azul"));
    }








}