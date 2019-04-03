package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
    private Belly belly = null;

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour")
    public void I_wait_hours(int hours) throws Throwable {
        if(belly != null) belly.wait(hours);
        else throw new Exception("Belly object does not exist");
    }

    @Then("my belly should growl")
    public void My_belly_should_growl() throws Throwable {
        if(belly != null) belly.growl(true);
        else throw new Exception("Belly object does not exist");
    }
}
