package stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.WaitUtils;
import java.util.List;
import java.util.Map;
import static utilities.WaitUtils.waitFor;
public class ExcelStepDefs {
    ExcelUtils excelUtils;
    DataTablesPage dataTablesPage;
    List<Map<String, String>> dataList;
    @Given("user enters {string} from {string} and verify user is created")
    public void user_enters_from_and_verify_user_is_created(String sheetName, String excelFileName) {
        String path = "./src/test/resources/"+excelFileName;  // dynamic way
        excelUtils = new ExcelUtils(path, sheetName);
        dataTablesPage = new DataTablesPage();
        dataList = excelUtils.getDataList();
        for (Map<String, String> eachData : dataList){
            System.out.println(eachData);
//        Click on the new button
            dataTablesPage = new DataTablesPage(); // Creating the page object
//            Driver.getDriver().get("https://editor.datatables.net/");
            WaitUtils.waitFor(1);
            dataTablesPage.newButton.click();
            WaitUtils.waitFor(1);
//        When user enters all fields
            dataTablesPage.firstName.sendKeys(eachData.get("first_name"));
            WaitUtils.waitFor(1);
            dataTablesPage.lastName.sendKeys(eachData.get("last_name"));
            WaitUtils.waitFor(1);
            dataTablesPage.position.sendKeys(eachData.get("position"));
            WaitUtils.waitFor(1);
            dataTablesPage.office.sendKeys(eachData.get("office"));
            WaitUtils.waitFor(1);
            dataTablesPage.extension.sendKeys(eachData.get("extension"));
            WaitUtils.waitFor(1);
            dataTablesPage.startDate.sendKeys(eachData.get("start_date"));
            WaitUtils.waitFor(1);
            dataTablesPage.salary.sendKeys(eachData.get("salary"));
            WaitUtils.waitFor(1);
//        When user clicks on ‘create’ button
            dataTablesPage.createButton.click();
            WaitUtils.waitFor(1);
//        And search for the first name
            dataTablesPage.searchField.sendKeys(eachData.get("first_name"));
            WaitUtils.waitFor(1);
//        Then verify the name field contains first name
            Assert.assertTrue(dataTablesPage.nameField.getText().contains(eachData.get("first_name")));
            WaitUtils.waitFor(1);
            Driver.getDriver().navigate().refresh();
        }
    }
}
