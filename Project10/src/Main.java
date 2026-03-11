import java.util.Locale;
import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        //⭐ rock paper scissors 🗿

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        String[] data={"rock","Paper","scissors"};

        String playerchoice;
        String computerchoice;
        String playagain="yes";

        System.out.println("****************************************");
        System.out.println("Welcome to the rock,paper,scissors game ");
        System.out.println("****************************************");

        do {
            System.out.print("Enter your choice(\"rock\",\"Paper\",\"scissors\"): ");
            playerchoice = scanner.nextLine().toLowerCase();

            if (!playerchoice.equals("rock") && !playerchoice.equals("paper") && !playerchoice.equals("scissors")) {
                System.out.println("Invalid choice");
            }
            computerchoice = data[random.nextInt(3)];
            System.out.println("Computer choice is : " + computerchoice);

            if (playerchoice.equals(computerchoice)) {
                System.out.println("Tie ");

            } else if (playerchoice.equals("rock") && computerchoice.equals("siccors") ||
                    (playerchoice.equals("Paper") && computerchoice.equals("rock") || playerchoice.equals("scissors") && computerchoice.equals("paper"))) {
                System.out.println("You win");
            } else {
                System.out.println("You lose ");
            }

            System.out.print("Do u wanna play again(yes/no) : ");
            playagain= scanner.nextLine().toLowerCase();

        }while (playagain.equals("yes"));

        System.out.println("********************");
        System.out.println("Thank u for playing ");
        System.out.println("********************");




    }
}