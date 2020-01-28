# Kata FizzBuzz

# Build 

[![Build Status](https://travis-ci.org/vicboma1/Kata-FizzBuzz.svg)](https://travis-ci.org/vicboma1/Kata-FizzBuzz) 
![](https://img.shields.io/badge/Java-1.8-blue.svg?logoWidth=8)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.0.0--beta--1038-blue.svg)](http://kotlinlang.org) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.eluder.coveralls/coveralls-maven-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.eluder.coveralls/coveralls-maven-plugin/)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=vicboma1_Kata-FizzBuzz&metric=alert_status)](https://sonarcloud.io/dashboard/index/vicboma1_Kata-FizzBuzz)


## Kotlin

### Version 1 - Time: 2ms
Source
```kotlin
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

    public fun whenToValue(i: Int) = when {
            isMultiple(i,THREE) && isMultiple(i,FIVE) -> "$FIZZ$BUZZ"
            isMultiple(i,THREE)                       -> "$FIZZ"
            isMultiple(i,FIVE)                        -> "$BUZZ"
            else -> "$i"
        }+"$CARRY"
    

    public fun execute(sb : StringBuilder) : String {
        for(i in INIT_RANGE..END_RANGE_INCLUSIVE)
            sb.append(whenToValue(i))
            
        return sb.toString()
    }

    private fun isMultiple(a : Int, b :Int) = (a % b) == ZERO
}
```

### Version 2 - Time: 14ms
Source
```kotlin
class FizzBuzz2(){

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

    public fun toValue(i : Int )  = mapOf(
        ZERO                   to i,
        isMultiple(i, THREE)   to FIZZ,
        isMultiple(i, FIVE)    to BUZZ,
        isMultiple(i, FIFTEEN) to FIZZBUZZ)[ZERO].toString()+"$CARRY"

    public fun execute(sb : StringBuilder) : String {
        for(i in INIT_RANGE..END_RANGE_INCLUSIVE)
            sb.append(toValue(i))
        
        return sb.toString()
    }


    private fun isMultiple(a : Int, b :Int) = (a % b)
}

```

### Version 3 - Time: 14ms
Source
```kotlin
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

```

## #Version 4 - Time: 24ms
Source
```kotlin
class FizzBuzz4(){

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
        (INIT_RANGE..END_RANGE_INCLUSIVE).forEach {
            sb.append(it.mapToFizzBuzz())
        }
        
        return sb.toString()
    }

    private fun isMultiple(a : Int, b :Int) = (a % b)
}

```

Test
```kotlin

import org.junit.Assert
import org.junit.Test

/**
 * Created by vicboma on 25/11/15.
 */
class FizzBuzz[1..4]Test() {
    @Test
    @Throws(Exception::class)
    fun testMain(){
        val expected = FizzBuzzExpected()
        val fizzBuzz[1..4] = FizzBuzz[1..4]()

        val sb = StringBuilder()
        val result = fizzBuzz[1..4].execute(sb)

        Assert.assertEquals("Not same", expected.value ,result)
    }
}

```


## Java
Source
```java
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
```

Test
```java
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
```
