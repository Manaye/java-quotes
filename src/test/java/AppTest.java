/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.HashMap;
import java.util.Queue;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {

    }
    @Test public void tesGetRondomquote(){
        Quote[] quotes = new Quote[]{new Quote("I love you God!","Hiwot")};
         assertTrue(quotes.length>0);

    }
}