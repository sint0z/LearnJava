package shzeproject.initialization_and_completion;

public class OverloadingVarargs {

    static void getOverloading(String... strings){
        for(String string:strings){
            System.out.print(string + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        getOverloading(new String[]{"1","2","3"});

        String[] strings = new String[]{"2","2","3"};
        getOverloading(strings);
        getOverloading("2","30","0");
    
        System.err.println(args);
    }

}
