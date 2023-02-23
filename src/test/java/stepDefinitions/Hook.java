package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hook {
    @BeforeAll
    public static void statSession(){
        System.out.println("Initialize Reports");
    }

    @AfterAll
    public static void endSession(){
        System.out.println("Close All");
    }

    @Before
    public void beforeStep(){
        System.out.println("Before Step");
    }

    @After
    public void afterStep(){
        System.out.println("After Step");
    }
}
