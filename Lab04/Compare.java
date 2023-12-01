public class Compare {

    public static void main(String[] args) {

        String text1 = new String("programming");
        String text2 = new String("development");

        boolean same = true;
        boolean similar = true;

        if(text1.equals(text2)) {
            same = true;
            System.out.println("Exactly the same: " + same);
        } else if (text1.equalsIgnoreCase(text2)) {
            same = false;
            similar = true;
            System.out.println("Exactly the same: " + same);
            System.out.println("Similar enough: " + similar);
        } else {
            same = false;
            similar = false;
            System.out.println("Exactly the same: " + same);
            System.out.println("Similar enough: " + similar);
        }
    }
}
