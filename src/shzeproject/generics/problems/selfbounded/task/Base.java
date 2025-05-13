package shzeproject.generics.problems.selfbounded.task;

public abstract class Base<T extends Base<T>> {

    abstract T perform(T argument);

    public T execute(T arg){
        return perform(arg);
    }

}
