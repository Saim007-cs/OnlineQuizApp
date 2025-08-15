import java.util.*;

public class Question {

    String questionText;
    String[] options;
    char correctOption; // 'A', 'B', 'C', 'D'

    public Question(String questionText, String[] options, char correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = Character.toUpperCase(correctOption);
    }

    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == correctOption;
    }
}

