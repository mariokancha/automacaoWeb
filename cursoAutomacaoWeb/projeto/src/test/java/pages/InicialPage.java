package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import map.InicialMap;


public class InicialPage {

   InicialMap inicialMap = new InicialMap();

    public void setPesquisa(final CharSequence... valor) {
        inicialMap.pesquisa.sendKeys(valor);
    }

    public String getTituloLivro() {
        final String livro = inicialMap.tituloLivro.getText();
        return livro;
    }

    public String getValorLivro() {
        final String valor = inicialMap.preco.getText();
        return valor;
    }

    public String getListrarLivros() {
        List<WebElement> livros = inicialMap.pesquisaLivros.getElements();
        for (WebElement elLivro : livros) {
            inicialMap.listrarLivros.setWebElement(elLivro);
            String titulo = inicialMap.listrarLivros.getText();
            String livro = getTituloLivro();
            System.out.println(livro);
            if (titulo.contains(livro)) {
              inicialMap.preco.setWebElement(elLivro);
              System.out.println("Livro encontrado");
              return inicialMap.elPrecoLista.getText();
            } else {
                System.out.println("Livro Não encontrado");
            }
        }
        return null;
    }


}