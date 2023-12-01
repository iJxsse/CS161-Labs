public class eircode {

    public static void main(String[] args) {

        String eircode = "W23V6V8";

        String [][] areas = {
            {"A86" , "Dunboyne"},
            {"X35" , "Dungarven"},
            {"R45" , "Edenderry"},
            {"W23" , "Maynooth"},
            {"V14" , "Shannon"},
        };

        String key = eircode.substring(0,3);
        String identifier = eircode.substring(3,7);

        String area = "Other";

        for (String[] entry : areas) {
            if (entry[0].equalsIgnoreCase(key)) {
                area = entry[1];
                break;
            }
        }

        System.out.println("Key:" + key + "-" + "Identifier:" + identifier + "-" + "Area:" + area + ".");
    }
}
