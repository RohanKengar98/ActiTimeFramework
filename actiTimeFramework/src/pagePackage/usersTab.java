package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class usersTab {
	
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement createNewUserBtn;
	@FindBy(name = "username") private WebElement usernameTextbox;
	@FindBy(name = "passwordText") private WebElement passwordTextbox;
	@FindBy(name = "passwordTextRetype") private WebElement retypePasswordTextbox;
	@FindBy(name = "firstName") private WebElement firstNameTextbox;
	@FindBy(name = "lastName") private WebElement lastNametextbox;
	@FindBy(name = "phone") private WebElement phoneTextbox;
	@FindBy(name = "fax") private WebElement faxTextbox;
	@FindBy(name = "email") private WebElement emailTextbox;
	@FindBy(id = "timeZoneName") private WebElement userTimeZoneDropdown;
	@FindBy(id = "overtimeTracking_Enable") private WebElement overtimeTrackingCheckbox;
	//Access Rights Checkboxes
	@FindBy(name = "rightGranted[2]") private WebElement manageCustomerAndProjectCheckbox;
	@FindBy(name = "rightGranted[12]") private WebElement modifyTimeTrackOfOtherUsersCheckbox;
	@FindBy(name = "rightGranted[13]") private WebElement manageTasksCheckbox;
	@FindBy(name = "rightGranted[1]") private WebElement generateReportsCheckbox;
	//System Administration Checkbox under Access Rights
	@FindBy(id = "right5") private WebElement manageUsersCheckbox;
	@FindBy(id = "right7") private WebElement manageBillingTypesCheckbox;
	@FindBy(id = "right10") private WebElement manageWorkScheduleCheckbox;
	@FindBy(id = "right11") private WebElement manageGeneralSettingsCheckbox;
	@FindBy(xpath = "//input[@value='   Create User   ']") private WebElement createUserBtn;
	@FindBy(xpath = "//input[@value='      Cancel      ']") private WebElement cancelBtn;
	
	//Initialization
	public usersTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getCreateNewUserBtn() {
		return createNewUserBtn;
	}
	
	public WebElement getUsernameTextbox() {
		return usernameTextbox;
	}
	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}
	public WebElement getRetypePasswordTextbox() {
		return retypePasswordTextbox;
	}
	public WebElement getFirstNameTextbox() {
		return firstNameTextbox;
	}
	public WebElement getLastNametextbox() {
		return lastNametextbox;
	}
	public WebElement getPhoneTextbox() {
		return phoneTextbox;
	}
	public WebElement getFaxTextbox() {
		return faxTextbox;
	}
	public WebElement getEmailTextbox() {
		return emailTextbox;
	}
	public WebElement getUserTimeZoneDropdown() {
		return userTimeZoneDropdown;	
	}
	public WebElement getOvertimeTrackingCheckbox() {
		return overtimeTrackingCheckbox;
	}
	public WebElement getManageCustomerAndProjectCheckbox() {
		return manageCustomerAndProjectCheckbox;
	}
	public WebElement getModifyTimeTrackOfOtherUsersCheckbox() {
		return modifyTimeTrackOfOtherUsersCheckbox;
	}
	public WebElement getManageTasksCheckbox() {
		return manageTasksCheckbox;
	}
	public WebElement getGenerateReportsCheckbox() {
		return generateReportsCheckbox;
	}
	public WebElement getManageUsersCheckbox() {
		return manageUsersCheckbox;
	}
	public WebElement getManageBillingTypesCheckbox() {
		return manageBillingTypesCheckbox;
	}
	public WebElement getManageWorkScheduleCheckbox() {
		return manageWorkScheduleCheckbox;
	}
	public WebElement getManageGeneralSettingsCheckbox() {
		return manageGeneralSettingsCheckbox;
	}
	public WebElement getCreateUserBtn() {
		return createUserBtn;
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	//Implementation
	public void createNewUserBtn() {

	}
	public void usernameTextbox() {

	}
	public void passwordTextbox() {

	}
	public void retypePasswordTextbox() {

	}
	public void firstNameTextbox() {

	}
	public void lastNametextbox() {

	}
	public void phoneTextbox() {

	}
	public void faxTextbox() {

	}
	public void emailTextbox() {

	}
	public void userTimeZoneDropdown(int option) {
		WebElement utzd = userTimeZoneDropdown;
		Select sel = new Select(utzd);
		sel.selectByIndex(option);
	}
	public void overtimeTrackingCheckbox() {

	}
	public void manageCustomerAndProjectCheckbox() {

	}
	public void modifyTimeTrackOfOtherUsersCheckbox() {

	}
	public void manageTasksCheckbox() {

	}
	public void generateReportsCheckbox() {

	}
	public void manageUsersCheckbox() {

	}
	public void manageBillingTypesCheckbox() {

	}
	public void manageWorkScheduleCheckbox() {

	}
	public void manageGeneralSettingsCheckbox() {

	}
	public void createUserBtn() {

	}
	public void cancelBtn() {

	}
	

}
