package shzeproject.generics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class ClassCreator<T> {
   final Class<T> markClass;

   public ClassCreator(Class<T> clazz){
        markClass = clazz;
        
   }

   private boolean isPrimitiveWrapper(Class<?> primitiveType, Class<?> wrapperType) {
      return (primitiveType == int.class && wrapperType == Integer.class) ||
             (primitiveType == long.class && wrapperType == Long.class) ||
             (primitiveType == double.class && wrapperType == Double.class) ||
             (primitiveType == boolean.class && wrapperType == Boolean.class) ||
             (primitiveType == char.class && wrapperType == Character.class) ||
             (primitiveType == byte.class && wrapperType == Byte.class) ||
             (primitiveType == short.class && wrapperType == Short.class) ||
             (primitiveType == float.class && wrapperType == Float.class);
  }

   public T create(Object... arguments) throws SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
      
      Constructor<T> targetConstructor = null;

      for(Constructor<?> constructor : markClass.getConstructors()){
        Class<?>[] classTypes = constructor.getParameterTypes();

        if(classTypes.length == arguments.length){
            boolean match = true;
            for(int i = 0; i < classTypes.length; i++){
               Class<?> constructorType = classTypes[i];
               Class<?> argumentType = arguments[i].getClass();

               if(constructorType.isPrimitive()){
                  if(!isPrimitiveWrapper(constructorType, argumentType)){
                     match = false;
                     break;
                  }
               }else if(!constructorType.isAssignableFrom(argumentType)){
                  match = false;
                  break;
               }
            }

            if(match){
               targetConstructor = (Constructor<T>) constructor;
            }
        }
      }

      if(targetConstructor == null){
         List<String> errArgument = Arrays.asList(arguments)
                                          .stream()
                                          .map(el -> el.getClass().getSimpleName())
                                          .toList();
         throw new RuntimeException("Type is not exist: " + errArgument );
      }

      return targetConstructor.newInstance(arguments); 
   }

   public static void main(String[] args) throws SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
      ClassCreator<Test> creatorClass = new ClassCreator<>(Test.class);
      Test test = creatorClass.create("Name", 1);
   }
}
