//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Welcome to my Final Fantasy XIV quiz!");

        System.out.println("Q1) What is Dark Knight tank stance called?");
            String A1 = sc.nextLine();
            if (A1.equalsIgnoreCase("Grit")){
                System.out.println("Correct!");
                score = score + 1;
            } else{
                System.out.println("Incorrect. The answer was Grit");
            }

        System.out.println("Q2) What is the name of the alliance raid series in A Realm Reborn?");
            String A2 = sc.nextLine();
            if(A2.equalsIgnoreCase("Crystal Tower")){
                System.out.println("Correct");
                score = score + 1;
            } else{
                System.out.println("Incorrect. The answer was Crystal Tower");
            }

        System.out.println("Q3) What is the only class that correlates to two seprate jobs?");
            String A3 = sc.nextLine();
            if (A3.equalsIgnoreCase("Arcanist")){
                System.out.println("Correct!");
                score = score + 1;
            } else{
                System.out.println("Incorrect. The answer was Arcanist");
            }
        
        System.out.println("Great job!");
        System.out.println("Your score was: " + score +"!");

        sc.close(); 
    }
}


