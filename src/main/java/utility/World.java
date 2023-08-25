package utility;

import java.io.IOException;  // STEP 6

import base.TestBase;
import pageObject.PageObjectManager;

public class World {
	public TestBase tb;
	public PageObjectManager po;
	
	public World() throws IOException {
		tb = new TestBase();
		po = new PageObjectManager(tb.launchDriver());
	}

}
