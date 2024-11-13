package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservePage extends CommonPage{
// Constructor
  public ReservePage(WebDriver driver){
    super(driver);
    PageFactory.initElements(driver, this);
  }
// Mapeamento para os combos Origem e Destino
  @FindBy(css = "h3")
  WebElement flightsHeader; // cabeçalhodos vôos

// Ações
  public String lerCabecalhoVoos(){
    return flightsHeader.getText();
  }

}
