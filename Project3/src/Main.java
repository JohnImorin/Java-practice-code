import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //⭐ weight and height converter 🏋️

        Scanner scanner= new Scanner(System.in);

        String name;
        String conv;

        double weight = 0;
        double newweight;

        double hight = 0;
        double newhight;

        int choice;

        System.out.print(" Enter your name : ");
        name = scanner.nextLine();

        System.out.println(" Welcome to the convert program : "+ name);

        System.out.println(" Welcome to the convert height or weight ?");
        conv = scanner.nextLine();

        if (conv.equalsIgnoreCase("height")) {
            do {
                System.out.print(" make a choice pick an number : 1. meter to feet or  2.feet to Meter ? ");
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.print(" Enter the number in meter: ");
                    hight = scanner.nextDouble();
                } else if (choice == 2) {
                    System.out.print(" Enter the number in feet : ");
                    hight = scanner.nextDouble();
                } else {
                    System.out.println("Please make a valid choice ");
                }

                switch (choice) {
                    case 1:
                        // meter -> feet  (MULTIPLY)
                        newhight = hight * 3.281;
                        System.out.print(" The height in feet is : " + newhight);
                        break;
                    case 2:
                        // feet -> meter  (DIVIDE)
                        newhight = hight / 3.281;
                        System.out.print(" The height in meter is : " + newhight);
                        break;
                }

            } while (choice != 1 && choice != 2);  // <-- boukle sèlman si chwa pa valab
        }
        else if (conv.equalsIgnoreCase("weight")) {

            do {
                System.out.print(" make a choice pick an number : 1. lbs to kgs or  2.kgs to lbs ? ");
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.print(" Enter the number in lbs  : ");
                    weight = scanner.nextDouble();
                } else if (choice == 2) {
                    System.out.print(" Enter the number in kgs : ");
                    weight = scanner.nextDouble();
                } else {
                    System.out.println("Please make a valid choice ");
                }

                switch (choice) {
                    case 1:
                        // lb -> kg  (DIVIDE)
                        newweight = weight / 2.2046244;
                        System.out.print(" The weight in kgs is : " + newweight);
                        break;

                    case 2:
                        // kg -> lb  (MULTIPLY)
                        newweight = weight * 2.2046244;
                        System.out.print(" The weight in lbs is : " + newweight);
                        break;
                }

            } while (choice != 1 && choice != 2);  // <-- menm prensip la
        }
        else {
            System.out.println("Please make a valid choice ");
        }

        System.out.println(" Thank you for using our services "+ name);

        scanner.close();
    }
}
