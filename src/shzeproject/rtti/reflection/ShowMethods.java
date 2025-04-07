package shzeproject.rtti.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    private static final String USAGE = """
            usage:
            ShowMethod qualified.class.name
            To show all method in class or:  
            ShowMethod qualified.class.name word
            To search for method involving 'word'
            """;
    private static Pattern pattern = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(USAGE);
            System.exit(0);
        }
        System.out.println(args[0]);
        int lines = 0;
        try {
            Class<?> clazz = Class.forName(args[0]);
            Method[] methods = clazz.getMethods();
            Constructor<?>[] constructors = clazz.getConstructors();

            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(pattern.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor<?> ctor : constructors) {
                    System.out.println(pattern.matcher(ctor.toString()).replaceAll(""));
                }
                lines = methods.length + constructors.length;
            } else {
                for (Method method : methods) {
                    if (method.toString().contains(args[1])) {
                        System.out.println(pattern.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                }
                for (Constructor<?> ctor : constructors) {
                    if (ctor.toString().contains(args[1])) {
                        System.out.println(pattern.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
}
