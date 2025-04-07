package shzeproject.rtti.typeinfo;

import java.util.LinkedHashMap;
import java.util.Map;
import shzeproject.rtti.typeinfo.pets.Pet;


public class TypeCounter extends LinkedHashMap<Class<?>, Integer> {
    private final Class<?> baseType; 

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }
    
    public void count(Object obj){
        Class<?> type = obj.getClass();
        if(!baseType.isAssignableFrom(type)){
            throw new RuntimeException(obj + "неправельный тип: "
                + type + ", должен быть подтипом"
                + baseType);
        }
        countClass(type);
    }
        
    private void countClass(Class<?> type) {
        put(type, getOrDefault(type, 0) + 1);

        Class<?> superClass = type.getSuperclass();
        if(superClass != null && baseType.isAssignableFrom(type)){
            countClass(superClass);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for(Map.Entry<Class<?>, Integer> entry : entrySet()){
            builder.append("-> ");
            builder.append(entry.getKey().getSimpleName());
            builder.append(" = ");
            builder.append(entry.getValue());
            builder.append(",\n");
        }

        builder.delete(builder.length() - 2, builder.length());
        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for(Pet pet : Pets.createPetArray(20)){
            counter.count(pet);
        }

        System.out.println(counter);
    }
}
