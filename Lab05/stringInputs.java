import java.util.Scanner;

public class stringInputs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String lower = input.toLowerCase();

        int length = input.length();

        System.out.println(lower);

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (i % 2 == 0) {
                System.out.print(Character.toUpperCase(currentChar));
            } else {
                System.out.print(Character.toLowerCase(currentChar));
            }
        }

        System.out.println();
        System.out.println(length);

        for (int i = 1; i < input.length(); i+=2) {
            char currentChar = input.charAt(i);
            System.out.println(currentChar);
        }
        scan.close();
    }
}
