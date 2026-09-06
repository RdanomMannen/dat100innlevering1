import java.util.Scanner;
public class MyClass {
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
System.out.print("Hvor mye tjener du? ");
int lonn = scanner.nextInt();
 double skatt = 0;

if (lonn <= 226100) {
   skatt = 0;
    
}
else if (lonn <= 318300) {
   skatt = (lonn - 226100)*0.017;
}
    else if (lonn <=725050) {
        skatt = 1567.40 + ((lonn - 318300) * 0.04);
}
    else if (lonn <=980100) {
        skatt = 1567.40 + 16270.00 + ((lonn - 725050) * 0.137);
}
    else if (lonn <=1467200) {
         skatt = 1567.40 + 16270.00 + 34941.85 + ((lonn - 980100) * 0.168);
}
    else{
       skatt = 1567.40 + 16270.00 + 34941.85 + 81828.80 + ((lonn - 1467200));
}
System.out.println("Du må betale " + skatt + " kr i trinnskatt.");
}
  }