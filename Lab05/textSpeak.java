import java.util.Scanner;

public class textSpeak {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        scan.close();

        String replaceInp = inp
                .replace('e', '3')
                .replace('s', '5')
                .replace('b', '8');

        System.out.println(replaceInp);

        int totalValue = calculateTotalValue(replaceInp);

        System.out.println(totalValue);
    }

    public static int calculateTotalValue(String str) {
        int totalValue = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                totalValue += Character.getNumericValue(c);
            }
        }

        return totalValue;
    }
}
