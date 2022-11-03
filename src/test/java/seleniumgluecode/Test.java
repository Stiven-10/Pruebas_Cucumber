package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    private ChromeDriver driver;

    @Given("^el usuario se encuentra en la página Home de Falabella$")
    public void el_usuario_se_encuentra_en_la_página_Home_de_Falabella() throws Throwable {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.falabella.com.co/falabella-co");
        driver.manage().window().maximize();

    }

    @When("^se introduce la palabra de búsqueda “Portátil Asus Zenbook (\\d+) OLED UM(\\d+)YA (\\d+) pulgadas AMD RYZEN R(\\d+) (\\d+)GB (\\d+)GB”$")
    public void se_introduce_la_palabra_de_búsqueda_Portátil_Asus_Zenbook_OLED_UM_YA_pulgadas_AMD_RYZEN_R_GB_GB(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
        WebElement barraBusqueda = driver.findElement(By.xpath("//input[@id='testId-SearchBar-Input']"));
        barraBusqueda.sendKeys("Portátil Asus Zenbook 14 OLED UM3402YA 14 pulgadas AMD RYZEN R7 16GB 512GB");
        WebElement botonBusqueda = driver.findElement(By.className("SearchBar-module_searchBtnIcon__6KVum"));
        botonBusqueda.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("^se muestra el resultado de “Portátil Asus Zenbook (\\d+) OLED UM(\\d+)YA (\\d+) pulgadas AMD RYZEN R(\\d+) (\\d+)GB (\\d+)GB”$")
    public void se_muestra_el_resultado_de_Portátil_Asus_Zenbook_OLED_UM_YA_pulgadas_AMD_RYZEN_R_GB_GB(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
        WebElement marcaProducto = driver.findElement(By.id("pdp-product-brand-link"));
        Assert.assertTrue("No se redirecciono correctamente a la página del producto", marcaProducto.isDisplayed());
        Assert.assertEquals("ASUS", marcaProducto.getText());
    }

    @Then("^de acuerdo con los resultados, dar clic en el botón “Agregar a la Bolsa”$")
    public void de_acuerdo_con_los_resultados_dar_clic_en_el_botón_Agregar_a_la_Bolsa() throws Throwable {
        WebElement botonAgregar_bolsa = driver.findElement(By.id("buttonForCustomers"));
        botonAgregar_bolsa.click();

    }

    @Then("^de acuerdo con los resultados, dar clic en el botón “Ver Bolsa de Compras”$")
    public void de_acuerdo_con_los_resultados_dar_clic_en_el_botón_Ver_Bolsa_de_Compras() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement boton_bolsa_Compras = driver.findElement(By.id("linkButton"));
        boton_bolsa_Compras.click();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.quit();

    }


    @Given("^el usuario quiere finalizar el proceso de comprar para poder disfrutar de su producto\\.$")
    public void el_usuario_quiere_finalizar_el_proceso_de_comprar_para_poder_disfrutar_de_su_producto() throws Throwable {


    }

    @When("^se introduce un correo electrónico <Correo>$")
    public void se_introduce_un_correo_electrónico_Correo() throws Throwable {

    }

    @When("^seleccionar el departamento de <Deparatamente>$")
    public void seleccionar_el_departamento_de_Deparatamente() throws Throwable {

    }

    @When("^seleccionar la ciudad de <Ciudad>$")
    public void seleccionar_la_ciudad_de_Ciudad() throws Throwable {

    }

    @When("^seleccionar el barrio de <Barrio>$")
    public void seleccionar_el_barrio_de_Barrio() throws Throwable {

    }



}
