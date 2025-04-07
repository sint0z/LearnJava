package shzeproject.interface_and_abstraction.interfaceprocessor;

public class Apply {
    public static void process(Processor processor, Object s){
        System.out.println("Используеться процессор " + processor.name());
        System.out.println(processor.process(s));
    }
}
