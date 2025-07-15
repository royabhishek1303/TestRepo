package HandlerAttributeTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {

	@Test(enabled = false)
	public void a3() {
		Reporter.log("a3 executed ", true);
	}

	@Test
	public void a4() {
		Reporter.log("a4 executed ", true);
	}

	@Test
	public void a7() {
		Reporter.log("a7 executed ", true);
	}

}
