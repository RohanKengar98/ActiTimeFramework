package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksTab {
	
	//Declaration
	//Open Tasks Tab
	@FindBy(xpath="//div[.='Tasks']/ancestor::a[@class='content tasks']") private WebElement openTasksBtn;
	@FindBy(xpath="//input[@value='Create New Tasks']") private WebElement createNewTasksBtn;
	@FindBy(xpath="//td[@class='middle-left-cell dropdown-button-contents text']") private WebElement customersAndProjectsDropdown;
	@FindBy(xpath="//input[@onChange='onTaskFilterDataChange()']") private WebElement filterTasksByNameTextbox;
	@FindBy(id = "tasksFilterSubmitButton") private WebElement applyFilterBtn;
	
	//Completed Tasks
	@FindBy(xpath="//a[.='Completed Tasks']") private WebElement completedTasksBtn;//CT
	@FindBy(id ="cpSelector.cpButton.contentsContainer") private WebElement customersAndProjectsDropdownCT;
	@FindBy(xpath="//input[@onChange='onTaskFilterDataChange()']") private WebElement filterTasksByNameTextboxCT;
	@FindBy(id ="completionDateFrom_userText") private WebElement completionDateFromTextbox;
	@FindBy(id ="ext-gen7") private WebElement completionDateFromCalenderBtn;
	@FindBy(id ="completionDateTo_userText") private WebElement completionDateToTextbox;
	@FindBy(id ="ext-gen20") private WebElement completionDatetoCalenderBtn;
	@FindBy(id ="tasksFilterSubmitButton") private WebElement applyFilterBtnCT;
	@FindBy(xpath = "//a[.='clear dates']") private WebElement clearDateLink;
	
	//Projects And customers Tab
	@FindBy(xpath="//a[.='Projects & Customers']") private WebElement projectsAndCustomers;
	@FindBy(name = "selectedCustomer") private WebElement customersDropdown;
	@FindBy(xpath = "//input[@value='  Show  ']") private WebElement showBtn;
	@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement createNewCustomerBtn;
	@FindBy(xpath = "//input[@value='Create New Project']") private WebElement createNewProjectBtn;
	@FindBy(name = "showProjects") private WebElement showProjectsCheckbox;
	
	//Archives Tab
	@FindBy(xpath="//a[.='Archives']") private WebElement archivesBtn;
	@FindBy(name = "showProjects") private WebElement showProjectsCheckboxAr;//Archives tab = Ar(at the end)
	@FindBy(name = "selectedCustomer") private WebElement customesDropdownAr;
	@FindBy(xpath = "//input[@value='  Show  ']") private WebElement showBtnAr;
	
	////Initialization
	public TasksTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	////Utilization
	public WebElement getOpenTasksBtn() {
		return openTasksBtn;
	}
	public WebElement getCreateNewTasksBtn() {
		return createNewTasksBtn;
	}
	public WebElement getCustomersAndProjectsDropdown() {
		return customersAndProjectsDropdown;
	}
	public WebElement getFilterTasksByNameTextbox() {
		return filterTasksByNameTextbox;
	}
	public WebElement getApplyFilterBtn() {
		return applyFilterBtn;
	}
	public WebElement getCompletedTasksBtn() {
		return completedTasksBtn;
	}
	public WebElement getCustomersAndProjectsDropdownCT() {
		return customersAndProjectsDropdownCT;
	}
	public WebElement getFilterTasksByNameTextboxCT() {
		return filterTasksByNameTextboxCT;
	}
	public WebElement getCompletionDateFromTextbox() {
		return completionDateFromTextbox;
	}
	public WebElement getCompletionDateFromCalenderBtn() {
		return completionDateFromCalenderBtn;
	}
	public WebElement getCompletionDateToTextbox() {
		return completionDateToTextbox;
	}
	public WebElement getCompletionDatetoCalenderBtn() {
		return completionDatetoCalenderBtn;
	}
	public WebElement getApplyFilterBtnCT() {
		return applyFilterBtnCT;
	}
	public WebElement getClearDateLink() {
		return clearDateLink;
	}
	public WebElement getProjectsAndCustomers() {
		return projectsAndCustomers;
	}
	public WebElement getCustomersDropdown() {
		return customersDropdown;
	}
	public WebElement getShowBtn() {
		return showBtn;
	}
	public WebElement getCreateNewCustomerBtn() {
		return createNewCustomerBtn;
	}
	public WebElement getCreateNewProjectBtn() {
		return createNewProjectBtn;
	}
	public WebElement getShowProjectsCheckbox() {
		return showProjectsCheckbox;
	}
	public WebElement getArchivesBtn() {
		return archivesBtn;
	}
	public WebElement getShowProjectsCheckboxAr() {
		return showProjectsCheckboxAr;
	}
	public WebElement getCustomesDropdownAr() {
		return customesDropdownAr;
	}
	public WebElement getShowBtnAr() {
		return showBtnAr;
	}
	
	
	//Implementation
	public void openTasksBtn() {
		
	}
	public void createNewTasksBtn() {
	
	}
	public void customersAndProjectsDropdown(int option) {
		WebElement capd = customersAndProjectsDropdownCT;
		Select sel = new Select(capd);
		sel.selectByIndex(option);
	}
	public void filterTasksByNameTextbox() {
		
	}
	public void applyFilterBtn() {
		
	}
	public void completedTasksBtn() {
		
	}
	public void customersAndProjectsDropdownCT(int option) {
		WebElement capdCT = customersAndProjectsDropdownCT;
		Select sel = new Select(capdCT);
		sel.selectByIndex(option);	
	}
	public void filterTasksByNameTextboxCT() {
		
	}
	public void completionDateFromTextbox() {
		
	}
	public void completionDateFromCalenderBtn() {
		
	}
	public void completionDateToTextbox() {
		
	}
	public void completionDatetoCalenderBtn() {
		
	}
	public void applyFilterBtnCT() {
		
	}
	public void clearDateLink() {
		
	}
	public void projectsAndCustomers() {
		
	}
	public void customersDropdown(int option) {
		WebElement cd = customersDropdown;
		Select sel = new Select(cd);
		sel.selectByIndex(option);	
	}
	public void showBtn() {
		
	}
	public void createNewCustomerBtn() {
		
	}
	public void createNewProjectBtn() {
		
	}
	public void showProjectsCheckbox() {
		
	}
	public void archivesBtn() {
	
	}
	public void showProjectsCheckboxAr() {
		
	}
	public void customesDropdownAr(int option) {
		WebElement cdAr = customersDropdown;
		Select sel = new Select(cdAr);
		sel.selectByIndex(option);	
	}
	public void showBtnAr() {
		
	}
	
	
	

}
