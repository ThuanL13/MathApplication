import java.util.Arrays;
import java.util.Scanner;     // import the Scanner class
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Variables 1
        double garySalary = 178989;
        double bobSalary = 102488;
        double highestSalary = Math.max(garySalary, bobSalary);

        System.out.println("The highest salary is $" + highestSalary);

        // Variables 2
        double carPrice = 500000;
        double truckPrice = 8000;
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is $" + lowestPrice);

        // Variables 3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area is " + area);

        //Variables 4
        double myVariable = 5.0;
        double squareRoot = Math.sqrt(myVariable);

        System.out.println("The square root is " + squareRoot);

        //Variables 5
        double x = 5, y = 10;
        double x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));

        System.out.println("The distance is " + distance);

        // Variables 6
        double value= -3.8;
        double absoluteValue = Math.abs(value);

        System.out.println("The absolute value is " + absoluteValue);

        // Variables 7
        double randomNumb = Math.random();

        System.out.println("Random number between 0 and 1 is " + randomNumb);

        // Variables 8
        int days = 24;

        int hoursDay = 24;
        int totalHours = days * hoursDay;

        int minutesHour = 60;
        int totalMinutes = totalHours * minutesHour;

        System.out.println("In " + days + " there are " + totalMinutes +
                " minutes");

        // Bonus
        int miliseconds = 1000;
        int secondsInMinutes = 60;

        System.out.println("There are " + (days * hoursDay * minutesHour *
                secondsInMinutes * miliseconds) + " miliseconds in 24 days");

        // Scanner work
        Scanner read = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = read.nextLine();
        System.out.println("I read the name " + name);

        System.out.println("What is your age? ");
        int age = read.nextInt();
        System.out.println("I read the age: " + age);

        read.nextLine(); // Reads the next line

        System.out.println("What is your favorite movie? ");
        String movie = read.nextLine();
        System.out.println("Favorite movie is: " + movie);

        System.out.println("How many hours a day do you watch movies? ");
        double movieHours = read.nextDouble();
        System.out.println("You watch " + movieHours + " hours");

        // Create a Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("What is your name? ");
        String myName = scanner.nextLine();

        System.out.print("How old are you? ");
        int yourAge = scanner.nextInt();

        // Display the results
        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");

        // Close the Scanner
        read.close();
        scanner.close();




    }
}
