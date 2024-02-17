import java.util.Scanner;

public class largerNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] inputs = new int [10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (scan.hasNextInt()) {
                inputs [i] = scan.nextInt();
            }
        }

        for (int i = 0; i < 9; i++) {
            if (inputs [i] < inputs [i + 1]) {
                count++;
            }
        }

        System.out.println("A larger number was entered after a smaller number " + count + " times");

        scan.close();
    }
}
