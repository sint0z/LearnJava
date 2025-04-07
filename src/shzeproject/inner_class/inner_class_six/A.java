package shzeproject.inner_class.inner_class_six;

public class A {
    public U getU(){
        return new U(){

            @Override
            public void methodUOne(int i) {
                System.out.println("Method 'U' One (" + i + ")");
            }

            @Override
            public void methodUTwo(int i) {
                System.out.println("Method 'U' Two (" + i + ")");
            }

            @Override
            public void methodUThree(int i) {
                System.out.println("Method 'U' Three (" + i + ")");
            }
            
        };
    }
}
