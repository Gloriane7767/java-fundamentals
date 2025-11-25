# Java Exercises

## Exercise 1 - Print Hello andName

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

### Question - Leap Year

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
public static void checkLeapYear() {
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
