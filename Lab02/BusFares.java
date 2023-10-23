// Java program that prints out the bus fare depending on whether the user is an adult or a child
// using the ternary operator

public class busFares {

  public static void main (String[] args) {

    double fare = 2.05;
    char passenger = (fare >= 2.0) ? 'A' : 'C';

    if (passenger == 'A') {
      System.out.println("The fare is: 2.05");
    } else {
      System.out.println("The fare is: 0.65");
    }
  }
}
