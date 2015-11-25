import org.junit.Assert
import org.junit.Test

/**
 * Created by vicboma on 25/11/15.
 */
class FizzBuzz3Test() {
    @Test
    @Throws(Exception::class)
    fun testMain(){
        val expected = FizzBuzzExpected()
        val fizzBuzz3= FizzBuzz3()

        val sb = StringBuilder()
        val result = fizzBuzz3.execute(sb)

        Assert.assertEquals("Not same", expected.value ,result)
    }
}
