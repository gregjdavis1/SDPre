public class Objective8Lab3 {
  public static void main(String []args) {
    int counter = 1;

    for(int i=counter; i<=20; i++) {

    if (counter % 2 == 0) {
      System.out.println(counter + " is even");
    }
    else if(counter % 2 != 0) {
      System.out.println(counter + " is odd");
    }
    counter = counter +1;
    }
  }
}
