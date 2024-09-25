package reporterPKG;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class TestClass {
	@Test
	public void test1() {

		System.out.println("test1 to check extend report result");

	}

	@Test(groups = { "smoke", "regression" })
	@Parameters({"name","age","team"})
	public void TestNgParametersTest(String Testter_Name, int Age, String Team) {
		System.out.println(Testter_Name);
		System.out.println(Age);
		System.out.println(Team);

		System.out.println("test2 to check extend report result & parameter ");
		String username = System. getProperty("user.name"); 
		System.out.println("User: " + username);

	}

	@Test(groups = { "regression" })
	public void test3() {

		System.out.println("test1 to check extend report result");

	}

	@Test(groups = { "regression" })
	public void test_fail() {
		Assert.fail();
		System.out.println("Forced to fail this TCs");

	}

}
