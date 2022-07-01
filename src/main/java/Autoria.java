import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Autoria {
    By brand = By.xpath("//input[@id='brandTooltipBrandAutocompleteInput-brand']");
    By model = By.xpath("//input[@id='brandTooltipBrandAutocompleteInput-model']");
    By region = By.xpath("//input[@id='brandTooltipBrandAutocompleteInput-region']");
    By yearFrom = By.xpath("//select[@id='yearFrom']");
    By yearTo = By.xpath("//select[@id='yearTo']");
    By priceFrom = By.xpath("//input[@id='priceFrom']");
    By priceTo = By.xpath("//input[@id='priceTo']");
    By submitButton = By.xpath("//button[@type='submit']");

    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auto.ria.com/uk/");

        driver.findElement(brand).sendKeys("Ford");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@data-value='24']")).click();
        driver.findElement(model).sendKeys("Edge");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@data-value='1945']")).click();
        driver.findElement(region).sendKeys("Одеса");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Одеса']")).click();
        driver.findElement(yearFrom).sendKeys("2014");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='2014']")).click();
        driver.findElement(yearTo).sendKeys("2022");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[@value='2022']")).click();
        driver.findElement(priceFrom).sendKeys("15000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='price_ot']")).click();
        driver.findElement(priceTo).sendKeys("35000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='price_do']")).click();
        driver.findElement(submitButton).click();
        Thread.sleep(2000);


       //Assert.assertEquals("https://auto.ria.com/uk/search/?categories.main.id=1&price.currency=1&price.USD.gte=15000&price.USD.lte=35000&indexName=auto,order_auto,newauto_search&region.id[0]=12&brand.id[0]=24&model.id[0]=1945&year[0].gte=2014&year[0].lte=2022&size=20");
        //import org.junit.Assert;

    }
}
