/**
 * Created by vicboma on 25/11/15.
 */
class FizzBuzz(){

    companion object {
        val FIZZ = "Fizz"
        val BUZZ = "Buzz"
        val CARRY = "\n"
        val ZERO = 0
        val FIVE = 5
        val THREE = 3
        val INIT_RANGE = 1
        val END_RANGE_INCLUSIVE = 100
    }

    init {

    }

    public fun execute(sb : StringBuilder) : String {
        for(i in INIT_RANGE..END_RANGE_INCLUSIVE){
            sb.append(
                    when {
                        isMultiple(i,THREE) && isMultiple(i,FIVE) -> "$FIZZ$BUZZ"
                        isMultiple(i,THREE)  -> "$FIZZ"
                        isMultiple(i,FIVE)  -> "$BUZZ"
                        else -> "$i"
                    }+"$CARRY"
                )
            }
        return sb.toString()
    }


    private fun isMultiple(a : Int, b :Int) = (a % b) == ZERO
}