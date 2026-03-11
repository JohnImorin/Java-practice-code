import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //⭐ number guessing game 🔢

    Scanner scanner= new Scanner(System.in);
    Random random= new Random();

    String name;
    int guess;
    int attempt=0;
    int min=1;
    int max=4;

    int newnumber= random.nextInt(min,max);

    System.out.print("Enter your name :");
    name= scanner.nextLine();

    System.out.println("WELCOME TO THE GUESSING GAME : "+name);

    do{

        System.out.print("Enter your number : ");
        guess=scanner.nextInt();
        attempt++;

        if(guess<newnumber){
            System.out.println("Your number is too low !!!!!!! ");
        }else if(guess>newnumber){
            System.out.println("Your number is too High !!!!!!! ");
        }else{
            System.out.println("Congratulation U guessed right !!!!");
        }

    }while (guess!=newnumber);

        System.out.println("The number of attempt you have done : "+ attempt);

        scanner.close();;



    }
}