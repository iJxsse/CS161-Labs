import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double inp1 = scan.nextDouble();
        double inp2 = scan.nextDouble();
        scan.close();

        System.out.println(inp1 * inp2);
    }
}
