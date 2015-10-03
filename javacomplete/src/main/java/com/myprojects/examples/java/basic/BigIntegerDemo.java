/**
 * 
 */
package com.myprojects.examples.java.basic;

import java.math.BigInteger;

/**
 * @author shiva koduri
 * 
 * Java Program to calculate factorial of large numbers using BigInteger class.
 * BigInteger class is also immutable, so any modification e.g. addition, 
 * multiplication will produce a new instance of BigInteger, leaving original object intact.
 */
public class BigIntegerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger result = factorial(BigInteger.valueOf(5));
        System.out.println("factorial of 5 : " + result);

        result = factorial(BigInteger.valueOf(10));
        System.out.println("factorial of 10 : " + result);
        
        result = factorial(BigInteger.valueOf(50));
        System.out.println("factorial of 50 : " + result);
	}
	
	
	/**
     * Java method to calculate factorial of large number.
     *
     * @param number BigInteger
     * @return factorial of number as BigInteger
     */
    public static BigInteger factorial(BigInteger number) {

        // factorial of 0 and 1 is always 1 - base case
        if (number == BigInteger.ZERO || number == BigInteger.ONE) {
            return BigInteger.ONE;
        }
        
         // !n = n*!n-1 - recursive call      
        return number.multiply(factorial(number.subtract(BigInteger.ONE)));

    }
}
