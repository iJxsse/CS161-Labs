// Java program that uses if selection statements to print out which type of vehicle a driver's license allows them to drive.

public class driverCategory {

  public static void main(String[] args) {

    char license = 'b';

    if (license == 'a') {
      System.out.println("Motorcycle");
    } else if (license == 'b') {
      System.out.println("Car");
    } else if (license == 'c') {
      System.out.println("Truck");
    } else if (license == 'd') {
      System.out.println("Bus");
    }
  }
}
