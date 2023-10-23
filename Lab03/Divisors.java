// Java program that uses a for loop to print all of the divisors of a given number

public class divisors {

  public static void main(String[] args) {

    int num = 24;

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.print(i + ",");
      }
    }
  }
}
