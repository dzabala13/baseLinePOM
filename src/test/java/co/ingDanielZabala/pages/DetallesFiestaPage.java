package co.ingDanielZabala.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DetallesFiestaPage extends BasePage{




    @FindBy(xpath="//iframe[starts-with(@id,'iframe')]")
    WebElementFacade iframe;

    @FindBy(xpath="//select[@name='guests']")
    WebElementFacade selectCantidadInvitados;

    @FindBy(xpath = "//input[starts-with(@id,'input')]")
    WebElementFacade inputEmail;
    @FindBy(xpath = "//button[@data-aid='SUBSCRIBE_SUBMIT_BUTTON_REND']")
    WebElementFacade botonRemind;
    @FindBy(xpath = "//a[@data-aid='CONTENT_CTA_BTN_RENDERED']")
    WebElementFacade botonFindOutMore;


    public void seleccionarNumeroInvitados(int invitados) {
        cambiarIframe(iframe);
        selectCantidadInvitados.selectByVisibleText(String.valueOf(invitados));
        regresarDelFrame();
    }

    public void ingresarEmail(String correoElectronico) {
        inputEmail.type(correoElectronico);
        botonRemind.click();
        botonFindOutMore.click();
    }
}
