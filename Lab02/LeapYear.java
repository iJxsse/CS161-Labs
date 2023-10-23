// Java program to print out how many days are in a month in any given year using an if and switch statement

public class leapYear {

  public static void main (String[] args) {

    int year = 2023;
    int month = 2;

    if(year > 0) {
      int daysInFebruary = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
        switch (month) {
          case 1: System.out.println("In January " + year + " " + "there were 31 days"); break;
          case 2: System.out.println("In February " + year + " there were " + daysInFebruary + " days"); break;
          case 3: System.out.println("In March " + year + " " + "there were 31 days"); break;
          case 4: System.out.println("In April " + year + " " + "there were 30 days"); break;
          case 5: System.out.println("In May " + year + " " + "there were 31 days"); break;
          case 6: System.out.println("In June " + year + " " + "there were 30 days"); break;
          case 7: System.out.println("In July " + year + " " + "there were 31 days"); break;
          case 8: System.out.println("In August " + year + " " + "there were 31 days"); break;
          case 9: System.out.println("In September " + year + " " + "there were 30 days"); break;
          case 10: System.out.println("In October " + year + " " + "there were 31 days"); break;
          case 11: System.out.println("In November " + year + " " + "there were 30 days"); break;
          case 12: System.out.println("In December " + year + " " + "there were 31 days"); break;
          default: System.out.println("Not a valid month");
          }
      } else {
         System.out.println("Please enter a positive year");
        }  
  }
}
