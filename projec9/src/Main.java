import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

         // ⭐ quiz game 💯

        // the questions
        String [] question= {"Who is the best soccer player in the world?"," Who is the best midfield actually?",
                "Who got mre Ballon d'or?","Who got the most  titles? "};



        // answer option
        String[][] options={{"1.Messi ", "2. Pele" , "3. Maradona "},
                {"1.Pedri ", "2.Jude" , "3.Musiala "},
                {"1.Messi ", "2.Cr7 " , "3.Johan Cruff"},
                {"1.Messi ", "2. Daniel Alves" , "3.Iniesta "}};


        //answer
        int[] answer={1,1,1,1};
        int score=0;
        int guess;

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("***********************");
        System.out.println("Welcome to soccer quizz");
        System.out.println("***********************");

        //question loops
        for(int i=0;i< question.length;i++){
            System.out.println(question[i]); // to show the question

            for(String option:options[i]){
                System.out.println(option);// toshow the option
            }
            System.out.print("Enter your guess : ");
            guess= scanner.nextInt();

            if(guess==answer[i]){
                System.out.println("************");
                System.out.println("Correct");
                System.out.println("************");
                score++;

            }else{
                System.out.println("************");
                System.out.println("Wrong");
                System.out.println("************");
            }

        }

        System.out.println("Your Final score is : "+score+"/"+question.length);


        scanner.close();


    }
}