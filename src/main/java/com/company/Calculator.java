package com.company;

public class Calculator {

    public int divide(int a, int b) {
        if ( b == 0 ) {
            return 0;
        }

        return a/b;
    }

    //add function
    public int add(int a, int b){
        return a + b;
    }

    //subtract function
    public int subtract(int a, int b){
        return a - (b);
    }

    //multiply function
    public int multiply(int a, int b){
        return a * b;
    }
}
