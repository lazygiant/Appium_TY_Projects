package TestScripts;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class InboxTest extends BaseClass{

	@Test
	public void tc3() {
		ip.inbox();
	}
}
