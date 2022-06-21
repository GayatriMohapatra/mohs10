package com.gcr.scripts;



//import org.testng.Assert;
import org.testng.annotations.Test;
import com.gcr.config.StartBrowser;
//import com.gcr.reuse.ElectronicsFunctions;
//import com.gcr.reuse.Registerfunctions;
import com.gcr.reuse.ExploreUs_Functions;



public class ExploreUs_Scripts extends StartBrowser{
	@Test
	public void ExploreUs_ScriptsTestCase() throws Exception {
		ExploreUs_Functions efs= new ExploreUs_Functions();
		  
		 efs.SelectCategory();
		  //efs.Emailafriend();
		  //String pName=ffs.Shoppingcart();
		  //Assert.assertEquals(pName);
		   Thread.sleep(9000);
		
		
		
	
		
		
	}
}
