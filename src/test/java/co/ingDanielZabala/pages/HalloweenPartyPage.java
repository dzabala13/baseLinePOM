package co.ingDanielZabala.pages;

import net.serenitybdd.core.pages.WebElementFacade;

public class HalloweenPartyPage extends BasePage{

    String xpathBotonAnfrition = "//*[contains(@href,'-a-party')  and contains(text(),'I Am COMODIN A Party')]";
    WebElementFacade botonAnfrition;

    public void seleccionarRol(String rol) {
        botonAnfrition=setParametro(xpathBotonAnfrition,rol);
        botonAnfrition.click();
    }

}
