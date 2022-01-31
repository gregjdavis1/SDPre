import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String [] args){
    Scanner kb = new Scanner(System.in);

    System.out.println("Let's determine if a number is even or odd.");
    System.out.println("Please enter a whole number.");

    int num = kb.nextInt();

    if (num == 0) {
      System.out.println("Zero is neither even nor odd.");
    }

    if (num % 2 == 0) {
      System.out.println("The number is even.");
    }
    else if(num % 2 != 0) {
      System.out.println("The number is odd.");
    }
  }
}
