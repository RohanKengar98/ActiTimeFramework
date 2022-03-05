package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class workScheduleTab {
	//Declaration
	@FindBy(id = "formatSelectorElm") private WebElement selectTheNumberOfMonthsToView;
	@FindBy(id = "monthSelectorElm") private WebElement monthSelectDropdown;
	
	//Initialization
	public workScheduleTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getSelectTheNumberOfMonthsToView() {
		return selectTheNumberOfMonthsToView;
	}
	public WebElement getMonthSelectDropdown() {
		return monthSelectDropdown;
	}
	
	//Implementation
	public void selectTheNumberOfMonthsToView() {

	}
	public void monthSelectDropdown(int option) {
		WebElement msd = monthSelectDropdown;
		Select sel = new Select(msd);
		sel.selectByIndex(option);
	}

}
