package co.ingDanielZabala.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HostPartyPage extends BasePage {

    @FindBy(xpath = "//*[@href='/host-a-party-1']")
    WebElementFacade botonAnfrition;

    @FindBy(xpath = "//*[@href='/party-location' and contains(text(),'Zombies')]")
    WebElementFacade botonFiestaTipoZombies;


    @FindBy(xpath = "//*[@href='/party-location' and contains(text(),'Ghosts')]")
    WebElementFacade boyonFiestaTipoGhosts;


    public void seleccionarRol() {
        botonAnfrition.click();

    }

    public void seleccionarTipoFiesta(String tematicaFiesta) {

        if (tematicaFiesta.equals("Ghosts")) {
            botonFiestaTipoZombies.click();
        } else if (tematicaFiesta.equals("Zombies")) {
            boyonFiestaTipoGhosts.click();
        } else {
            System.out.println("No se encontro el tipo de opcion indicada");
        }
    }
}