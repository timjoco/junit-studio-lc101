package test;

import main.BalancedBrackets;
import org.junit.*;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    private static int numOfTests = 0;

    @BeforeClass
    public static void setup () {
        System.out.println("Lets run some Bracket tests");
    }

    @After
    public void addTestNum () {
        System.out.println("Test # " + ++numOfTests + " run!");
    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAroundLaunch() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
    }

    @Test
    public void bracketsAroundSecondHalf() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsOutsideOfString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void oneBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
    }

    @Test
    public void oneBracketReturnsFalse2 () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));

    }

    @Test
    public void oneBracketReturnsFalse3 () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));

    }

    @Test
    public void incompleteBracketSets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]["));
    }

    @Test
    public void moreIncompleteBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]["));
    }
}
