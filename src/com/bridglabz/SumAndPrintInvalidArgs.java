package com.bridglabz;

public class SumAndPrintInvalidArgs {
    public void addAndPrintInvalid(String[] args){
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg);
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Number of invalid inputs: " + invalidCount);
    }
}
