# Java Exercises

## Exercise 1 - Print Hello and Name

### Question
Write a Java program to print `Hello` on screen and then print your name on
a separate line.

### Algorithm
1. Print the word C on screen.
2. Print your name `Glory` on the next line.

### Pseudocode
```
BEGIN
  PRINT `Hello`
  PRINT `Glory`
END
````

### Java Code
```java
public static void printHello() {
    System.out.println("Hello");
    System.out.println("Glory");
}
```

## Exercise 2

### Question - Print Leap Year

Create a program that takes a year as input from user and print if it’s leap
year or not.

### Algorithm
1. Read year from user.
2. If year is divisible by 400, it is a leap year.
3. Else if the year is divisible by 4 but not by 100, it is a leap year.
4. Else it is not a leap year.
5. Print the result.

### PseudoCode
```
BEGIN
  PROMPT `Enter a year: `
  READ year

IF (year MOD 400 == 0 ) THEN
  PRINT `year is a leap year`
ELSE IF (Year MOD 4 == 0 ANDyear MOD 100 != 0) THEN
  PRINT``(year is a a leap year) ```
ELSE
  PRINT `year is not a leap year`
END IF
END
```

### Java Code
``` java
public static void printLeapYear() {
Scanner scanner = new Scanner(System.in)
System.out.print(`Enter a year: `)
int year = scanner.nextInt();

if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
System.out.println( year + "is a leap year"; {
} else {
System.out.printin(year + "is not a leap year"
  }
}
```

## Exercise 3 – Basic Arithmetic

### Question - Basic Arithmetic
Write a Java program to print the sum, multiplication, division, and subtraction of two numbers.

### Algorithm
1. Choose the numbers for each operation.
2. Perform addition, multiplication, division, and subtraction.
3. Print the expression and the result for each operation.
   
### Pseudocode
```
BEGIN
    SET a1 = 45, b1 = 11
    PRINT "45 + 11 = " + (a1 + b1)

    SET a2 = 12, b2 = 4
    PRINT "12 * 4 = " + (a2 * b2)

    SET a3 = 24, b3 = 6
    PRINT "24 / 6 = " + (a3 / b3)

    SET a4 = 55, b4 = 12
    PRINT "55 - 12 = " + (a4 - b4)
END
```

### Java Code

```Java
public static void basicArithmetic() {
    System.out.println("45 + 11 = " + (45 + 11));
    System.out.println("12 * 4 = " + (12 * 4));
    System.out.println("24 / 6 = " + (24 / 6));
    System.out.println("55 - 12 = " + (55 - 12));
}
```

## Exercise 4 – Average of Three Numbers

### Question
Write a Java program that prints the average of three numbers.

### Algorithm
1. Define three integer numbers: 10, 20, and 30.
2. Calculate their sum.
3. Divide the sum by 3 to get the average.
4. Print the average.

### Pseudocode

```
BEGIN
    SET num1 = 23
    SET num2 = 11
    SET num3 = 77

    SET sum = num1 + num2 + num3
    SET average = sum / 3

    PRINT "(num1 + num2 + num3) / 3 = " + average
END
```

### Java Code

```java
public static void printAverage() {
    int num1 = 10, num2 = 20, num3 = 30;
    int sum = num1 + num2 + num3;
    int average = sum / 3;
    System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / 3 = " + average);
}
```

## Exercise 5 – Greet User

### Question
Create a program that asks the user to input their name and stores it in a variable. Then print Hello <username>.

### Algorithm
1. Ask the user to enter their name.
2. Read the name into a variable.
3. Print "Hello" followed by the name.
   
### Pseudocode

```
BEGIN
    PROMPT "Enter your name: "
    READ name
    PRINT "Hello " + name
END
```

### Java Code

```java
public static void printUserName() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Hello " + name);
}
```

## Exercise 6 – Print User Input

### Question
Create a program that asks the user to input two numbers and prints the sum, multiplication, division, and subtraction of the given numbers.

### Algorithm
1. Ask the user to input the first number.
2. Ask the user to enter the operator .
3. Ask the user to input the second number.
4. Calculate and print sum, product, quotient, and difference.
   
### Pseudocode

```
BEGIN
    PROMPT "Enter first number: "
    READ a

  PROMPT "Enter first operator: "
    READ b

    PROMPT "Enter second number: "
    READ c

    PRINT a + " + " + b + " + c + = " + (a + b)
    PRINT a + " * " + b + " = " + (a * b)
    PRINT a + " / " + b + " = " + (a / b)
    PRINT a + " - " + b + " = " + (a - b)
END
```

### Java Code

```java

public static void printUserInput() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = scanner.nextInt();

    System.out.print("Enter second number: ");
    int b = scanner.nextInt();

    System.out.println(a + " + " + b + " + c + " = " + (a + b));
    System.out.println(a + " + " + b + " + c + " = " + (a + b));
    System.out.println(a + " + " + b + " + c + " = " + (a + b));
    System.out.println(a + " + " + b + " + c + " = " + (a + b));
}
```

## Exercise 7 – Convert Seconds

### Question
Create a program that converts seconds to hours, minutes, and seconds.

### Algorithm
1. Read total seconds.
2. Calculate hours, minutes, and remaining seconds.
3. Print formatted time (HH:MM:SS).
   
### Pseudocode

```
BEGIN
    PROMPT "Input seconds: "
    READ totalSeconds

    hours = totalSeconds / 3600
    remaining = totalSeconds MOD 3600
    minutes = remaining / 60
    seconds = remaining MOD 60

    PRINT hours:minutes:seconds
END
```

### Java Code

```java
static void convertSecondsToHMS() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input seconds: ");
    int totalSeconds = scanner.nextInt();

    int hours = totalSeconds / 3600;
    int remaining = totalSeconds % 3600;
    int minutes = remaining / 60;
    int seconds = remaining % 60;

    String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
    System.out.println(formattedTime);
}
```

## Exercise 8 – Guess the Number

### Question
Write a program that generates a random number between 1 and 500. The user must guess the number, and the program will provide feedback ("too small", "too big") until the correct number is guessed.

### Algorithm
Generate random number target.
Loop:
1. Ask for guess.
2. If guess == target, print success and exit.
3. If guess < target, print "Too small".
4. If guess > target, print "Too big".


### Pseudocode

```
BEGIN
    GENERATE target in [1, 500]
    REPEAT
        READ guess
        IF guess == target THEN EXIT
        ELSE IF guess < target THEN PRINT "Too small"
        ELSE PRINT "Too big"
    UNTIL guess == target
END
```

### Java Code

```java
static void guessTheNumber() {
    Random random = new Random();
    int targetNumber = random.nextInt(500) + 1;
    Scanner scanner = new Scanner(System.in);

    int attempts = 0;
    System.out.println("Guess the number (between 1 and 500):");

    while (true) {
        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();
        attempts++;

        if (guess == targetNumber) {
            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            break;
        } else if (guess < targetNumber) {
            System.out.println("Your guess was too small.");
        } else {
            System.out.println("Your guess was too big.");
        }
    }
}
```
