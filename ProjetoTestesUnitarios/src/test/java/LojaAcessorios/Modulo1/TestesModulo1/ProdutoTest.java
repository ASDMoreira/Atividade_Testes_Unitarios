package LojaAcessorios.Modulo1.TestesModulo1;

import LojaAcessorios.Modulo1.Classes1.Produto;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//FALTA FAZER MAIS UM TESTE
public class ProdutoTest extends TestCase {

    @Test
    public void testGetNome() {
        Produto produto = new Produto("Colar de Perolas", 2000.00);
        Assert.assertEquals("Colar de Perolas", produto.getNome());

    }


}