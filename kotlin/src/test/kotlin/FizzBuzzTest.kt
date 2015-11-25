
import org.junit.Assert
import org.junit.Test

/**
 * Created by vicboma on 25/11/15.
 */
class FizzBuzzTest() {
    @Test
    @Throws(Exception::class)
    fun testMain(){
        val expected = FizzBuzzExpected()
        val fizzBuzz = FizzBuzz()

        val sb = StringBuilder()
        val result = fizzBuzz.execute(sb)

        Assert.assertEquals("Not same", expected.value ,result)
    }

}