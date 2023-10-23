// Java program that prints a message based on the value of an integer
// If the value in "num" is divisible by 3, prints "fizz"
// If the value in "num" is divisible by 5, prints "buzz"
// If the value in "num" is divisible by both 3 and 5, prints "fizzbuzz"
// If the value in "num" is divisible by neither 3 nor 5, prints the value of num.

public class fizzbuzz {

  public static void main (String[] args) {

    int num = 15;

    if (num % 3 == 0 && num % 5 == 0) {
      System.out.println("fizzbuzz");
    } else if (num % 5 == 0) {
      System.out.println("buzz");
    } else if (num % 3 == 0) {
      System.out.println("fizz");
    } else {
      System.out.println(num);
    }
  }
}
