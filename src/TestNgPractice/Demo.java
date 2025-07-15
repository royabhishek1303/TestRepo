package TestNgPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void a3() {
		Reporter.log("a3 executed ", true);
	}

	public void a4() {
		Reporter.log("a3 executed ", true);
	}

	@Test
	public void a7() {
		Reporter.log("a7 executed ", true);
	}

	@Test
	public void a5() {
		Reporter.log("a5 executed ", true);

	}
}
