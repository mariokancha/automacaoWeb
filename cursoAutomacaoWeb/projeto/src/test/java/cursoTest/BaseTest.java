package cursoTest;

import org.junit.After;
import org.junit.Before;


import core.Driver;

public class BaseTest {

     //Criação do método para abrir o navegador.

    @Before
    public void openBrowser(){
      Driver.openBrowser();
    }

    @After
    public void fechaNavegador(){
        Driver.fechaNavegador();
    }

    
}