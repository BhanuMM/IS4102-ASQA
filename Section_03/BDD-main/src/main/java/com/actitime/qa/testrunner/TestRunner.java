package com.actitime.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "C:\\Users\\s.kadigamugedara_exa\\Documents\\Uni\\BDD_Demo-main\\src\\main\\java\\com\\actitime\\qa\\feature\\Loging.feature"
		features ={"/Users/bhanuji/Bhanuji/Projects/IS4102-ASQA/Section_03/BDD-main/src/main/java/com/actitime/qa/feature/Loging.feature" , "/Users/bhanuji/Bhanuji/Projects/IS4102-ASQA/Section_03/BDD-main/src/main/java/com/actitime/qa/feature/Usercreation.feature"}
		,glue={"com/actitime/qa/stepdefinitions"}
		,monochrome = true,
				strict=true,
				dryRun=false
				
		)




public class TestRunner {
	
	
	

}
