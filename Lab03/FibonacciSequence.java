// Java program that uses a while loop to print the final number in a Fibonacci Sequence of a given size, denoted by a variable "num"

public class fibonacci {

  public static void main(String[] args) {

    int num = 8;
    int first = 0;
    int second = 1;
    int finalNum = 0;

    if (num == 1) {
      finalNum = first;
    } else if (num == 2) {
      finalNum = second;
    } else {
      int count = 2;
      while (count < num) {
        finalNum = first + second;
        first = second;
        second = finalNum;
        count++;
      }
    }
    System.out.println(finalNum);
  }
}
