package co.ingDanielZabala.steps;

import co.ingDanielZabala.pages.AttendanParty;
import co.ingDanielZabala.pages.HalloweenPartyPage;
import co.ingDanielZabala.pages.HostPartyPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class TipoFiestaStep {

    @Page
    HostPartyPage hostPartyPage;
    @Page
    AttendanParty attendanParty;
    @Page
    HalloweenPartyPage halloweenPartyPage;

    @Step
    public void detallesFiestaSegunRol(String rol, String tematicaFiesta) throws Exception {

        halloweenPartyPage.seleccionarRol(rol);

        if (rol.equals("Hosting")) {
            hostPartyPage.seleccionarTipoFiesta(tematicaFiesta);
        } else if (rol.equals("Attending")) {
            attendanParty.seleccionarTipoFiesta(tematicaFiesta);
        } else {
            System.out.println("No se encontro el tipo de opcion indicada");
        }
    }


}
