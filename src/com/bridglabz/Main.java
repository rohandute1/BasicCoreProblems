package com.bridglabz;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Please select any one program: ");
        System.out.println("1.program to display any message.\n" +
                "2.program to display the default value of all primitive data types\n" +
                "3.program to check two strings are equal or not.\n" +
                "4.To find the sum of command-line arguments\n" +
                "5.To get the name using the command line\n" +
                "6.Program to demonstrate static variables, methods, and blocks.\n" +
                "7.Program to check leap year or not.");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch(option){
            case 1:
                DisplayMessage msg = new DisplayMessage();
                msg.printMessage();
                break;
            case 2:
                primitiveDataTypesValue value = new primitiveDataTypesValue();
                value.printValue();
                break;
            case 3:
                StringsEqualOrNot equal = new StringsEqualOrNot();
                equal.checkStrings();
                break;
            case 4:
                SumAndPrintInvalidArgs sum = new SumAndPrintInvalidArgs();
                sum.addAndPrintInvalid(args);
                break;
            case 5:
                System.out.println("Please enter name: ");
                String name = args[2];
                System.out.println("Your name is: "+ name);
                break;
            case 6:
                DemonstrateStatic.main();
                break;
            case 7:
                CheckLeapYearOrNot check = new CheckLeapYearOrNot();
                check.yearChecker();
                break;
        }
    }
}