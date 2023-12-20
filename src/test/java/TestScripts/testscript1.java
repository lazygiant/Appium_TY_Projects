package TestScripts;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class testscript1 extends BaseClass{

	@Test
	public void tc1() {
		sp.search(gutil, "T-shirt");
	}
	
	@Test
	public void tc2() {
		susp.sustainability(gutil);
	}
}