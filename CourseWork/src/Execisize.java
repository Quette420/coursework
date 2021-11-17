import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Execisize {
    private List<String> questions;
    private List<String> answers;
    private List<Integer> expiredQuestions;

    public Execisize(ExamTypeEnum examTypeEnum) {
        Questions questions = new Questions();
        Answers answers = new Answers();
        this.questions = questions.getQuestionsByExamType(examTypeEnum);
        this.answers = answers.getAnswersByExamType(examTypeEnum);
        expiredQuestions = new ArrayList<>();
    }

    public boolean choiceQuestions() throws IOException {
        return processRandom(questions, answers);
    }

    public boolean choiceQuestionsByNumber(int number) throws IOException {
        return processByNumber(questions, answers, number);
    }

    private boolean processByNumber(List<String> questions, List<String> answers, int number) throws IOException{
        boolean flag;
        expiredQuestions.add(number);
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(questions.get(number));
        String answer = b.readLine();
        System.out.println("Ваш ответ= "+answer);
        if (answers.get(number).equalsIgnoreCase(answer)){
            System.out.println("Правильно");
            flag=true;
        }
        else {
            flag=false;
            System.out.println("не Правильно");
        }
        return flag;
    }
    private boolean processRandom(List<String> questions, List<String> answers) throws IOException {
        boolean flag;
        int questionNumber = randomNumQuestion();
        expiredQuestions.add(questionNumber);
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(questions.get(questionNumber));
        String answer = b.readLine();
        System.out.println("Ваш ответ= " + answer);
        if (answers.get(questionNumber).equalsIgnoreCase(answer)){
            System.out.println("Правильно");
            flag=true;
        }
        else {
            flag=false;
            System.out.println("не Правильно");
        }
        return flag;
    }

    private int randomNumQuestion(){
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        boolean alreadyHere = expiredQuestions.contains(randomNumber);
        while (alreadyHere){
            randomNumber = random.nextInt(10);
            if(!expiredQuestions.contains(randomNumber)){
                break;
            }
        }
        return randomNumber;
    }
}
