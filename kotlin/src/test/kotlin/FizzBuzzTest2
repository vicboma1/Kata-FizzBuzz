import org.junit.Assert
import org.junit.Test

/**
 * Created by vicboma on 25/11/15.
 */
class FizzBuzz2Test() {
    @Test
    @Throws(Exception::class)
    fun testMain(){
        val expected = FizzBuzzExpected()
        val fizzBuzz2 = FizzBuzz2()

        val sb = StringBuilder()
        val result = fizzBuzz2.execute(sb)

        Assert.assertEquals("Not same", expected.value ,result)
    }
}
