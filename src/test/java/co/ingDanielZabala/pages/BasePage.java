package co.ingDanielZabala.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import static co.ingDanielZabala.utils.Constantes.COMODIN;

public class BasePage extends PageObject {

    public void cambiarIframe(WebElementFacade frame){
        getDriver().switchTo().frame(frame);
    }

    public void regresarDelFrame(){
        getDriver().switchTo().defaultContent();
    }

    public void cambiarPestana(){
        String ventanaActual = getDriver().getWindowHandle();
        for (String pestana : getDriver().getWindowHandles()){
            if(!pestana.equals(ventanaActual)){
                getDriver().switchTo().window(pestana);
                break;
            }
        }
    }

    public void regresarPaginaInicial(String paginaInicial){
        getDriver().switchTo().window(paginaInicial);
    }

    public void aceptarAlert(){
        getDriver().switchTo().alert().accept();
    }

    public void rechazarAlert(){
        getDriver().switchTo().alert().dismiss();
    }

    public void obtenerInfoAlert(){
        getDriver().switchTo().alert().getText();
    }

    public WebElementFacade setParametro(String xpath, String parametro){
        String nuevoXpath = xpath.replace(COMODIN, parametro);
        return find(By.xpath(nuevoXpath));
    }


}
