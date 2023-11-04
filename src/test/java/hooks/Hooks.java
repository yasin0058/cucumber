package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
//hooks class ekran görüntüsünü yalnızca failed adımlarda alır onun dışında çalışmaz.
    @Before
    public void setUpScenario(){
        System.out.println("Before Hooks");
    }
    @After
    public void tearDown(Scenario scenario){
      //  System.out.println("After Hooks");
        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

           if (scenario.isFailed()){
               scenario.attach(screenshot, "image/png", "Screenshot of Failed step");
                Driver.closeDriver();
           }

    }

    //conditional hooks
    @After("@failed and @iPhone")
    public void tearDownAfterAllScenario(){
        System.out.println("Conditional Hooks");

    }


}
