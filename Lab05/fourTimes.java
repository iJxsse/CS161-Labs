import java.util.Scanner;

public class fourTimes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();

        for (int i = 0; i < inp.length(); i++) {
            char wordChar = inp.charAt(i);

            for (int j = 0; j < 4; j++) {
                System.out.print(wordChar);
            }
        }
        scan.close();
    }
}
