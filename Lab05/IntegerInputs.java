import java.util.Scanner;

public class integerInputs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int val1 = scan.nextInt();

        System.out.println("Please enter a second number:");

        int val2 = scan.nextInt();

        System.out.println("Sum: " + (val1 + val2));
        System.out.println("Product: " + (val1  * val2));
    }
}
