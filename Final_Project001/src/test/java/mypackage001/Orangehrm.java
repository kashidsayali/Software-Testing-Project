package mypackage001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {

		  //Launch Browser
	      WebDriverManager.chromedriver().browserPath("95.0.4638.54").setup();
		  WebDriverManager.chromedriver().setup();
		  WebDriver w= new ChromeDriver();
		  
		  //open url
          w.get("https://opensource-demo.orangehrmlive.com/");
          w.manage().window().maximize();
          
          //login
          w.findElement(By.id("txtUsername")).sendKeys("Admin");
          w.findElement(By.id("txtPassword")).sendKeys("admin123");
          w.findElement(By.id("btnLogin")).click();
          
          /////////////////////////////////////////////////////////////
          
          /******************** 1. PMI Module ******************** cntr+Shift+/  */  /* uncomment cntr+shift+\  */
          
			
			  //Add user 
              w.findElement(By.id("menu_pim_viewPimModule")).click();
			  w.findElement(By.id("btnAdd")).click();
			  w.findElement(By.id("firstName")).sendKeys("Sakshi");
			  w.findElement(By.id("middleName")).sendKeys("Viraj");
			  w.findElement(By.id("lastName")).sendKeys("Singh");
			  w.findElement(By.id("employeeId")).clear();
			  Thread.sleep(3000);
			  w.findElement(By.id("employeeId")).sendKeys("10094"); //change this for next execution
			  w.findElement(By.id("chkLogin")).click();
			  w.findElement(By.id("user_name")).sendKeys("Sakshi526"); //change this for next execution
			  w.findElement(By.id("user_password")).sendKeys("Testing123");
			  w.findElement(By.id("re_password")).sendKeys("Testing123");
			  Thread.sleep(3000);
			  Select s= new Select(w.findElement(By.id("status")));
			  s.selectByValue("Enabled"); w.findElement(By.id("btnSave")).click();
			  Thread.sleep(3000);
			  
			  //Profile Personal Details 
			  w.findElement(By.id("btnSave")).click();
			  w.findElement(By.id("personal_txtOtherID")).sendKeys("ID98089");
			  w.findElement(By.id("personal_txtLicenNo")).sendKeys("89562BFT12HJ");
			  Thread.sleep(3000);
			  w.findElement(By.id("personal_txtLicExpDate")).click(); 
			  Select s1= new Select(w.findElement(By.className("ui-datepicker-month")));
			  s1.selectByValue("5"); 
			  Select s2= new Select(w.findElement(By.className("ui-datepicker-year")));
			  s2.selectByValue("2030"); w.findElement(By.linkText("28")).click();
			  Thread.sleep(3000);
			  w.findElement(By.id("personal_txtSINNo")).sendKeys("888885225888");
			  w.findElement(By.id("personal_optGender_2")).click();
			  
			  Select s3= new Select(w.findElement(By.id("personal_cmbMarital")));
			  s3.selectByValue("Married"); Select s4= new
			  Select(w.findElement(By.id("personal_cmbNation"))); s4.selectByValue("182");
			  
			  w.findElement(By.id("personal_DOB")).click();
			  Select s5= new Select(w.findElement(By.className("ui-datepicker-month")));
			  s5.selectByValue("6"); 
			  Select s6= new Select(w.findElement(By.className("ui-datepicker-year")));
			  s6.selectByValue("1985"); w.findElement(By.linkText("10")).click();
			 
			  
			  w.findElement(By.id("btnSave")).click();
			  
         
            //Profile Job details
            w.findElement(By.linkText("Job")).click();
            w.findElement(By.id("btnSave")).click();
            Select s7= new Select(w.findElement(By.id("job_job_title")));
			s7.selectByValue("2");
			
            Select s8= new Select(w.findElement(By.id("job_emp_status")));
			s8.selectByValue("3");
			
            Select s9= new Select(w.findElement(By.id("job_eeo_category")));
			s9.selectByValue("1");
			
			w.findElement(By.id("job_joined_date")).click(); 
			Select s10= new Select(w.findElement(By.className("ui-datepicker-month")));
			s10.selectByValue("6"); 
			Select s11= new Select(w.findElement(By.className("ui-datepicker-year")));
		    s11.selectByValue("2000"); 
		    w.findElement(By.linkText("8")).click();
					 
			
            Select s12= new Select(w.findElement(By.id("job_sub_unit")));
			s12.selectByValue("12");
			
            Select s13= new Select(w.findElement(By.id("job_location")));
			s13.selectByValue("2");
			w.findElement(By.id("btnSave")).click();
			
			//Check terminate button
			w.findElement(By.id("btnTerminateEmployement")).click();
			Select s14= new Select(w.findElement(By.id("terminate_reason")));
			s14.selectByValue("5");
			w.findElement(By.id("terminate_note")).sendKeys("Tester is testing for practise");
			Thread.sleep(5000);
			w.findElement(By.id("dialogCancel")).click();
			
			//Go back to PMI 
			w.findElement(By.id("menu_pim_viewPimModule")).click();
			Thread.sleep(2000);
			w.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Sakshi Viraj Singh");
			w.findElement(By.id("empsearch_id")).sendKeys("10094");	                      //change this id with latest one
			Select s15= new Select(w.findElement(By.id("empsearch_employee_status")));
			s15.selectByValue("3");
			Select s16= new Select(w.findElement(By.id("empsearch_job_title")));
			s16.selectByValue("2");
			Select s17= new Select(w.findElement(By.id("empsearch_sub_unit")));
			s17.selectByValue("12");
			Thread.sleep(3000);
			w.findElement(By.id("searchBtn")).click();
			Thread.sleep(3000);

			
			  //reset button
	          w.findElement(By.id("resetBtn")).click();
	        
	          //PMI configuration 
	          Actions a = new Actions(w);
			  
	          // 1. Add Optional fields
			  a.moveToElement(w.findElement(By.linkText("Configuration"))).build().perform();
			  
			  w.findElement(By.linkText("Optional Fields")).click();
			  Thread.sleep(3000);
			  w.findElement(By.id("btnSave")).click();
			  w.findElement(By.id("configPim_chkShowSSN")).click();
			  w.findElement(By.id("configPim_chkDeprecateFields")).click();
			  
			  w.findElement(By.id("btnSave")).click();
			  
			  // 2.Add custom fields
	          a.moveToElement(w.findElement(By.linkText("Configuration"))).build().perform();
			  
			  w.findElement(By.linkText("Custom Fields")).click();
	          w.findElement(By.id("buttonAdd")).click();
	          
	          w.findElement(By.id("customField_name")).sendKeys("Age");
	          Select s18= new Select(w.findElement(By.id("customField_screen")));
	          s18.selectByValue("personal");
	          Select s19= new Select(w.findElement(By.id("customField_type")));
	          s19.selectByValue("0");

	          w.findElement(By.id("btnSave")).click();
	          
	          
	          // 3.termination 
	          a.moveToElement(w.findElement(By.linkText("Configuration"))).build().perform();
			  
			  w.findElement(By.linkText("Termination Reasons")).click();
	          w.findElement(By.id("btnAdd")).click();
	          
	          w.findElement(By.id("terminationReason_name")).sendKeys("AA Testing OrangeHRM22");
	          w.findElement(By.id("btnSave")).click();
	          
	          w.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/form/table/tbody/tr[11]/td[1]/input")).click();
	          w.findElement(By.id("btnDel")).click();
			  
	          
	          //4.Reports
	          w.findElement(By.id("menu_core_viewDefinedPredefinedReports")).click();
	          w.findElement(By.id("btnAdd")).click();
	          w.findElement(By.id("report_report_name")).sendKeys("Testing reports");
	          Select s20= new Select(w.findElement(By.id("report_display_field_list")));
	          s20.selectByValue("display_field_14");
	          w.findElement(By.id("btnAddDisplayField")).click();
	          w.findElement(By.id("display_group_1")).click();
	          w.findElement(By.id("btnSave")).click();
	          
            ////////////////////////////////////////////////////////////////////////////////////////////////////////
	          
	         /********************************** Leave Module ***************************************/
	          
	          // leave
	          w.findElement(By.id("menu_leave_viewLeaveModule")).click();
	          
	           //1. configure 
	             Thread.sleep(3000);
	  		   a.moveToElement(w.findElement(By.id("menu_leave_Configure"))).build().perform();
	  		   w.findElement(By.linkText("Leave Types")).click();
	  		   w.findElement(By.id("btnAdd")).click();
	  		   w.findElement(By.id("leaveType_txtLeaveTypeName")).sendKeys("INDDiwaliHolidays");// Change this 
	  		   w.findElement(By.id("leaveType_excludeIfNoEntitlement")).click();
	  		   w.findElement(By.id("saveButton")).click();
	  		   
	  		   a.moveToElement(w.findElement(By.id("menu_leave_Configure"))).build().perform();
	  		   w.findElement(By.linkText("Work Week")).click();
	  		   w.findElement(By.id("saveBtn")).click();
	  		   Select s01= new Select(w.findElement(By.id("WorkWeek_day_length_Saturday")));
	  		   s01.selectByValue("4"); //change value to 0
	  		   w.findElement(By.id("saveBtn")).click();
	   
	  		   a.moveToElement(w.findElement(By.id("menu_leave_Configure"))).build().perform();
	  		   w.findElement(By.linkText("Holidays")).click();
	  		   w.findElement(By.id("calFromDate")).click();
	  		   Select s21= new Select(w.findElement(By.className("ui-datepicker-month")));
	  		   s21.selectByValue("2"); 
	  		   Select s22= new Select(w.findElement(By.className("ui-datepicker-year")));
	  		   s22.selectByValue("2021");
	  		   w.findElement(By.linkText("1")).click();
	  		   
	  		   w.findElement(By.id("calToDate")).click();
	  		   Select s23= new Select(w.findElement(By.className("ui-datepicker-month")));
	  		   s23.selectByValue("10"); 
	  		   Select s24= new Select(w.findElement(By.className("ui-datepicker-year")));
	  		   s24.selectByValue("2021"); 
	  		   w.findElement(By.linkText("30")).click();
	  		   w.findElement(By.id("btnSearch")).click();
	  		   
	  		   
	           //2. Leave List 
	  	       w.findElement(By.linkText("Leave List")).click();
	  	       w.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
	  	       w.findElement(By.id("btnSearch")).click();
	  	    
	  	    
	  	      // 3. Reports
		      a.moveToElement(w.findElement(By.id("menu_leave_Reports"))).build().perform();
			  w.findElement(By.linkText("Leave Entitlements and Usage Report")).click();
			  Select s25= new Select(w.findElement(By.id("leave_balance_report_type")));
			  s25.selectByValue("2");
			  Thread.sleep(3000);
		      w.findElement(By.id("leave_balance_employee_empName")).sendKeys("Sania Shaheen");
		      w.findElement(By.id("viewBtn")).click();
		      Thread.sleep(3000);

          
	  	    
	          // 4. entitlement
	          a.moveToElement(w.findElement(By.id("menu_leave_Entitlements"))).build().perform();
			  w.findElement(By.linkText("Add Entitlements")).click();
			  Thread.sleep(3000);
			  w.findElement(By.id("entitlements_employee_empName")).sendKeys("Sania Shaheen");
			  w.findElement(By.id("entitlements_entitlement")).sendKeys("50"); 
			  Thread.sleep(3000);
			  w.findElement(By.id("btnSave")).click();
	}

}
