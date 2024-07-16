package co.ingDanielZabala.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AttendanParty extends BasePage{

    String xpathBotonTipoFiesta = "//*[@href='/party-location' and contains(text(),'COMODIN')]";
    WebElementFacade botonTipoFiesta;

    public void seleccionarTipoFiesta(String tematicaFiesta) {
        botonTipoFiesta=setParametro(xpathBotonTipoFiesta,tematicaFiesta);
        botonTipoFiesta.click();
    }
}
