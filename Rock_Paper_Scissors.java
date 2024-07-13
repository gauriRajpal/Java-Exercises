import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissors.");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("Draw");
        }
        
        else if(userInput== 00 && computerInput == 2 || userInput == 1 && computerInput == 0 
             || userInput == 2 && computerInput == 1 ){ 
              System.out.println("You win!");
             }
             else{
                System.out.println("Computer win");
             }

             
             if(computerInput==0){
                System.out.println("Computer choice is ROCK");
             }
             else if(computerInput==1){
                System.out.println("Computer choice is PAPER");
             }
             else if(computerInput==2){
                System.out.println("Computer choice is SCISSORS");
             }
    }
}