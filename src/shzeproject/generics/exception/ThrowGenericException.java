package shzeproject.generics.exception;

public class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<Integer, Failure> runner = new ProcessRunner<>();

        for(int i = 0; i < 4; i++){
            runner.add(new CustomProcessor());
        }

        try {
            runner.processAll();
        }catch (Failure e){
            e.printStackTrace(System.out);
        }
    }
}
