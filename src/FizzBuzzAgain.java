import java.util.Scanner;

public class FizzBuzzAgain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      System.out.println("Type a number between 1 and 2,147,483,647 and press enter: ");

    try {
      int entry = sc.nextInt();
      for (int i = 1; i <= entry; i++) {
        if (i % 15 == 0) {
          System.out.println("fizzbuzz");
        } else if (i % 3 == 0) {
          System.out.println("fizz");
        } else if (i % 5 == 0) {
          System.out.println("buzz");
        } else {
          System.out.println(i);
        }
      }
    } catch (java.util.InputMismatchException e) {
      System.out.println("That was an invalid input, please try again:");
    }
  }
}


