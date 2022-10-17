import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempCel = 0;
        double tempFah = 0;
        String trash = "";
        boolean done = false;
        do {

            System.out.print("\nEnter your temp in celcius ");
            if (in.hasNextInt()) {
                tempCel = in.nextInt();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }while (!done);
        double tempFa = (tempCel * 9 / 5 + 32 ) ;
        System.out.println("Your temp in F is " + tempFa);
    }
}