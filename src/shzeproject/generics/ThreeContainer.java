package shzeproject.generics;

public class ThreeContainer<T> {
    private T firstObj;
    private T secondObj;
    private T thirdObj;


    public ThreeContainer(T first, T second, T third){
        this.firstObj = first;
        this.secondObj = second;
        this.thirdObj = third;
    }

    
    public void setFirst(T first){
        this.firstObj = first;
    }


    public void setSecond(T second){
        this.secondObj = second;
    }


    public void setThird(T third){
        this.thirdObj = third;
    }


    public void setAll(T first, T second, T third){
        setFirst(first);
        setSecond(second);
        setThird(third);
    }

    public void setAll(T obj){
        if (firstObj == null){
            setFirst(obj);
        }else if(secondObj == null){
            setSecond(obj);
        }else if(thirdObj == null){
            setThird(obj);
        }else{
            throw new IndexOutOfBoundsException(3);
        }
    }


    public T[] getObject(){
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[3];
        temp[0] = firstObj;
        temp[1] = secondObj;
        temp[2] = firstObj;

        return temp;
    }
}
