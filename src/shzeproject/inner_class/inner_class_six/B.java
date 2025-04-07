package shzeproject.inner_class.inner_class_six;

public class B {
    private final U[] arrayU;
    private int count = 0;

    public B(final int size) {
        arrayU = new U[size];
    }

    public void appendU(U u){
        arrayU[count++] = u;
    }
    
    public void resetU(int index){
        if(index >= 0 && index <= arrayU.length){
            arrayU[index] = null;
        }
    }

    public void foreachU(){
        for(int i = 0; i < arrayU.length; i++){
            if(arrayU[i] == null){
                System.out.println("NULL");
                continue;
            }

            arrayU[i].methodUOne(i + 1);
            arrayU[i].methodUTwo(i + 1);
            arrayU[i].methodUThree(i + 1);
        }
    }

    public static void main(String[] args) {
        A[] groupA = {
            new A(),
            new A(),
            new A()};

        B objectB = new B(groupA.length);
        for(A a : groupA){
            objectB.appendU(a.getU());
        }

        System.out.println("До удаления:");
        objectB.foreachU();
        objectB.resetU(1);

        System.out.println("\nПосле удаления:");
        objectB.foreachU();
    }
}
