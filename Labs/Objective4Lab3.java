public class Objective4Lab3 {
  public static void main(String [] arg){
    java.util.Scanner input = new java.util.Scanner(System.in);


    //int birthYear, age, currentYear;
    int currentYear = 2022;
  //birthYear = 0;
  //Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt();
    int birthYear = (currentYear - age);
    System.out.println("You were born in " + birthYear + " ...or possibly the year before that -- assuming it is still 2022.");
    input.close();
  }
}
