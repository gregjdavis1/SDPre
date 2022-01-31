import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String [] args) {
    Scanner kb = new Scanner(System.in);
    //int userNum;

    System.out.println("Let's determine if a number is positve or negative.");
    System.out.println("Please enter a whole number:");

    int userNum = kb.nextInt();

    if (userNum > 0) {
      System.out.println("The number is positive.");
    }
    else if(userNum < 0) {
      System.out.println("The number is negative.");
    }
    else if(userNum == 0) {
      System.out.println("Zero is neither positive nor negative.");
    }
  }
}
