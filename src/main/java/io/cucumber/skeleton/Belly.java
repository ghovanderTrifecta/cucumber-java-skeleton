package io.cucumber.skeleton;

import static org.junit.Assert.*;

public class Belly {

    public void eat(int cukes) {
        System.out.println(String.format("Eating %s cucumbers!", cukes));
    }

    public void wait(int hours){
        System.out.println(String.format("Waiting %s hours!", hours));
    }

    public void growl(boolean isGrowling){
        assertEquals(true, isGrowling);
    }

}
