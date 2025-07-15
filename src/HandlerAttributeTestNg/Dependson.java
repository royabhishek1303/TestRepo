package HandlerAttributeTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependson {

	@Test
	public void creatAc() {
		Reporter.log("Create acc", true);
	}

	@Test(dependsOnMethods = "creatAc")
	public void editAcc() {
		Reporter.log("editAcc acc", true);
	}

	@Test(dependsOnMethods = { "editAcc", "creatAc" })
	public void deleteAcc() {
		Reporter.log("deleteAcc acc", true);
	}

}
