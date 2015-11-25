class FizzBuzz3(){

    companion object {
        val FIZZ = "Fizz"
        val BUZZ = "Buzz"
        val FIZZBUZZ = "$FIZZ$BUZZ"
        val CARRY = "\n"
        val ZERO = 0
        val FIVE = 5
        val THREE = 3 
        val FIFTEEN = FIVE * THREE
        val INIT_RANGE = 1
        val END_RANGE_INCLUSIVE = 100
    }

    init {

    }

    public fun Int.mapToFizzBuzz() = mapOf(
                      ZERO                      to this,
                      isMultiple(this, THREE)   to FIZZ,
                      isMultiple(this, FIVE)    to BUZZ,
                      isMultiple(this, FIFTEEN) to FIZZBUZZ)[ZERO].toString()+"$CARRY"

    public fun execute(sb : StringBuilder) : String {
        for(i in INIT_RANGE..END_RANGE_INCLUSIVE)
            sb.append(i.mapToFizzBuzz())

        return sb.toString()
    }

    private fun isMultiple(a : Int, b :Int) = (a % b)
}
