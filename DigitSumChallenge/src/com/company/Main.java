package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of given number = " + sumDigits(3234));
    }

    private static int sumDigits(int number) {
        int lastDigit;
        int sum = 0;
        if(number < 10) {
            return -1;
        } else {
            while(number > 0) {
                //extract the least-significant digit
                lastDigit = number % 10;
                sum += lastDigit;

                //drop the least-significant digit
                number /= 10;
            }
        }
        return sum;
    }
}
