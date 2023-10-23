// Java program that uses a do-while loop to determine if a positive integer number is a prime number

public class primeCheck {

    public static void main(String[] args) {
  
      int num = 12;
      int i = 2;
      boolean prime = true;
  
        do {
          if (num % i == 0) {
                prime = false;
          }
          i++;
        } while (i <= num / 2);
        
        if (prime) {
          System.out.println(num + " is a prime number");
        } else {
          System.out.println(num + " is NOT a prime number");
        }
    }
}
