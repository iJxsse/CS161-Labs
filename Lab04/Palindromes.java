public class Palindromes {
    
    public static void main (String[] args) {

        String text = new String("navan");
        String palin = new String("");
        char extract;

        for (int i = 0; i < text.length(); i++) {
            extract = text.charAt(i);
            palin = extract + palin;
        }

        if(text.equalsIgnoreCase(palin)) {
            System.out.println(text.toUpperCase() + " is a palindrome");
        } else {
            System.out.println(text.toUpperCase() + " is NOT a palindrome");
        }
      
    }
}
