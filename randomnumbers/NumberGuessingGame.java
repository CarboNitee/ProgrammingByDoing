package randomnumbers;
import java.util.Scanner;
public class NumberGuessingGame {

    public static void main( String[] args ) {

        // for(int i = 0; i < 1000; i++)
        // {
        //     double x = Math.random();
        //     int y = 10 + (int)(x * 11);

        //     System.out.println(y);
        // }

		Scanner scanner = new Scanner(System.in);

        int answer =(int)(Math.random() * 101);

        System.out.println(answer);

        int guesscounter = -1, guessesused = 1;

        while(guesscounter < 0){
            System.out.println("======================================================================================");
            System.out.println("");
            System.out.println("Choose your difficulty: Easy(20 Guesses), Normal(10 Guesses), or Hard(5 Guesses)");
            System.out.println("");

            String difficulty = scanner.next();

            if(difficulty.equals("Easy")){
                guesscounter = 19;
            }
            else if(difficulty.equals("Normal")){
                guesscounter = 9;
            }
            else if(difficulty.equals("Hard")){
                guesscounter = 4;
            }
        }

        System.out.println("");
        
        System.out.println("Take your guess.");
        System.out.println("");
        int guess = scanner.nextInt();


        
        while(guess > 0 && guess != answer)
        {
            if(guess < answer)
            {
                System.out.println("=================================================================");
                System.out.println("║Wrong! You guessed too low! Try a1gain. You have " + guesscounter + " guesses left.║");
                System.out.println("=================================================================");
            }
            
            else
            {
                System.out.println("=================================================================");
                System.out.println("║wrong! You guessed too high! Try again. You have " + guesscounter + " guesses left.║");
                System.out.println("=================================================================");
            }
            guesscounter--;
            guessesused ++;

            System.out.println("Take your guess.");
            guess = scanner.nextInt();
        }
        if(guess == answer){
            System.out.println("That is correct. you used " +guessesused+ " guesses.");
        } else {
            System.out.println("Game over! You used up all your guesses. The answer was x   " + answer + ". ");
        }

        scanner.close();
    }
}


