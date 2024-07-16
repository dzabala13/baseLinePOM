package co.ingDanielZabala.steps;

import co.ingDanielZabala.pages.AttendanParty;
import co.ingDanielZabala.pages.HostPartyPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class DetallesFiestaStep {

    @Page
    HostPartyPage hostPartyPage;
    @Page
    AttendanParty attendanParty;

    @Step
    public void detallesFiestaSegunRol(String rol, String tematicaFiesta){

        if (rol.equals("HOSTING")) {
            hostPartyPage.seleccionarRol();
            hostPartyPage.seleccionarTipoFiesta(tematicaFiesta);
        } else if (rol.equals("ATTENDING")) {
            attendanParty.seleccionarRol();
            attendanParty.seleccionarTipoFiesta(tematicaFiesta);
        } else {
            System.out.println("No se encontro el tipo de opcion indicada");
        }
    }



}
