import org.junit.Assert
import org.junit.Test

/**
 * Created by vicboma on 25/11/15.
 */
class FizzBuzz4Test() {
    @Test
    @Throws(Exception::class)
    fun testMain(){
        val expected = FizzBuzzExpected()
        val fizzBuzz4 = FizzBuzz4()

        val sb = StringBuilder()
        val result = fizzBuzz4.execute(sb)

        Assert.assertEquals("Not same", expected.value ,result)
    }
}
