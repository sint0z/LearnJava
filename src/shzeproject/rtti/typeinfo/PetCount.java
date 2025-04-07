package shzeproject.rtti.typeinfo;

import java.util.LinkedHashMap;
import java.util.Map;
import shzeproject.rtti.typeinfo.pets.Pet;

public class PetCount {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>{

        public PetCounter() {
            generateClassList();
        }
        
        private void generateClassList(){
            for(Class<? extends Pet> clazz : Pet.getClassPetsList()){
                put(clazz, 0);
            }
        }
        
        public void count(Pet type){
            for(Map.Entry<Class<? extends Pet>, Integer> entry : entrySet()){
                if (entry.getKey().isInstance(type)) {
                    put(entry.getKey(), entry.getValue() + 1);
                }
            }
            
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("[");
            for(Map.Entry<Class<? extends Pet>, Integer> entry : entrySet()){
                builder.append("-> " + entry.getKey().getSimpleName());
                builder.append(" = ");
                builder.append(entry.getValue());
                builder.append(",\n");
            }

            builder.delete(builder.length() - 2, builder.length());
            builder.append("]");
            return builder.toString();
        }

        public static void main(String[] args) {
            PetCounter counter = new PetCounter();
            for(Pet pet : Pets.createPetArray(20)){
                counter.count(pet);
            }
            
            System.out.println(counter);
        }
    }
}
