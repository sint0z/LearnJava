package shzeproject.rtti.toy;

public class ToyTest {
    private static void printInformation(Class<?> cc){
        System.out.println("Имя класса: \"" + cc.getName() +
            "\"являеться интерфейсом: [" + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноническое имя: " + cc.getCanonicalName());
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Class<?> cl = null;
        try {
            cl = Class.forName("shzeproject.rtti.toy.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден!");
            System.exit(1);
        }
        printInformation(cl);

        for(Class<?> face : cl.getInterfaces()){
            printInformation(face);
        }

    }
}
