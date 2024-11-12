package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage{

    // Constructor
    public HomePage (WebDriver driver){
        super(driver); // driver herdado de CommonPage - Super Classe
        PageFactory.initElements(driver, this);
    }
    
    // Elementos Mapeados

    // Mapeamento para os combos Origem e Destino
    public By bylocal (String local){
        return By.cssSelector("option[value=\"" + local + "\"]");
        // toda vez que tem um \" a " vai ser ignorada na 1a vez, mas será usada na segunda vez
        // fica assim na execução: option[value="Rome"]
    }

    @FindBy(css = "input[value]")
        WebElement btnFindFlights;

    // Ações
}
