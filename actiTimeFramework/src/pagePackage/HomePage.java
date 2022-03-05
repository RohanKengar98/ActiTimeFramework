package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
		//Declaration
		@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackForDropdown;
		@FindBy(xpath="//a[.='Create new tasks']") private WebElement createNewTasksLink;
		@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeBtn;
		@FindBy(xpath="//a[.='View Time-Track']") private WebElement viewTimeTrackBtn;
		@FindBy(xpath="//div[.='Tasks']/ancestor::a[@class='content tasks']") private WebElement tasksBtn;
		@FindBy(xpath="//div[.='Reports']/ancestor::a[@class='content reports']") private WebElement reportsBtn;
		@FindBy(xpath="//div[.='Users']/ancestor::a[@class='content users']") private WebElement usersBtn;
		@FindBy(xpath="//div[.='Work Schedule']/ancestor::a[@class='content calendar']") private WebElement workScheduleBtn;
		@FindBy(xpath="//div[.='Settings']/ancestor::a[@class='content administration']") private WebElement settingsBtn;
		@FindBy(xpath="//span[.='Help & Support']") private WebElement helpAndSupportDropdown;
		@FindBy(className = "logout") private WebElement logoutLink;
		
		//Initialization
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public WebElement getEnterTimeTrackForDropdown() {
			return enterTimeTrackForDropdown;
		}
		public WebElement getCreateNewTasksLink() {
			return createNewTasksLink;
		}
		public WebElement getSaveLeaveTimeBtn() {
			return saveLeaveTimeBtn;
		}
		public WebElement getViewTimeTrackBtn() {
			return viewTimeTrackBtn;
		}
		public WebElement getTasksBtn() {
			return tasksBtn;
		}
		public WebElement getReportsBtn() {
			return reportsBtn;
		}
		public WebElement getUsersBtn() {
			return usersBtn;
		}
		public WebElement getWorkScheduleBtn() {
			return workScheduleBtn;
		}
		public WebElement getSettingsBtn() {
			return settingsBtn;
		}
		public WebElement getHelpAndSupportDropdown() {
			return helpAndSupportDropdown;
		}
		public WebElement getLogoutLink() {
			return logoutLink;
		}
		
		public void viewTimeTrack() {
			logoutLink.click();
		}
		public void settingsBtn() {
			settingsBtn.click();
		}
		public void workScheduleBtn() {
			workScheduleBtn.click();
		}
		public void usersBtn() {
			usersBtn.click();
		}
		public void reportsBtn() {
			reportsBtn.click();
		}
		public void tasksBtn() {
			tasksBtn.click();
		}
		public void viewTimeTrackBtn() {
			viewTimeTrackBtn.click();
		}
		public void saveLeaveTimeBtn() {
			saveLeaveTimeBtn.click();
		}
		public void createNewTasksLink() {
			createNewTasksLink.click();
		}
		public void enterTimeTrackForDropdown(int option) {
			WebElement ettfd = enterTimeTrackForDropdown;
			Select sel = new Select(ettfd);
			sel.selectByIndex(option);
		}
		public void helpAndSupportDropdown(int option) {
			WebElement hsd = helpAndSupportDropdown;
			Select sel = new Select(hsd);
			sel.selectByIndex(option);
		}
		

}
