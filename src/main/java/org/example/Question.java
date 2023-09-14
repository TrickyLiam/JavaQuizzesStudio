package org.example;

public abstract class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public abstract boolean checkAnswer(String answer);

}
abstract class MultipleChoiceQuestion extends Question {

        String choiceA;
        String choiceB;
        String choiceC;
        String choiceD;
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }
}

abstract class CheckBoxQuestion extends Question {
    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }
}

abstract class TrueOrFalseQuestion extends Question {
    public TrueOrFalseQuestion(String question, String answer) {
        super(question, answer);
    }


}

