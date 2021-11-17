import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) throws IOException {
        Student student = new Student();
        start(student);
    }
    public static void start(Student student) throws IOException {
        int score = 0;
        System.out.println("ИГРА <<ЭКЗАМЕН>>");
        ExamTypeEnum examTypeEnum = student.choiceSubject();
        Execisize execisize = new Execisize(examTypeEnum);
        int firstTicket = student.choiceTicket();
        if(execisize.choiceQuestionsByNumber(firstTicket)){
            ++score;
        }
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        for(int i = 0;i<9;i++) {
            if (execisize.choiceQuestions()) {
                ++score;
            }
            if (score == 4) {
                System.out.println("Троечка уже есть, устроит? (Да/Нет)");
                answer = b.readLine();
                if (answer.equalsIgnoreCase("да")) {
                    break;
                }
            }else if (score == 6) {
                System.out.println("Уже четверка есть, дальше пробуем? (Да/Нет)");
                answer = b.readLine();
                if (answer.equalsIgnoreCase("нет")) {
                    break;
                }
            }
        }
        if(score >= 9){
            System.out.println("Оценка 5");
        }else if(score < 9 && score >= 6){
            System.out.println("Оценка 4");
        }else if(score < 6 && score >= 4){
            System.out.println("Оценка 3");
        }else{
            System.out.println("Оценка 2");
        }
    }
}