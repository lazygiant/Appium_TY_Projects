package TestScripts;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class SearchTest extends BaseClass {

	@Test
	public void tc1() {
		sp.search(gutil, "T-shirt");
	}
}
