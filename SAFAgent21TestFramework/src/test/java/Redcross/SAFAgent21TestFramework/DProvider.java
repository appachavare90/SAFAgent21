package Redcross.SAFAgent21TestFramework;

import org.testng.Assert;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DProvider {
	
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{"Contains", "Test" , "test"}, {"Does not contain", "Test", "Test"}};
	}
	
      @Test (dataProvider = "data-provider")
      public void myTest (String a, String b, String c) {
	     System.out.println(a);
	     System.out.println(b);
	     System.out.println(c);
      }
      
      
}
