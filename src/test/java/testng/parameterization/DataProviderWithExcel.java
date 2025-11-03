package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {

    @DataProvider(name = "test-data")
    public Object[][] setData() throws IOException {
        Object[][] ao = getExcelData("D:\\classes\\TestNGDemoForMorningBatch.xlsx", "TestCases");
        return ao;
    }

    public static Object[][] getExcelData(String filePathName, String sheetName) throws IOException {
        FileInputStream fp = new FileInputStream(filePathName); //File Access
        Workbook wb = new XSSFWorkbook(fp); //Excel Sheet Access
        Sheet sh = wb.getSheet(sheetName);  //Access Sheet name

        int rows = sh.getPhysicalNumberOfRows();
        int cols = sh.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {
            Row r = sh.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell c = r.getCell(j);
                data[i - 1][j] = c.toString();
            }
        }
        return data;
    }

    @Test(dataProvider = "test-data")
    public void verifyLogin(String userName, String password) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        driver.close();
    }
}
