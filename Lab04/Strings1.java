public class Strings1 {

    public static void main(String[] args) {
  
      String compS = new String ("Computer Science");
      String edu = new String ("Education");
  
      String subcompS = compS.substring(9);
  
      String scEdu = subcompS + " " + edu;
  
      System.out.println(scEdu);
  }
}
