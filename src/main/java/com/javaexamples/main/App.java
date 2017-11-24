package com.javaexamples.main;

import com.javaexamples.Fibonacci.Fibonacci;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Fibonacci fb = new Fibonacci();
        System.out.println(fb.fibonacci(10));
    }
}
