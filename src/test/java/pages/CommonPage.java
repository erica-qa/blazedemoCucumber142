package pages;

import org.openqa.selenium.WebDriver;

public class CommonPage {
  
    public WebDriver driver; // bola quando recebe o passe - Passa a Controlar o Selenium que recebe da base

    // construtor - conecta o exterior com o interior da classe
    public CommonPage(WebDriver driver){
        this.driver = driver;
    }

    //TODO: Vamos colocar funções em comum nas páginas aqui

}
