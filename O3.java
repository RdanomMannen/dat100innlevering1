/*
Welcome to JDoodle!

You can execute code here in 110+ languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/
import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Skriv inn et heltall n > 0: ");
            n = scanner.nextInt();
            if (n > 0) {
                break;
            }
            System.out.println("Tallet må være større enn 0. Prøv igjen.");
        }
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        System.out.println(n + "! = " + resultat);
        scanner.close();

  }
}