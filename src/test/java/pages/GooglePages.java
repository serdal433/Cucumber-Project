package pages;

import org.openqa.selenium.support.PageFactory;
import utiluties.Driver;

public class GooglePages {
    public GooglePages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
