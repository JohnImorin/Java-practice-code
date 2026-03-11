import java.util.Scanner;
import java.util.Random;


public class Main {

    static String[] spingrow(){

        String[] symbols={"💣","💵","7️⃣","🪙"};
        String[] row=new String[3];
        Random random=new Random();

        System.out.println(symbols[random.nextInt(symbols.length)]);
        for(int i=0 ; i<3;i++){
            row[i]=symbols[random.nextInt(symbols.length)];
        }
        return row;
    }



    static float gpayout(String[]row,float bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2]) ){
            return switch (row[0]){
                case "💣"->bet * 0;
                case "💵"->bet * 10;
                case "7️⃣"->bet * 2;
                case "🪙"->bet * 5;
                default -> 0;
            };
        }
        //Ainsi de suite

        return 0;
    }



    static void print(String[] row){
        System.out.println("**************");
        System.out.println(" "+String.join("|",row));
        System.out.println("**************");
    }



    public static void main(String[] args) {
        //⭐ slot machine 🎰

        Scanner scanner= new Scanner(System.in);

        float balance=100;
        float bet;
        float payout;
        String[] row;
        String playagain;

        System.out.println("****************************");
        System.out.println("Welcome to John Slot machine");
        System.out.println("Symbols : 💣💵7️⃣🪙");
        System.out.println("****************************");

        while (balance>0){
            System.out.println("current balance : "+balance);

            System.out.print("place your bet: ");
            bet= scanner.nextFloat();

            scanner.nextLine();

            if(bet>balance){
                System.out.println("insufisent found");
                continue;
            } else if (bet<=0) {
                System.out.println("Bet should be greater than 0");
            }else{
                balance-=bet;

            }

            System.out.println("Spinning");

            row=spingrow();

            print(row);

            payout=gpayout(row,bet);

            if(payout>0){
                System.out.println("You won $:"+payout);
                balance+=payout;

            }else{
                System.out.println(" you lost");
            }
            System.out.println(" wanna play again (Y/N)");
            playagain=scanner.nextLine().toUpperCase();

            if(!playagain.equals("y")){
                break;
            }

        }

        System.out.println(" game over balance : "+balance);

        scanner.close();

    }
}
