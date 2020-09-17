package quizapp;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
  int score = 0;
  Scanner kboard = new Scanner(System.in);
  
  System.out.println("Hello!");
  System.out.println("What color is the sky?");
  String answer1 = kboard.nextLine();
  if (answer1.equals("blue")) {
      //give point
      score++;
      System.out.println("Correct!");
  }
  else {
      System.out.println("What planet are you living on?");
  }
  System.out.println("How many letters are in the word 'Egg' (type the number)");
  int answer2 = kboard.nextInt();
  if (answer2 == 3) {
      score++;
      System.out.println("Corrct!");
  }
  else {
      System.out.println("I hope you typed the word instead of actually getting it wrong");
  }
  System.out.println("What is 9+10?");
  int answer3 = kboard.nextInt();
          if (answer3 == 19);
          {
           System.out.println("Correct!");
          }
          else {
           System.out.println("Math is hard.");   
                   }
           
          
    }
    
}
