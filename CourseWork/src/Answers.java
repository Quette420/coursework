import java.util.Arrays;
import java.util.List;

public class Answers {
    private List<String> cAnswers = Arrays.asList(
            "printf",
            "Ритчи",
            "Нет",
            "1997",
            "Да",
            "for",
            "рекурсия",
            "public",
            "полиморфизм",
            "delete");
    private List<String> javaAnswers = Arrays.asList(
            "main",
            "1995",
            "Да",
            "Нет",
            "Да",
            "Да",
            "Объект",
            "Нет",
            "private",
            "Да");
    private List<String> oopAnswers = Arrays.asList(
            "Переопределение",
            "Полиморфизм",
            "Наследование",
            "Инкапсуляция",
            "Абстракция",
            "Объект",
            "Суперкласс",
            "Да",
            "Да",
            "Да");

    public List<String> getcAnswers() {
        return cAnswers;
    }

    public List<String> getJavaAnswers() {
        return javaAnswers;
    }

    public List<String> getOopAnswers() {
        return oopAnswers;
    }

    public  List<String> getAnswersByExamType(ExamTypeEnum examTypeEnum){
        List<String> answers;
        if(ExamTypeEnum.C.equals(examTypeEnum)){
            answers = getcAnswers();
        }else if(ExamTypeEnum.JAVA.equals(examTypeEnum)){
            answers = getJavaAnswers();
        }else{
            answers = getOopAnswers();
        }
        return answers;
    }
}
