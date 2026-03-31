
import java.util.Scanner;


public class Main{

    public static void main ( String [] args){
guess();
    }

public static void guess () {
    int number = (int)(Math.random() * 100) + 1;   
    Scanner scanner = new Scanner(System.in);

System.out.println("Enter your guess: ");
        int guess = scanner.nextInt();

if(guess == number){
    System.out.println("First Try!");
}

 while (guess != number ){


    if (guess > number){
        System.out.println("Guess to high, enter a new input.");
        guess = scanner.nextInt();
    }
    else if (guess < number ){
        System.out.println("Guess to low, enter a new input.");
        guess = scanner.nextInt();
}


}

System.out.println("nice!");


}


}





