// Java program to find out how many cents Paddy will have saved on a given day

public class centPincher {

  public static void main(String[] args) {

    int days = 3;
    int savedCents = 1;
    int currentDay = 1;

    while (currentDays < days) {
      savedCents = savedCents * 2 + 1;
      currentDay++;
    }

    System.out.println(savedCents);
  }
}
