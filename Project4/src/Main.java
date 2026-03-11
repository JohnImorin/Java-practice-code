import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //⭐ temperature converter 🌡️
        // This project is made with a ternary operator
        // Ternary operator = Return 1 of 2 values if a condition is true
        // variable = (condition)? iftrue : iffalse;


        Scanner scanner=new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature : ");
        temp= scanner.nextDouble();

        System.out.print("Convert to celsius or Fahrenheit : ");
        unit= scanner.next().toUpperCase();
        System.out.println(unit);


        newtemp= (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32 ;

        System.out.println( newtemp + " degree celsius ");











































        scanner.close();


    }
}