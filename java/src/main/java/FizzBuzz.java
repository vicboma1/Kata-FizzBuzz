import java.util.stream.IntStream;

/**
 * Created by vicboma on 25/11/15.
 */
public class FizzBuzz {

    public static final String EMPTY = "";
    public static final String FIZZ = "Fizz ";
    public static final String BUZZ = "Buzz ";
    public static final String CARRY = "\n";
    public static final int ZERO = 0;
    public static final int FIVE = 5;
    public static final int THREE = 3;
    public static final int INIT_RANGE = 1;
    public static final int END_RANGE_INCLUSIVE = 100;

    public FizzBuzz() {
    }

    public String execute(final StringBuilder sb){
        IntStream.rangeClosed(INIT_RANGE, END_RANGE_INCLUSIVE)
                 .boxed()
                 .forEach(x ->{
                     create(sb, x);
                 });
        return sb.toString();
    }

    private void create(StringBuilder sb, Integer x) {
        String str = EMPTY;
        str = fizz(x, str);
        str = buzz(x, str);
        str = carry(x, str);
        sb.append(str);
    }

    private String carry(Integer x, String str) {
        if (str == EMPTY)
            str += x;
        return str+CARRY;
    }

    private String buzz(Integer x, String str) {
        if(isMultiple(x,FIVE))
            str += BUZZ;
        return str;
    }

    private String fizz(Integer x, String str) {
        if(isMultiple(x,THREE))
            str += FIZZ;
        return str;
    }

    private Boolean isMultiple(Integer a, Integer b){
        return (a % b == ZERO);
    }
}
