import java.util.Scanner;

public class FiveDigitLottoSPG 
{
    public static void main(String[] args) 
    {
        playLottery();
    }
    
    public static void playLottery ()
    {
        Scanner input = new Scanner(System.in);
        
        boolean isPlayingLottery = true;    //Boolean that acts a ticker
                        
        while (isPlayingLottery)
        {            
            int lotteryDigit1 = (int) (0 + Math.random() * 10); //Generate a random digit between 0 - 9
            int lotteryDigit2 = (int) (0 + Math.random() * 10);
            int lotteryDigit3 = (int) (0 + Math.random() * 10);
            int lotteryDigit4 = (int) (0 + Math.random() * 10);
            int lotteryDigit5 = (int) (0 + Math.random() * 10);
            
            System.out.println("Welcome to Lottery! Your goal is to guess all 5 "
            + "digits in the correct order.");
            
            System.out.println("\n" + "Please enter your 5 digits (0 - 9), separated by the Enter key: ");

            int guessDigit1 = input.nextInt();  //Guess a digit between 0 and 93
            
            while (guessDigit1 < 0 || guessDigit1 > 9)
            {
                System.out.println("Invalid input! Please try again");
                guessDigit1 = input.nextInt();
            }

            int guessDigit2 = input.nextInt();
            while (guessDigit2 < 0 || guessDigit2 > 9)
            {
                System.out.println("Invalid input! Please try again");
                guessDigit2 = input.nextInt();
            }

            int guessDigit3 = input.nextInt();
            while (guessDigit3 < 0 || guessDigit3 > 9)
            {
                System.out.println("Invalid input! Please try again");
                guessDigit3 = input.nextInt();
            }

            int guessDigit4 = input.nextInt();
            while (guessDigit4 < 0 || guessDigit4 > 9)
            {
                System.out.println("Invalid input! Please try again");
                guessDigit4 = input.nextInt();
            }

            int guessDigit5 = input.nextInt();
            while (guessDigit5 < 0 || guessDigit5 > 9)
            {
                System.out.println("Invalid input! Please try again");
                guessDigit5 = input.nextInt();
            }

            // This begins the heart of the game's logic
            //There are 2 variables (below) that are incremented and evaluated depending on the conditions met
            
            int rightNumber_WrongSpot = 0;
            int allNumbersInRightSpot = 0;

            if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
                    || guessDigit1 == lotteryDigit4 || guessDigit1 == lotteryDigit5)
            {
                rightNumber_WrongSpot++;
            }

            if (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                    || guessDigit2 == lotteryDigit4 || guessDigit2 == lotteryDigit5)
            {
                rightNumber_WrongSpot++;
            }

            if (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3
                    || guessDigit3 == lotteryDigit4 || guessDigit3 == lotteryDigit5)
            {
                rightNumber_WrongSpot++;
            }

            if (guessDigit4 == lotteryDigit1 || guessDigit4 == lotteryDigit2
                    || guessDigit4 == lotteryDigit3 || guessDigit4 == lotteryDigit4 || guessDigit4 == lotteryDigit5)
            {
                rightNumber_WrongSpot++;
            }

            if (guessDigit5 == lotteryDigit1 || guessDigit5 == lotteryDigit2
                    || guessDigit5 == lotteryDigit3 || guessDigit5 == lotteryDigit4 || guessDigit5 == lotteryDigit5)
            {
                rightNumber_WrongSpot++;
            }

            if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit3
                    && guessDigit4 == lotteryDigit4 && guessDigit5 == lotteryDigit5)
            {            
                allNumbersInRightSpot = 1;
                rightNumber_WrongSpot = 0;
            }
            
            if (guessDigit1 == guessDigit2 && guessDigit2 == guessDigit3
               && guessDigit3 == guessDigit4 && guessDigit4 == guessDigit5)
            {
               System.out.println("All guess numbers are the same");
               
               if (lotteryDigit1 == lotteryDigit2 && lotteryDigit2 == lotteryDigit3
                  && lotteryDigit3 == lotteryDigit4 && lotteryDigit4 == lotteryDigit5)
               {
                   rightNumber_WrongSpot = 0;
                   allNumbersInRightSpot = 1; 
               }
               else if (guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit3 == lotteryDigit3
                       || guessDigit4 == lotteryDigit4 || guessDigit5 == lotteryDigit5)
               {
                   allNumbersInRightSpot = 0;
                   rightNumber_WrongSpot = 2;
                   
               }
            }

            System.out.println("The lottery number is: " + lotteryDigit1 + "" + lotteryDigit2 + "" + 
            lotteryDigit3 + "" + lotteryDigit4 + "" + lotteryDigit5 + "\n");

            if (rightNumber_WrongSpot == 0 && allNumbersInRightSpot == 1)
            {
                System.out.println("Congratulations!!! You have correctly guessed all the numbers in the correct order."
                + " You have been rewarded $10,000!");
            }
            else if (rightNumber_WrongSpot == 5 && allNumbersInRightSpot == 0)
            {
                System.out.println("You got all the correct numbers, but they were not in order."
                + " You have been rewarded $5,000!");
            }
            else if (rightNumber_WrongSpot >= 1 && rightNumber_WrongSpot < 5 && allNumbersInRightSpot == 0)
            {
                System.out.println("You guessed at least 1 number in the sequence!"
                + " You have been rewarded $1,000!");
            }
            else
            {
                System.out.println("You lose! You did not match any of the numbers.");
            }
            
            System.out.println("\n" + "Would you like to play again? Enter Y for yes and N for no ");
        
            String playAgainAnswer = input.next();
                
            if (playAgainAnswer.equalsIgnoreCase("Y"))
            {
                    isPlayingLottery = true;    //Keep playing
            } 
            else if (playAgainAnswer.equalsIgnoreCase("N")) 
            {
                    isPlayingLottery = false;   //Bool is false - game ends
            }
        }
    }
}
