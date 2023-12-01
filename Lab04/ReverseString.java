public class ReverseString {

    public static void main(String[] args) {
    
    String reverse = new String("programming");
    String twist = new String("");
    char extract;

    for (int i = 0; i < reverse.length(); i++) {
        extract = reverse.charAt(i);
        twist = extract + twist;
    }

    System.out.println(twist);

    }
}
