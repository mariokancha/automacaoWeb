package map;

import core.Element;
import enums.ByValue;

public class InicialMap {

    public Element pesquisa =  new  Element(ByValue.ID, "search");
    public Element tituloLivro =  new  Element(ByValue.XPATH, "//h2/a");
    public Element preco =  new  Element(ByValue.CSS, "#product-price-44 > span");
    public Element pesquisaLivros = new Element(ByValue.CSS, "ul.products-grid > li");
    public Element listrarLivros  = new Element(ByValue.CSS, "h2 > a"); 
    public Element elPrecoLista =  new Element(ByValue.CSS, "span.price");
    
} 