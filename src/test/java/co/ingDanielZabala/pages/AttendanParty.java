package co.ingDanielZabala.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AttendanParty extends BasePage{

    @FindBy(xpath = "//*[@href='/attend-a-party']")
    WebElementFacade botonAsistente;

    @FindBy(xpath = "//*[@href='/party-location' and contains(text(),'Ghostville')]")
    WebElementFacade boyonFiestaTipoGhostville;
    @FindBy(xpath = "//*[@href='/party-location' and contains(text(),'Zombieton')]")
    WebElementFacade boyonFiestaTipoZombieton;


    public  void seleccionarRol() {
        botonAsistente.click();
    }

    public  void seleccionarTipoFiesta(String tematicaFiesta) {

        if (tematicaFiesta.equals("Ghostville")) {
            boyonFiestaTipoGhostville.click();
        } else if (tematicaFiesta.equals("Zombieton")) {
            boyonFiestaTipoZombieton.click();
        } else {
            System.out.println("No se encontro el tipo de opcion indicada");
        }

    }
}
