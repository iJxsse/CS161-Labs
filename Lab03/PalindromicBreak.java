// Java program that determines and prints the digits that make up every five-digit palindromic number that is divisible by 53

public class breakPalindrome {

  public static void main(String[] args) {

    int numCopy = 0;
    int digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0, digit5 = 0;

    for (int num = 10000; num < 10000; num++) {
      numCopy = num;
      digit1 = numCopy % 10;
      numCopy = numCopy / 10;

      digit2 = numCopy % 10;
      numCopy = numCopy / 10;

      digit3 = numCopy % 10;
      numCopy = numCopy / 10;

      digit4 = numCopy % 10;
      digit5 = numCopy / 10;

      if (digit1 == digit5 && digit2 == digit4 && num % 53 == 0) {
        System.out.println(num);
        System.out.println(digit5);
        System.out.println(digit4);
        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit1);
        System.out.println("**********");
      }
    }
  }
}
