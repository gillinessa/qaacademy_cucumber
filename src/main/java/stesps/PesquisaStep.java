package stesps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PesquisaPages;


public class PesquisaStep {
    WebDriver driver;
    PesquisaPages PesquisaPage;

    @Dado("que o usuaruio esta em {string}")
public void que_o_usuaruio_esta_em(String url) {
        driver = new ChromeDriver();
        driver.get(url);
}
    @Quando("pesquisa por {string}")
    public void pesquisa_por(String palavraDaPesquisa) {
        PesquisaPage = new PesquisaPages();
    driver.findElement(By.id(PesquisaPage.barraDePesquisa)).sendKeys(palavraDaPesquisa);
    driver.findElement(By.id(PesquisaPage.barraDePesquisa)).sendKeys(Keys.ENTER);



    }
    @Entao("retorne um link relacionado a pesquisa")
    public void retorne_um_link_relacionado_a_pesquisa() {
        driver.findElement(By.xpath(PesquisaPage.linkPesquisa)).isDisplayed();

    }

}
