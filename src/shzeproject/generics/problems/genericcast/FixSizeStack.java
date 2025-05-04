package shzeproject.generics.problems.genericcast;

public class FixSizeStack<T> {

    private int index = 0;
    private final Object[] objects;

    public FixSizeStack(int size) {
        this.objects = new Object[size];
    }

    public void push(T item){
        if(size() > objects.length){ // Нужна проверка границ
            throw new ArrayStoreException(index + " > " + objects.length);
        }
        objects[index++] = item;
    }

    public int size(){
        return index;
    }

    // Необходимая аннотация для подавления предупреждения
    // т.к происходит неконтролируемое приведение типов
    // ведь <T> стирается -> до ближайшего ограничения
    @SuppressWarnings("unchecked")
    public T pop(){
        if(index == 0){
            return null;
        }

        // не генерирует предупреждение, но генерирует ошибки при выходе за границу
        return (T) objects[--index];
        /* Ошибка возникает, т.к index может быть -1, ведь он зависит от того сколько элементов
         * было добавлено в Stack, следовательно, проверка границ обезопасит работу метода
         */
    }
}
