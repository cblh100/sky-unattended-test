import com.gargoylesoftware.htmlunit.BrowserVersion
import org.openqa.selenium.htmlunit.HtmlUnitDriver

/**
 * Configure geb allow the use of JavaScript and pretend to be Chrome
 */
driver = {
  def drv = new HtmlUnitDriver(BrowserVersion.CHROME)
  drv.javascriptEnabled = true
  drv
}
