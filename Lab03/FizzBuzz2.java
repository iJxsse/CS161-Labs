// Java program that prints a sequence of messages based on the fizzbuzz rules
// If the value in "num" is divisible by 3, prints "fizz".
// If the value in "num" is divisible by 5, prints "buzz".
// If the value in "num" is divisible by both 3 and 5, prints "fizzbuzz".
// If the value in "num" is divisible by neither 3 nor 5, prints the value of num.

public class fizzbuzz {

  public static void main(String[] args) {

    int start = 2;
    int end = 3;

    for (int num = start; num <= end; num++) {
      if (num % 3 == 0 && num % 5 == 0) {
        System.out.println("Fizzbuzz ");
      } else if (num % 3 == 0) {
        System.out.println("Fizz ");
      } else if (num % 5 == 0) {
        System.out.println("Buzz ");
      } else {
        System.out.println(num + " ");
      }
    }
  }
}
