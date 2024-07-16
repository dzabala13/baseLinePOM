package co.ingDanielZabala.stepdefinitions;

import co.ingDanielZabala.pages.ConfirmationPage;
import co.ingDanielZabala.pages.GuestPage;
import co.ingDanielZabala.pages.HostPartyPage;
import co.ingDanielZabala.pages.InicioPage;
import co.ingDanielZabala.steps.DetallesFiestaStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.fluentlenium.core.annotation.Page;

public class LibreriaStepDefinition {

    @Steps
    DetallesFiestaStep detallesFiestaStep;

    @Page
    InicioPage inicioPage;

    @Page
    HostPartyPage  hostPartyPage;

    @Page
    GuestPage   guestPage;
    @Page
    ConfirmationPage confirmationPage;


    @Given("el usuario esta en la pagina")
    public void elUsuarioEstaEnLaPagina()  {
        inicioPage.open();
    }

    @Given("el usurio va a la seccion de Halloween Party")
    public void elUsurioVaALaSeccionDeHalloweenParty() {
        inicioPage.manejoAnuncio();
        inicioPage.seleccionOpcionMenu();
    }
    @When("el usuario indica que sera {word} y que la tematica de la fiesta sera {word}")
    public void elUsuarioIndicaQueSeraHosterYQueLaTematicaDeLaFiestaSeraZombie(String rol, String tematicaFiesta) throws InterruptedException {

        detallesFiestaStep.detallesFiestaSegunRol(rol,tematicaFiesta);

        //hostPartyPage.seleccionarRol();
        //hostPartyPage.seleccionarTipoFiesta(tematicaFiesta);
    }

    @When("el ususario indica la cantidad de invitados {int} e ingresa su {word}")
    public void elUsusarioIndicaLaCantidadDeInvitadosEIngresaSuCorreoElectronico(int invitados, String correoElectronico) {
        guestPage.seleccionarNumeroInvitados(invitados);
        guestPage.ingresarEmail(correoElectronico);
    }

    @Then("el usuario valida que la fiesta se haya sido programada correctamente")
    public void elUsuarioValidaQueLaFiestaSeHayaSidoProgramadaCorrectamente() {
        confirmationPage.validacionDeFiesta();
    }



}
