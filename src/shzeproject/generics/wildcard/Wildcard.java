package shzeproject.generics.wildcard;

import shzeproject.generics.Holder;

public class Wildcard {

    @SuppressWarnings("unchecked")
    static void rawArgs(Holder holder, Object arg){
        holder.set(arg); // Unchecked call to 'set(T)' as a member of raw type

        holder.set(new Wildcard()); // Неконтролируемый вызов set(T) как члена неспециализированного типа

        Object obj = holder.get(); // Допустимо, но теряется информация о типе
    }

    static void unboundedArgs(Holder<?> holder, Object arg){
        // holder.set(arg); ошибка (capture of ?) не может примениться к Object, ожидает ?

        // holder.set(new Wildcard()); точно такая же ошибка

        Object obj = holder.get(); // Допустимо, но теряется информация о типе
    }

    static <T> T extractOne(Holder<T> holder){
        return holder.get();
    }

    static <T> T extractTwo(Holder<T> holder, T arg){
        holder.set(arg);
        return holder.get();
    }

    static <T> T wildSubType(Holder<? extends T> holder, T arg){
        // holder.set(arg) ошибка, т.к компилятор не знает точного типа
        // мы знаем, что это может быть некоторый конкретный тип неизвестный для holder
        // но нам известно, что он производный (субтип) от <T>

        return holder.get();
    }

    static <T> void wildSuperclass(Holder<? super T> holder, T arg){
        // T t = holder.get(); - ошибка не может преобразовать Object к <T>

        holder.set(arg);

        Object object = holder.get();
    }

    public static void main(String[] args) {
        Holder raw = new Holder();
        Holder<Long> qualified = new Holder<>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Long l = 1L;

        rawArgs(raw, l);
        rawArgs(qualified, l);
        rawArgs(bounded, l);
        rawArgs(unbounded, l);

        unboundedArgs(raw, l);
        unboundedArgs(qualified, l);
        unboundedArgs(bounded, l);
        unboundedArgs(unbounded, l);

        Object r1 = extractOne(raw);
        Long r2 = extractOne(qualified);
        //Long r3 = extractOne(unbounded); -> неизвестный тип
        Object r3 = extractOne(unbounded);
        Long r4 = extractOne(bounded);


        Long r5 = extractTwo(raw, l);
        Long r6 = extractTwo(qualified, l );
        // Long r7 = extractTwo(unbounded, l); - ошибка
        // Long r8 = extractTwo(bounded); - ошибка

        Long r9 = wildSubType(raw, l);
        Long r10 = wildSubType(qualified, l);
        Long r11 = wildSubType(bounded, l);
        Object r12 = wildSubType(unbounded, l);
    }

}
