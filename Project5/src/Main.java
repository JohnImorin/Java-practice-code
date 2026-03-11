//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //⭐ calculator program 🖩
        // A simple calculator using the switch loop (enhanced switches 💡)

        Scanner scanner= new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;

        System.out.print("Enter the first number : ");
        num1= scanner.nextDouble();


        System.out.print("Enter the operator (* , / , + , - , ^) : ");
        operator= scanner.next().charAt(0);

        System.out.print("Enter the second number : ");
        num2= scanner.nextDouble();


        switch (operator){
            case '*'-> result= num1 * num2;
            case '/'-> result= num1 / num2;
            case '+'-> result= num1 + num2;
            case '-'-> result= num1 - num2;
            case '^'-> result=Math.pow(num1,num2);
        }
        System.out.print("The result is :"+result);



        scanner.close();

    }
}