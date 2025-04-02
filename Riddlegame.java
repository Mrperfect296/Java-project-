import java.util.Scanner;

public class RiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Riddle and answer
        String riddle = "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?";
        String answer = "echo";
        
        System.out.println("Welcome to the Riddle Game!");
        System.out.println("Here is your riddle:");
        System.out.println(riddle);
        
        boolean correct = false;
        
        while (!correct) {
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();
            
            if (userAnswer.equals(answer)) {
                System.out.println("Congratulations! You guessed the correct answer.");
                correct = true;
            } else {
                System.out.println("That's not correct. Try again!");
            }
        }
        
        scanner.close();
        System.out.println("Thanks for playing!");
    }
}
