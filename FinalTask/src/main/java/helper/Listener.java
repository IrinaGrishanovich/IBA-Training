package helper;


import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;


public class Listener implements ITestListener {

    @Attachment(value = "Screenshot", type = "image/png")
    private byte[] captureScreenshot() {
        TakesScreenshot screenshot = (TakesScreenshot) WebDriverRunner.getWebDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }

    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {

    }

    public void onTestFailure(ITestResult result) {
        captureScreenshot();
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
