package com.attrubute;

import org.testng.annotations.Test;

public class FruitsDependsTest {

	
	@Test(dependsOnMethods= {"grapes"})
	public void mango()
	{
		System.out.println("Mango");
	}
	@Test(dependsOnMethods= {"apple"})
	public void banana()
	{
		System.out.println("Banana");
	}
    
	@Test(dependsOnMethods= {"pear"})
	public void apple()
	{
		System.out.println("Apple");
	}
     
	@Test()
	public void grapes()
	{
		System.out.println("Grapes");
	}
	@Test(dependsOnMethods= {"mango"})
	public void pear()
	{
		System.out.println("Pear");
	}

}
