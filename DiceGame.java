import java.util.Scanner;

class DiceGame{
    public static void main(String[] args){
        
        boolean play = true;
        boolean playAgain = true;
        Scanner YesOrNo = new Scanner(System.in);
        boolean repeat = true;
        int uncooperativeCounter = 0;

        System.out.println("Welcome to the game of Craps! The rules are simple, if you roll a 7 or 11, you win! But if you roll a 2, 3 or 12, you lose!");
        System.out.print("Would you like to play? (y/n) ");
        while(repeat){    
            String op = YesOrNo.nextLine();
            if(op.equals("y") || op.equals("Y") || op.equals("Yes") || op.equals("yes") || op.equals("YES")){
                play = true;
                System.out.println("Alright! Let's get started!");
                repeat = false;
            }
            else if(op.equals("n") || op.equals("N") || op.equals("no") || op.equals("No") || op.equals("NO")){
                play = false;
                System.out.println("Sorry for bothering you");
                repeat = false;
            }
            else{
                if(uncooperativeCounter < 6){
                    System.out.println("I'm sorry, what was that?");
                    uncooperativeCounter++;
                }
                else if(uncooperativeCounter >= 6 && uncooperativeCounter < 10){
                    System.out.println("It's a yes or no question, please confirm or deny with a yes or a no respectively");
                    uncooperativeCounter++;
                }
                else if(uncooperativeCounter >= 10 && uncooperativeCounter < 20){
                    System.out.println("What are you doing?!");
                    uncooperativeCounter++;
                }
                else if(uncooperativeCounter >= 20 && uncooperativeCounter < 25){
                    System.out.println("Can you seriously answer the question?");
                    uncooperativeCounter++;
                }
                else{
                    System.out.println("Ok, listen here pal. I don't have time for this, you clearly don't want to play, so I'm going to have to ask you to leave.");
                    repeat = false;
                    play = false;
                }
            }
        }

        while(play && playAgain){
            System.out.println("Press enter when you're ready to roll");
            String any = YesOrNo.nextLine();
            int D6 = Die.roll();
            System.out.println(D6);
            if(D6 == 7 || D6 == 11) System.out.println("Good job! You win!");
            else if(D6 == 2 || D6 == 3 || D6 == 12) System.out.println("You lose! Don't worry though, you're just warming up.");
            else System.out.println("Point");
            System.out.print("Would you like to play again? ");
            String op = YesOrNo.nextLine();
            if(op.equals("y") || op.equals("Y") || op.equals("Yes") || op.equals("yes") || op.equals("YES")) playAgain = true;
            else playAgain = false;
        }

        YesOrNo.close();

    }
}