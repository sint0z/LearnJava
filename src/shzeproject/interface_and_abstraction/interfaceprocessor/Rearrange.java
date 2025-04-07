package shzeproject.interface_and_abstraction.interfaceprocessor;

public class Rearrange implements Processor{

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        String[] strings = ((String)input).split(" ");
        StringBuilder builder = new StringBuilder();

        for (int idx = 0; idx < strings.length; idx++) {
           char[] c = strings[idx].toCharArray();
           for(int i = 0; i < strings[idx].length(); i +=2){
                if(i + 1 < strings[idx].length()){
                    char temp = c[i + 1];
                    c[i + 1] = c[i];
                    c[i] = temp;
                }
           }
           
           if(builder.length() > 0){
                builder.append(" ");
           }

           builder.append(String.valueOf(c));
        }
        
        // return Arrays.stream(strings).collect(Collectors.joining(" "));
        return builder.toString();
    }

    
    public static void main(String[] args) {
        String text = "Этот текст предназначен для смены символов местами";
        System.out.println("Исходный текст: [ "+ text + " ]");
        Apply.process(new Rearrange(), text);
    }
}
