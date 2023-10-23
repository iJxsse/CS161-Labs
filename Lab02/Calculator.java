// Java program that initialises a variable to store a single character and two variables to store whole numbers

public class calculator {

  public static void main (String[] args) {

    int num1 = 9;
    int num2 = 3;
    char math = '/';

    if (math == '+') {
      System.out.println(num1 + num2);
    } else if (math == '-') {
      System.out.println(num1 - num2);
    } else if (math == '*') {
      System.out.println(num1 * num2);
    } else if (math == '/') {
      System.out.println(num1 / num2);
    }
  }
}
