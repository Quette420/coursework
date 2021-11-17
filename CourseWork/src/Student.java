import java.io.IOException;
import java.util.Scanner;

public class Student {
    public ExamTypeEnum examTypeEnum;

    public ExamTypeEnum choiceSubject()throws IOException{
        System.out.println("C , Java , ОПП ");
        System.out.println("Введи что сдаем");
        Scanner scanner = new Scanner(System.in);
        String subject = scanner.nextLine();
        if(subject.equalsIgnoreCase("C")||subject.equalsIgnoreCase("С")){
            System.out.println("Вы выбрали язык C ");
            examTypeEnum = ExamTypeEnum.C;
        }else if(subject.equalsIgnoreCase("java")||subject.equalsIgnoreCase("джава")){
            examTypeEnum = ExamTypeEnum.JAVA;
        }else if(subject.equalsIgnoreCase("ООП")||subject.equalsIgnoreCase("OOP")){
            examTypeEnum = ExamTypeEnum.OOP;
        }else{
            System.out.println("Выберите один из списка");
            choiceSubject();
        }
        return examTypeEnum;
    }
    public int choiceTicket(){
        System.out.println("Выберите билет свой первый вопрос (от 1 до 10)");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Ваш билет с номером " + number);
        return --number;
    }
}