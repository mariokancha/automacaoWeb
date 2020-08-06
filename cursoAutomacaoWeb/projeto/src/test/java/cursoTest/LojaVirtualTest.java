package cursoTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

import core.Driver;
import pages.InicialPage;

public class LojaVirtualTest extends BaseTest{

    InicialPage livro = new InicialPage();

    //Classe para criação de testes

    @Test
    public void abreFechaNavegador(){
        openBrowser();
        fechaNavegador();
    }
    
    @Test
    public void pesquisaLivro(){
        livro.setPesquisa("Fortaleza Digital", Keys.ENTER);
        //pesquisa.sendKeys("fortaleza digital", Keys.ENTER);
    }

    @Test
    public void validaNomeLivro() {
        Driver.setUrl("https://lojaexemplod.lojablindada.com");
        pesquisaLivro();
        Assert.assertEquals(livro.getTituloLivro(), "[PRODUTO DE EXEMPLO] - Fortaleza Digital"); 
        System.out.println(livro.getTituloLivro());
        Assert.assertEquals("R$519,90", livro.getValorLivro()); 
        System.out.println(livro.getValorLivro());
    }

    @Test
    public void listaValorLivros(){
        pesquisaLivro();
        Assert.assertEquals("R$799,90", livro.getListrarLivros());        
    }

}