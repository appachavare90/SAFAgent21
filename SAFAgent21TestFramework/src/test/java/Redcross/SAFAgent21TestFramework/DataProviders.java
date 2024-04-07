package Redcross.SAFAgent21TestFramework;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
//	@DataProvider(name = "test1")
//	public Object[][] getData()
//	{
//		Object[][] dataSet=new Object[4][2];
//		//first Row
//		dataSet[0][0]="Appa";
//		dataSet[0][1]="Chavare";
//		
//		//second row
//		dataSet[1][0]="Tanishka";
//		dataSet[1][1]="Chavare";
//		
//		dataSet[2][0]="Tejashri";
//		dataSet[2][1]="Waghmode";
//		
//		dataSet[3][0]="Mindtree";
//		dataSet[3][1]="ShivajiNagar";
//		return dataSet;
//	}
//	
	@DataProvider(name = "test")
	public Object[][] getTestData(Method m)
	{
		Object[][] testData=null;
		if(m.getName().equals("testMethod1"))
		{
		return new Object[][]
				{
				{"Appa","Sadashiv","Chavare"},
				{"Chiva","Appa","Chavare"},
				{"Tejashri","SHivaji","Waghmode"},
				{"Tanishka","Appa","Chavare"}
				};
		}
		else if(m.getName().equals("testMethod2"))
		{
			return new Object[][]
					{
					{"Appa","Chavare"},
					{"Chiva","Chavare"},
					{"Tejashri","Waghmode"},
					{"Tanishka","Chavare"}
					};
		}
		return testData;
	}


}
