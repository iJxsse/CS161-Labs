public class Backwards {
 
    public static void main(String[] args) {

        String sentence = new String("pay no attention to the man behind the curtain");
        int start = 0;
        int end = sentence.length() - 1;

        for (int i = end; i >= 0; i--) {
            char c = sentence.charAt(i);
            if (c == ' ' || i == 0) {
                if (i == 0) {
                    start = 0;
                } else {
                    start = i + 1;
                }

                String word = sentence.substring(start, end + 1);
                System.out.println(word);
                end = i - 1;
            }
        }
    }
}
