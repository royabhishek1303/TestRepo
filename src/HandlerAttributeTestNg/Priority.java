package HandlerAttributeTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 0)
	public void a3() {
		Reporter.log("a3 executed ", true);
	}

	@Test(priority = -2)
	public void a4() {
		Reporter.log("a4 executed ", true);
	}

	@Test(priority = -1)
	public void a7() {
		Reporter.log("a7 executed ", true);
	}

	@Test(priority = 1)
	public void a5() {
		Reporter.log("a5 executed ", true);

	}

}
