package stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import objectrepository.AccessPage;

public class AccessSteps {
	@Then("The customer should see the customer id generated.")
	public void the_customer_should_see_the_customer_id_generated() {
		AccessPage access = new AccessPage();
		Assert.assertTrue(false);

	}
}
