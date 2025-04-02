import java.util.Scanner;

public class SimpleQuizApplication {
    private static final String[][] QUESTIONS = {
        {"What is the capital of France?", "A) Berlin", "B) Madrid", "C) Paris", "D) Rome", "C"},
        {"Which planet is known as the Red Planet?", "A) Earth", "B) Mars", "C) Jupiter", "D) Saturn", "B"},
        {"What is the largest ocean on Earth?", "A) Atlantic Ocean", "B) Indian Ocean", "C) Arctic Ocean", "D) Pacific Ocean", "D"},
        {"Who wrote 'Romeo and Juliet'?", "A) Charles Dickens", "B) Mark Twain", "C) William Shakespeare", "D) Jane Austen", "C"},
        {"What is the chemical symbol for water?", "A) O2", "B) H2O", "C) CO2", "D) NaCl", "B"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Simple Quiz Application!");
        System.out.println("Please answer the following questions:");

        for (String[] question : QUESTIONS) {
            System.out.println(question[0]); // Print the question
            for (int i = 1; i <= 4; i++) {
                System.out.println(question[i]); // Print the options
            }

            System.out.print("Your answer (A, B, C, D): ");
            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals(question[5])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + question[5] + ".\n");
            }
        }

        System.out.println("Quiz Over! Your score: " + score + "/" + QUESTIONS.length);
        scanner.close();
    }
}
