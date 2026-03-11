import java.util.Scanner;
import java.util.Random;

public class Main {
    // ⭐ dice roller program 🎲

    static void aidice1(int num){

        String dice1= """
               ---------------
              |               |
              |               |
              |       ●       |
              |               |
              |               |
               ---------------
                """;

        String dice2= """
               ---------------
              |       ●       |
              |               |
              |               |
              |               |
              |       ●       |
               ---------------
                """;

        String dice3= """
               ---------------
              | ●             |
              |               |
              |       ●       |
              |               |
              |             ● |
               ---------------
                """;

        String dice4= """
               ---------------
              | ●           ● |
              |               |
              |               |
              |               |
              | ●           ● |
               ---------------
                """;

        String dice5= """
               ---------------
              | ●           ● |
              |               |
              |       ●       |
              |               |
              | ●           ● |
               ---------------
                """;

        String dice6= """
               ---------------
              | ●     ●     ● |
              |               |
              | ●     ●     ● |
              |               |
              | ●     ●     ● |
               ---------------
                """;

        switch (num){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("invalid entry");
        }
    }

    public static void main(String[] args) {



        int choice;
        double money;
        String name;
        double total;
        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("******************************");
        System.out.println("Welcome to the dice roller game");
        System.out.println("******************************");

        System.out.print("What's your name : ");
        name = scanner.nextLine();

        System.out.println("Welcome " + name);
        System.out.print("What's your bet " + name + ": ");
        money = scanner.nextDouble();

        do {
            if (money < 0) {
                System.out.println("You can't add a negative number");
            } else {
                double money2 = random.nextDouble(0.99, 1000); // bet òdinatè
                System.out.println("The computer bet is : " + money2);
                total = money + money2;
                System.out.println("The total amount betting is : " + total);
            }

            System.out.print("How many dice you wanna roll (1 or 2): ");
            choice = scanner.nextInt();

            if (choice <= 0 || choice > 2) {
                System.out.println("You must choose 1 or 2 dice.");
            } else {
                // ------- USER ROLLS -------
                int userSum = 0;
                System.out.println("\n" + name + " rolls:");
                if (choice == 1) {
                    int roll = random.nextInt(1, 7);
                    aidice1(roll);
                    System.out.println("You rolled: " + roll);
                    userSum = roll;
                } else { // choice == 2
                    int roll1 = random.nextInt(1, 7);
                    int roll2 = random.nextInt(1, 7);
                    System.out.println("Die #1:");
                    aidice1(roll1);
                    System.out.println("Die #2:");
                    aidice1(roll2);
                    System.out.println("You rolled: " + roll1 + " and " + roll2);
                    userSum = roll1 + roll2;
                }
                System.out.println("Your total: " + userSum);

                // ------- COMPUTER ROLLS (same number of dice) -------
                int cpuSum = 0;
                System.out.println("\nComputer rolls:");
                if (choice == 1) {
                    int cpu = random.nextInt(1, 7);
                    aidice1(cpu);
                    System.out.println("Computer rolled: " + cpu);
                    cpuSum = cpu;
                } else {
                    int cpu1 = random.nextInt(1, 7);
                    int cpu2 = random.nextInt(1, 7);
                    System.out.println("Die #1:");
                    aidice1(cpu1);
                    System.out.println("Die #2:");
                    aidice1(cpu2);
                    System.out.println("Computer rolled: " + cpu1 + " and " + cpu2);
                    cpuSum = cpu1 + cpu2;
                }
                System.out.println("Computer total: " + cpuSum);

                // ------- RESULT -------
                System.out.println("\n=== RESULT ===");
                if (userSum > cpuSum) {
                    System.out.println("You WIN! 🎉 Higher total wins.");
                } else if (userSum < cpuSum) {
                    System.out.println("You LOSE! 😅 Computer has higher total.");
                } else {
                    System.out.println("It's a TIE! 🤝");
                }
                System.out.println();
            }

            System.out.print("Roll again? (y/n): ");
            String again = scanner.next().trim().toLowerCase();
            if (!again.equals("y")) isRunning = false;

        } while (isRunning);

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}
