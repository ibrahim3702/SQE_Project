package utilities;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Allure;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        byte[] imageBytes = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot on Failure", "image/png", new ByteArrayInputStream(imageBytes), "png");
    }
}

