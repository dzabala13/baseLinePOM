package co.ingDanielZabala.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ConfirmationPage extends BasePage{

    @FindBy(xpath="//h1[@data-aid='COUNTDOWN_RUNNING_HEADLINE_RENDERED']")
    WebElementFacade tituloConfirmacionFiesta;

    public void validacionDeFiesta() {

        assertThat("Your Halloween Party is almost here!", is(equalTo(tituloConfirmacionFiesta.getText())));

    }
}
