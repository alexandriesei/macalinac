package madalinaparking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ParkingCalculator {
    WebDriver webDriver;
    By chooseAlotLocator=By.id("Lot");
    By chooseEntryDateAndTimeLocator= By.id("EntryTime");
    By chooseLeavingDateAndTimeLocator= By.id("ExitTime");

    public ParkingCalculator(WebDriver driver){
        this.webDriver=driver;
    }

    public void populateChooseALot(int index){
       Select chooseAlot =new Select(webDriver.findElement(chooseAlotLocator));
        chooseAlot.selectByIndex(index);
    }

    public void populateDateAndTime(String time){
        webDriver.findElement(chooseEntryDateAndTimeLocator).sendKeys(time);

    }


}
