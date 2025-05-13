package shzeproject.generics.mixin;

public class Base implements IBase{

    private String value;

    @Override
    public void set(String val) {
        value = val;
    }

    @Override
    public String get() {
        if(value == null){
            return "Null";
        }

        return value;
    }


}
