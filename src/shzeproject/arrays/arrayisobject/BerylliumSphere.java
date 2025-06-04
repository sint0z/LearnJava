package shzeproject.arrays.arrayisobject;

public class BerylliumSphere implements Comparable<BerylliumSphere>{
    private static long counter = 0;
    private final long id = counter++;

    public int getId(){
        return (int) id;
    }

    @Override
    public int compareTo(BerylliumSphere o) {
        return Long.compare(id, o.id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + id + "]";
    }
}
