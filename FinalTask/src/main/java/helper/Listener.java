package helper;

import base.TestBase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;


public class Listener implements ITestListener {

    @Attachment(value = "Screenshot", type = "image/pmg")

    private byte[] makeScreenshot() {
        return ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
    }

    private void makeScreenShotInFolder(String name) throws IOException {
        Date now = new Date();
        File screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("Screenshot\\"+name+DateFormat.getInstance().format(now)+
                System.currentTimeMillis()+".png"));
    }

    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {
        makeScreenshot();
        try {
            makeScreenShotInFolder("success\\screenshot");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestFailure(ITestResult result) {
        makeScreenshot();
        try {
            makeScreenShotInFolder("failure\\screenshot");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }

}
