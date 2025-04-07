package shzeproject.collection.no_use_generic;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGeneric {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //ArrayList<Apple> list = new ArrayList();
        for(int i = 0; i < 3; i++){
            list.add(new Apple());
        }

        list.add(new Orange()); //Если использовать generic в ArrayList, занести в список объект данного класса нельзя

        for(int i = 0; i < list.size(); i++){
           ((Apple)list.get(i)).getId();
            /*
             * Данный код выдаст ошибку, т.к обьект Orange,
             * не является Apple. Компилятор выдает ошибку т.к не может
             * преобразовать Orange в Apple.
             * Дополнительная компилятор утверждает, что необходимо использовать обобщенные типы,
             * т.е generic (дженерики) ArrayList<Apple> list = new ArrayList();
            */
        }

    }
}
