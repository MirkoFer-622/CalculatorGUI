package CalculatorGUITest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SubtractionTest {

  private WebDriver driver;

  /**
   * Preconditions to run before tests
   */
  @BeforeEach
  public void setUpFirefox() {
    System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
    driver = new FirefoxDriver();
  }

  /**
   * Postconditions to run after tests.
   */
  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  /**
   * Test for division from GUI.
   */
  @Test
  public void additionGuiTest() {
    driver.get("https://www.calculadora.org/");
    driver.findElement(By.xpath("//span[text()=\'1\']")).click();
    driver.findElement(By.xpath("//span[text()=\'4\']")).click();
    driver.findElement(By.xpath("//span[text()=\'+\']")).click();
    driver.findElement(By.xpath("//span[text()=\'7\']")).click();
    String operation = driver.findElement(By.cssSelector(".screen")).getText();
    driver.findElement(By.cssSelector(".eval")).click();
    assertEquals(driver.findElement(By.cssSelector(".screen")).getText(), Calculator.calculates(operation));
  }

  /**
   * Test for subtraction from GUI.
   */
  @Test
  public void multiplicationGuiTest() {
    driver.get("https://www.calculadora.org/");
    driver.findElement(By.xpath("//span[text()=\'1\']")).click();
    driver.findElement(By.xpath("//span[text()=\'0\']")).click();
    driver.findElement(By.xpath("//span[text()=\'x\']")).click();
    driver.findElement(By.xpath("//span[text()=\'4\']")).click();
    driver.findElement(By.xpath("//span[text()=\'.\']")).click();
    driver.findElement(By.xpath("//span[text()=\'8\']")).click();
    String operation = driver.findElement(By.cssSelector(".screen")).getText();
    driver.findElement(By.cssSelector(".eval")).click();
    assertEquals(driver.findElement(By.cssSelector(".screen")).getText(), Calculator.calculates(operation));
  }

  /**
   * Test for multiplication from GUI.
   */
  @Test
  public void divisionGuiTest() {
    driver.get("https://www.calculadora.org/");
    driver.findElement(By.xpath("//span[text()=\'1\']")).click();
    driver.findElement(By.xpath("//span[text()=\'0\']")).click();
    driver.findElement(By.xpath("//span[12]")).click(); //Button that contains the division symbol.
    driver.findElement(By.xpath("//span[text()=\'4\']")).click();
    String operation = driver.findElement(By.cssSelector(".screen")).getText();
    driver.findElement(By.cssSelector(".eval")).click();
    assertEquals(driver.findElement(By.cssSelector(".screen")).getText(), Calculator.calculates(operation));
  }

  /**
   * Test for multiplication from GUI.
   */
  @Test
  public void subtractionGuiTest() {
    driver.get("https://www.calculadora.org/");
    driver.findElement(By.xpath("//span[text()=\'3\']")).click();
    driver.findElement(By.xpath("//span[text()=\'6\']")).click();
    driver.findElement(By.xpath("//span[text()=\'-\']")).click();
    driver.findElement(By.xpath("//span[text()=\'4\']")).click();
    driver.findElement(By.xpath("//span[text()=\'4\']")).click();
    String operation = driver.findElement(By.cssSelector(".screen")).getText();
    driver.findElement(By.cssSelector(".eval")).click();
    assertEquals(driver.findElement(By.cssSelector(".screen")).getText(), Calculator.calculates(operation));
  }

}
