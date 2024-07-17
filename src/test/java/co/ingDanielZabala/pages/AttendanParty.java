package co.ingDanielZabala.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AttendanParty extends BasePage{

    String xpathBotonTipoFiesta = "//*[@href='/party-location' and contains(text(),'COMODIN')]";
    WebElementFacade botonTipoFiesta;

    public void seleccionarTipoFiesta(String tematicaFiesta) throws Exception {
        if(!tematicaFiesta.equals("Scared")){
        botonTipoFiesta=setParametro(xpathBotonTipoFiesta,tematicaFiesta);
        botonTipoFiesta.click();
        }else{
            throw new Exception("La pagina a la cual se accedio se encuentra en mantenimiento");
        }

    }
}
