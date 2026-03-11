import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        //⭐ compound interest calculator 💸

        Scanner scanner= new Scanner(System.in);

        String name;
        double principal;
        double rate;
        int year ;
        int timescompounded;
        double amount ;


        System.out.print("What's your name? ");
        name= scanner.next();
        System.out.println("Welcome "+ name );

        System.out.print("Enter the principal amount "+name+" "+" :");
        principal= scanner.nextDouble();

        System.out.print("Enter the rate (in %) "+name+" "+" :");
        rate = scanner.nextDouble()/100 ;

        System.out.print("Enter the number times compounded per year :");
        timescompounded= scanner.nextInt();

        System.out.print("Enter the number of  year :");
        year= scanner.nextInt();

        amount=principal * Math.pow(1 + rate / timescompounded, timescompounded *year);

        System.out.println("The amount after "+year+" "+"is $: "+amount);










































        scanner.close();

    }
}