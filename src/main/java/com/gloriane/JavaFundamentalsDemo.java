package com.gloriane;

import java.util.Scanner;

public class JavaFundamentalsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Fundamentals Demo!");

        printName();
        printLeapYear();
        sum2();
        division2();
        product2();
        difference2();
        printAOperations();
        printAverage();
        printHello();
        printInputSum();
        secondsConverter();
        printGuessNumber();
    }

    public static void printName() {
        System.out.println("------------Print Name-------------");
        System.out.println("Hello!");
        System.out.println("Glory \n Foncha");
    }

    public static void printLeapYear() {
        System.out.println("------------Print LeapYear-------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void sum2() {
        System.out.println("------------ Print Sum-------------");
        int a1 = 45;
        int b1 = 11;
        int sum = a1 + b1;
        System.out.println(a1 + " + " + b1 + " = " + sum);
    }

    public static void division2() {
        int a3 = 24;
        int b3 = 6;
        int division = a3 / b3;
        System.out.println(a3 + " / " + b3 + " = " + division);
    }

    public static void product2() {
        int a2 = 12;
        int b2 = 4;
        int product = a2 * b2;
        System.out.println(a2 + " * " + b2 + " = " + product);
    }

    public static void difference2() {
        int a4 = 55;
        int b4 = 12;
        int difference = a4 - b4;
        System.out.println(a4 + " - " + b4 + " = " + difference);
    }

    public static void printAOperations() {
        System.out.println("------------Operations-------------");
        int num1 = 45;
        int num2 = 15;
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println("sum of " + num1 + " and " + num2 + " is " + sum + ".");
        System.out.println("subtraction of " + num1 + " and " + num2 + " is " + subtraction + ".");
        System.out.println("multiplication of " + num1 + " and " + num2 + " is " + multiplication + ".");
        System.out.println("division of " + num1 + " and " + num2 + " is " + division + ".");
    }

    public static void printAverage() {
        System.out.println("------------ Print Average-------------");
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + average);
    }
    public static void printHello() {
        System.out.println("------------Input Hello! UserName-------------");
        String userName = "Glory";
        System.out.println("Hello, " + userName + "!");
    }

    public static void printInputSum() {
        System.out.println("------------Input Operations-------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }
        int num1 = scanner.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }
        int num2 = scanner.nextInt();

        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + result + ".");
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + result + ".");
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + result + ".");
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The division of " + num1 + " and " + num2 + " is " + result + ".");
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
    public static void secondsConverter() {
        System.out.println("------------Print Seconds to Minutes to Hours-------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;              // 1 hour = 3600 seconds
        int minutes = (totalSeconds % 3600) / 60;     // remaining minutes
        int seconds = totalSeconds % 60;              // remaining seconds

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
    
public static void printGuessNumber() {
        System.out.println("------------Guess the Number Game-------------");
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = 7; // predefined number to guess
        System.out.print("Guess a number between 1 and 500: ");
        int userGuess = scanner.nextInt();

        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Sorry, the correct number was " + numberToGuess + ".");
        }
    }
}