package shzeproject.operators;

public class LastQuestionOnLesson {
    @SuppressWarnings("StringEquality")
    static void logicalComparisonString(String arg1, String arg2){
        System.out.println("Операция: " + arg1 + " == " + arg2 + " Результат: " + (arg1 == arg2));

        System.out.println("Операция: " + arg1 + " != " + arg2 + " Результат: " + (arg1 != arg2));

        boolean str = arg1 == arg2 ? arg1.equals(arg2): arg2.equals(arg1);
        System.out.println("Проверка через equals: " + str + "\n");
    }


    public static void main(String[] args) {
        logicalComparisonString("Stick", "Stik");
        logicalComparisonString("Stick", "Stak");
    }
}
