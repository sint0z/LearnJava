package shzeproject.initialization_and_completion;

public class ConstructorString {

    public ConstructorString(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        ConstructorString[] csts = new ConstructorString[5];
        int i = 1;
        for(ConstructorString c: csts){
            c = new ConstructorString("Obj №" + i);
            i++;
        }
    }
}
