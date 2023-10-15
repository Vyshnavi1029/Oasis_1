import java.util.*;
import java.lang.Math;

public class Guessinggame {
  public static void main(String[] args) {
    
    int answer = (int)(Math.random() * 100) + 1;
 
    int k = 5;
  
    Scanner sc = new Scanner(System.in);
   
    boolean correct = false;
    System.out.println("I'm thinking of a number between 1 and 100.\nYou have 5 tries to guess the number.");
    while (k > 0) {
      System.out.println("Enter your guess: ");
      int guess = sc.nextInt();
      k--; 
      if (guess == answer) {
        System.out.println("You guessed the number!\nYou win!");
        correct = true;
        break;
      } else if (guess > answer) {
        System.out.println("Your guess is too high.\nYou have " + k + " tries left.");
      } else {
        System.out.println("Your guess is too low.\nYou have " + k + " tries left.");
      }
    }
    if (!correct) {
      System.out.println("You ran out of tries.\nYou lose!");
    }
  }
}
