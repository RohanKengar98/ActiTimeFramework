package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class settingsTab {
	//Declaration
	
	//general Settings  ////Time-Track Hierarchy Levels
	@FindBy(name = "firstHierarchyLevelCode") private WebElement topGroupingLevelDropdown;
	@FindBy(name = "secondHierarchyLevelCode") private WebElement middleGroupingLevelDropdown;
	@FindBy(name = "thirdHierarchyLevelCode") private WebElement timeEntryLevelDropdown;
	//Time-Track   ////Maximum reported hours per day:
	@FindBy(id = "hoursPerDayLimited_LimitTo") private WebElement limitToRadioBtn;
	@FindBy(id = "maximumMinutesPerDayId") private WebElement limitToTextbox;//in Hours
	@FindBy(id = "hoursPerDayLimited_Unlimited") private WebElement unlimitedRadioBtn;
	//Leave Time
	@FindBy(id = "enable_leave_tt") private WebElement enableLeaveTimeTarckCheckbox;
	//Control of Overtime / Undertime
	@FindBy(id = "overtime_undertime") private WebElement enableUndertimeRegistrationRadioBtn;
	//Formats    ////Calendar and Date Format
	@FindBy(name = "weekStartDay") private WebElement calenderLayoutDropdown;
	@FindBy(name = "dateFormat") private WebElement dateFormatDropdown;
	//Time Zone
	@FindBy(name = "defaultTimeZone") private WebElement defaultTimeZoneDropdown;
	//Numbers Format
	@FindBy(id = "decimalSeparatorFieldPredefined") private WebElement decimalSeparatorDropdown;
	@FindBy(id = "digitGroupingSymbolFieldPredefined") private WebElement digitGroupingSymbolDropdown;
	//saveSettingsButton of General Settings Tab=saveSettingsBtnGS
	@FindBy(id = "saveSettingsButton") private WebElement saveSettingsBtnGS;
	
	//logo & color scheme
	@FindBy(xpath = "//a[.='Logo & Color Scheme']") private WebElement logoAndColorSchemeBtn;
	@FindBy(name = "colorScheme") private WebElement colorSchemeDropdown;
	//Configure Logo for actiTIME Interfaces
	@FindBy(id = "useDefaultLogoOption") private WebElement useDefaultLogoRadioBtn1;
	@FindBy(id = "uploadNewLogoOption") private WebElement useCustomLogoRadioBtn1;
	@FindBy(name = "formCustomInterfaceLogo.logo") private WebElement chooseFileBtn1;
	//Configure Logo for Printable Reports and Invoices
	@FindBy(id = "noReportLogo") private WebElement doNotShowLogoRadioBtn;
	@FindBy(id = "useDefaultReportLogoOption") private WebElement useDefaultLogoRadioBtn2;
	@FindBy(id = "uploadNewReportLogoOption") private WebElement useCustomLogoRadioBtn2;
	@FindBy(name = "formCustomReportLogo.logo") private WebElement chooseFileBtn2;
	//saveSettingsButton of Logo & color Scheme= saveSettingsBtnLCS
	@FindBy(xpath = "//input[@value='Save Settings']") private WebElement saveSettingsBtnLCS;
	
	//Initialization
	public settingsTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	////General Settings
	public WebElement getTopGroupingLevelDropdown() {
		return topGroupingLevelDropdown;
	}
	public WebElement getMiddleGroupingLevelDropdown() {
		return middleGroupingLevelDropdown;
	}
	public WebElement getTimeEntryLevelDropdown() {
		return timeEntryLevelDropdown;
	}
	public WebElement getLimitToRadioBtn() {
		return limitToRadioBtn;
	}
	public WebElement getLimitToTextbox() {
		return limitToTextbox;
	}
	public WebElement getUnlimitedRadioBtn() {
		return unlimitedRadioBtn;
	}
	public WebElement getEnableLeaveTimeTarckCheckbox() {
		return enableLeaveTimeTarckCheckbox;
	}
	public WebElement getEnableUndertimeRegistrationRadioBtn() {
		return enableUndertimeRegistrationRadioBtn;
	}
	public WebElement getCalenderLayoutDropdown() {
		return calenderLayoutDropdown;
	}
	public WebElement getDateFormatDropdown() {
		return dateFormatDropdown;
	}
	public WebElement getDefaultTimeZoneDropdown() {
		return defaultTimeZoneDropdown;
	}
	public WebElement getDecimalSeparatorDropdown() {
		return decimalSeparatorDropdown;
	}
	public WebElement getDigitGroupingSymbolDropdown() {
		return digitGroupingSymbolDropdown;
	}
	public WebElement getSaveSettingsBtnGS() {
		return saveSettingsBtnGS;
	}
	
	////Logo & color Scheme
	public WebElement getLogoAndColorSchemeBtn() {
		return logoAndColorSchemeBtn;
	}

	public WebElement getColorSchemeDropdown() {
		return colorSchemeDropdown;
	}

	public WebElement getUseDefaultLogoRadioBtn1() {
		return useDefaultLogoRadioBtn1;
	}

	public WebElement getUseCustomLogoRadioBtn1() {
		return useCustomLogoRadioBtn1;
	}

	public WebElement getChooseFileBtn1() {
		return chooseFileBtn1;
	}

	public WebElement getDoNotShowLogoRadioBtn() {
		return doNotShowLogoRadioBtn;
	}

	public WebElement getUseDefaultLogoRadioBtn2() {
		return useDefaultLogoRadioBtn2;
	}

	public WebElement getUseCustomLogoRadioBtn2() {
		return useCustomLogoRadioBtn2;
	}

	public WebElement getChooseFileBtn2() {
		return chooseFileBtn2;
	}

	public WebElement getSaveSettingsBtn() {
		return saveSettingsBtnLCS;
	}
	
	//Implementation
	////General Settings
	public void topGroupingLevelDropdown() {

	}
	public void middleGroupingLevelDropdown() {

	}
	public void timeEntryLevelDropdown() {

	}
	public void limitToRadioBtn() {

	}
	public void limitToTextbox() {

	}
	public void unlimitedRadioBtn() {

	}
	public void enableLeaveTimeTarckCheckbox() {

	}
	public void enableUndertimeRegistrationRadioBtn() {

	}
	public void calenderLayoutDropdown() {

	}
	public void dateFormatDropdown() {

	}
	public void defaultTimeZoneDropdown() {

	}
	public void decimalSeparatorDropdown() {

	}
	public void digitGroupingSymbolDropdown() {

	}
	public void saveSettingsBtnGS() {

	}
	public void logoAndColorSchemeBtn() {

	}

	//Logo & color Scheme
	public void colorSchemeDropdown(int option) {
		WebElement csd = colorSchemeDropdown;
		Select sel = new Select(csd);
		sel.selectByIndex(option);
	}

	public void useDefaultLogoRadioBtn1() {

	}

	public void useCustomLogoRadioBtn1() {

	}

	public void chooseFileBtn1() {

	}

	public void doNotShowLogoRadioBtn() {

	}

	public void useDefaultLogoRadioBtn2() {

	}

	public void useCustomLogoRadioBtn2() {

	}

	public void chooseFileBtn2() {

	}

	public void saveSettingsBtn() {

	}

	

}
