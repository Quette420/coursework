import java.util.Arrays;
import java.util.List;

public class Questions {
    private List<String> cQuestions = Arrays.asList(
            "Как называется функция вывода в C ?",
            "Кто написал язык C (Фамилия) ?",
            "С++ это С с классами (Да/Нет)?",
            "Год выпуска первой версии С++ Builder (Год числом)",
            "C - это структурное программирование (Да/Нет)",
            "Безусловный оператор цикла",
            "Функция обращаемая сама себе",
            "Общедоступный способ доступа к членам данных",
            "Свойство позволяющая использовать один и тот же интерфейс",
            "Удаление элементов из памяти");
    private List<String> javaQuestions = Arrays.asList(
            "Главный метод программы на Java",
            "В каком году появился язык Java (Год числом)",
            "Java - это объектно-ориентированный язык программирования? (Да/Нет)",
            "Java - низкоуровневый язык программирования? (Да/Нет)",
            "Является ли Java С подобным языком? (Да/Нет)",
            "Java - кроссплатформенный язык программирования? (Да/Нет)",
            "Экземпляр класса - это...",
            "Поддерживается ли множественное наследование в Java? (Да/Нет)",
            "Модификатор доступа с областью видимости внутри класса",
            "Есть ли многопоточность в Java? (Да/Нет)");
    private List<String> oopQuestions = Arrays.asList(
            "Изменение реализации уже существующего в суперклассе метода, в классе наследнике",
            "Назовите принцип ООП характеризующийся как: \"Один интерфейс, множество реализаций\"",
            "Принцип ООП позволяющий описать класс на основе уже существующего ",
            "Принцип ООП позволяющий объеденить данные и методы, работающие с ними, в классе и скрыть детали",
            "Способ выделить набор значимых характеристик объекта, исключая из рассмотрения незначимые",
            "Сущность реального мира, которая является основной единицей ООП",
            "Класс, который действует как родительский для некоторого другого класса или классов",
            "Является ли полиморфизм принципом ООП? (Да/Нет)",
            "Является ли наследование принципом ООП? (Да/Нет)",
            "Является ли инкапсуляция принципом ООП? (Да/Нет");

    public List<String> getcQuestions() {
        return cQuestions;
    }

    public List<String> getJavaQuestions() {
        return javaQuestions;
    }

    public List<String> getOopQuestions() {
        return oopQuestions;
    }
    public List<String> getQuestionsByExamType(ExamTypeEnum examTypeEnum){
        List<String> questions;
        if(ExamTypeEnum.C.equals(examTypeEnum)){
            questions = getcQuestions();
        }else if(ExamTypeEnum.JAVA.equals(examTypeEnum)){
            questions = getJavaQuestions();
        }else{
            questions = getOopQuestions();
        }
        return questions;
    }
}
