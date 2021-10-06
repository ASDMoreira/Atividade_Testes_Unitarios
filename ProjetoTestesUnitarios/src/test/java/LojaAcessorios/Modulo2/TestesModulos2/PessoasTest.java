package LojaAcessorios.Modulo2.TestesModulos2;

import LojaAcessorios.Modulo1.Classes1.Produto;
import LojaAcessorios.Modulo2.Classes2.Clientes;
import LojaAcessorios.Modulo2.Classes2.Pessoas;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PessoasTest extends TestCase {

    @Test
    public void testGetNome() {
        Pessoas pessoa = new Pessoas("Kássia", "1234-5678", "111.111.111-11");
        Assert.assertEquals("Kássia", pessoa.getNome());
    }

    @Test
    public void testEqualsPessoa() {
        Pessoas pessoas1 = new Pessoas("Anderson", "1234-5678", "123.123.123-12");
        Pessoas pessoas2 = new Pessoas("Ana", "1111-2222", "333.333.333-33");


        Assert.assertEquals(pessoas1,pessoas1);

    }

    @Test
    public void testExistePessoaTrue(){
        Pessoas vetorP = new Pessoas("João", "1234-1234", "333.333.333-33");
        vetorP.addPessoa(vetorP);


        Assert.assertTrue(vetorP.verificarSePessoaExiste("333.333.333-33"));
    }

    @Test
    public void testExisteClienteFalse(){
        Pessoas vetorP = new Pessoas("João", "1234-1234", "333.333.333-33");
        vetorP.addPessoa(vetorP);

        Assert.assertFalse(vetorP.verificarSePessoaExiste("123.123.123-12"));
    }
}