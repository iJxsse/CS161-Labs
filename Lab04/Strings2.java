public class Strings2 {

    public static void main(String[] args) {

        String guitar = new String ("Most guitars have six strings");

        int occ = guitar.indexOf('h');
        int length = guitar.length();

        String lower = guitar.toLowerCase();
        String upper = guitar.toUpperCase();

        System.out.println("String Length: " + length);
        System.out.println("First occurence of character 'h': " + occ);
        System.out.println(lower);
        System.out.println(upper);
    }
}
