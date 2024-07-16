package co.ingDanielZabala.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class InicioPage extends BasePage {

    @FindBy(xpath = "//*[@id='popup-widget238491-close-icon']")
    WebElementFacade anuncio;

    @FindBy(xpath = "//*[@data-aid='HEADER_NAV_RENDERED']//child::a[@href='/halloween-party' and @data-ux='NavLink']")
    WebElementFacade opcionMenuParty;


    public void manejoAnuncio() {
    if (anuncio.isVisible()){ anuncio.click();}
    }

    public void seleccionOpcionMenu() {
        opcionMenuParty.click();
    }
}
