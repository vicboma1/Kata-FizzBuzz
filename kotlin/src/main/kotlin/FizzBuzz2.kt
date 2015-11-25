/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
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

    public fun toValue(key : Int )  = mapOf(
        0                   to key,
        isMultiple(key, 3)  to "Fizz",
        isMultiple(key, 5)  to "Buzz",
        isMultiple(key, 15) to "FizzBuzz")[0].toString()+"$CARRY"


    public fun execute(sb : StringBuilder) : String {
        for(i in INIT_RANGE..END_RANGE_INCLUSIVE)
            sb.append(toValue(i))
        
        return sb.toString()
    }


    private fun isMultiple(a : Int, b :Int) = (a % b)
}
