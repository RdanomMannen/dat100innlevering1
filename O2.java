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

        for (int i = 0; i < 10; i++) {
            int poeng;
            while (true){
                System.out.print("Hvor mange poeng? ");
                poeng = scanner.nextInt();
                
                if (poeng >= 0 && poeng <= 100) {
                    break;
                }
            System.out.println("Ugyldig tall. Prøv igjen.");

}
           
             if (poeng <= 0) {
                System.out.println("Du har fått karakteren F");
            } else if (poeng <= 40) {
                System.out.println("Du har fått karakteren E");
            } else if (poeng <= 50) {
                System.out.println("Du har fått karakteren D");
            } else if (poeng <= 60) {
                System.out.println("Du har fått karakteren C");
            } else if (poeng <= 80) {
                System.out.println("Du har fått karakteren B");
            } else {
                System.out.println("Du har fått karakteren A");
            }
        }
        scanner.close();
    }
}