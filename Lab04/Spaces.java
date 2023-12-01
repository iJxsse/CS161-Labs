public class Spaces {
 
    public static void main(String[] args) {

        String addSpaces = "just checking to see if this program works";
        char num;
        char space = ' ';

        int i = 0;

        while (i < addSpaces.length()) {

            num = addSpaces.charAt(i);

            if (addSpaces.charAt(i) != space) {
                System.out.print(num + " ");
                i++;
            } else {
                i++;
            }
        }
    }
}
