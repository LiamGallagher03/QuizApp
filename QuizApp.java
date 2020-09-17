package quizapp;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
  int score = 0;
  int var1 = (int) (Math.random() * 10);
  int var2 = (int) (Math.random() * 10);
  Scanner kboard = new Scanner(System.in);
  
  System.out.println("Hello!");
  System.out.println("What color is the sky?");
  String answer1 = kboard.nextLine();
  if (answer1.equals("blue")) {
      //give point
      score++;
      System.out.println("Correct!");
  }
  //try again
  else {
      System.out.println("Try Again.");
      String answer21 = kboard.nextLine();
      if (answer21.equals("blue")) {
          score += 1;
          System.out.println("Correct!");
      }
      else {
          System.out.println("I gave you two chances???");
      }
  }
  System.out.println("How many letters are in the word 'Egg' (type the number)");
  int answer2 = kboard.nextInt();
  if (answer2 == 3) {
      score++;
      System.out.println("Correct!");
  }
  else {
      System.out.println("I hope you typed the word instead of actually getting it wrong");
  }
  System.out.println("What is 9+10?");
  int answer3 = kboard.nextInt();
          if (answer3 == 19) {
           System.out.println("Correct!");
           score++;
          }
          else if (answer3 == 21) {
        System.out.println("Now you get a point removed.");
        score--;
    }
          else {
           System.out.println("Math is hard.");   
                   }
     System.out.println("What is the color of grass?");
        String answer4 = kboard.next();
        
         if (answer4.equals("green"))
         {
             score++;
             System.out.println("Correct!");
         }
         else {
             System.out.println("Incorrect!");
         }
    System.out.println("Is "+var1+" greater than "+var2+"?");
    String answer6 = kboard.next();
    if (var1 > var2 && answer6.equals("Yes")) {
        System.out.println("Correct!");
          }
    else if (var1 > var2) {
            System.out.println("Incorrct!");
    }
    else if (var2 >= var1 && answer6.equals("No")) {
        System.out.println("Corrct!");
    }
    else {
        System.out.println("Incorrect!");
    }
    System.out.println("How many days are in a week?");
    int answer5 = kboard.nextInt();
    if (answer5 == 7) {
        System.out.println("Correct!");
                score++;
                System.out.println("Your final score is "+score+".");
    }
    else {
        System.out.println("Incorrect!");
        System.out.println("Your final score is "+score+".");
    }
    }
    
}
