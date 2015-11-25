import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by vicboma on 25/11/15.
 */
public class FizzBuzzTest {

    private FizzBuzzExpected fizzBuzzExpected;
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        this.fizzBuzz = new FizzBuzz();
        this.fizzBuzzExpected =  new FizzBuzzExpected();
    }

    @After
    public void tearDown() throws Exception {
        this.fizzBuzz = null;
        this.fizzBuzzExpected = null;
    }

    @Test
    public void testExecute() throws Exception {
        final StringBuilder sb = new StringBuilder();
        final String fizzBuzzToString = this.fizzBuzz.execute(sb);
        Assert.assertEquals("Not same", fizzBuzzExpected.get(),fizzBuzzToString);
    }
}