import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Which planet is known as the Red Planet?",
                new String[]{"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"}, 'B'));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?",
                new String[]{"A. Charles Dickens", "B. Jane Austen", "C. William Shakespeare", "D. Mark Twain"}, 'C'));
        questions.add(new Question("What is the capital of Japan?",
                new String[]{"A. Tokyo", "B. Kyoto", "C. Osaka", "D. Hiroshima"}, 'A'));
        questions.add(new Question("Which is the largest mammal?",
                new String[]{"A. Elephant", "B. Whale Shark", "C. Blue Whale", "D. Giraffe"}, 'C'));

        // Step 2: Start quiz
        int score = 0;
        System.out.println("Welcome to the Online Quiz!\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = sc.next().charAt(0);

            if (q.isCorrect(answer)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.correctOption + "\n");
            }
        }

        // Step 3: Display final score
        System.out.println("Quiz Over! Your Score: " + score + "/" + questions.size());
        if (score == questions.size()) {
            System.out.println("🏆 Perfect! Well done!");
        } else if (score >= questions.size() / 2) {
            System.out.println("👍 Good job!");
        } else {
            System.out.println("📚 Keep practicing!");
        }

        sc.close();
    }
}
