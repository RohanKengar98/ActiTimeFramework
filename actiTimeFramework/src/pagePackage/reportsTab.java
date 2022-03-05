package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class reportsTab {
	//Declaration
	@FindBy(id = "ext-gen21") private WebElement createReportDropdown;
	@FindBy(id = "ext-gen20") private WebElement createReportBtn;
	
	//Under Create report
	@FindBy(id = "reportName_4") private WebElement TROvertime;//Time Report= TR
	@FindBy(id = "reportName_10") private WebElement TRLeaveTime;
	@FindBy(id = "reportName_6") private WebElement TRTimeTrackInDetail;
	
	@FindBy(id = "reportName_3") private WebElement CBRBillingSummary;//Costing & Billing Reports= CBR
	@FindBy(id = "reportName_12") private WebElement CBRInvoiceExport;
	@FindBy(id = "reportName_7") private WebElement CBRCostOfWork;
	
	@FindBy(id = "configureReportParametersButton") private WebElement configureReportParametersBtn;
	
	//Initialization
	public reportsTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getCreateReportDropdown() {
		return createReportDropdown;
	}

	public WebElement getCreateReportBtn() {
		return createReportBtn;
	}

	public WebElement getTROvertime() {
		return TROvertime;
	}

	public WebElement getTRLeaveTime() {
		return TRLeaveTime;
	}

	public WebElement getTRTimeTrackInDetail() {
		return TRTimeTrackInDetail;
	}

	public WebElement getCBRBillingSummary() {
		return CBRBillingSummary;
	}

	public WebElement getCBRInvoiceExport() {
		return CBRInvoiceExport;
	}

	public WebElement getCBRCostOfWork() {
		return CBRCostOfWork;
	}

	public WebElement getConfigureReportParametersBtn() {
		return configureReportParametersBtn;
	}
	
	
	//Implementation
	public void createReportDropdown(int option) {
		WebElement crd = createReportDropdown;
		Select sel = new Select(crd);
		sel.selectByIndex(option);	
	}

	public void createReportBtn() {

	}

	public void tROvertime() {

	}

	public void tRLeaveTime() {

	}

	public void tRTimeTrackInDetail() {

	}

	public void cBRBillingSummary() {

	}

	public void cBRInvoiceExport() {

	}

	public void cBRCostOfWork() {

	}

	public void configureReportParametersBtn() {

	}

}
