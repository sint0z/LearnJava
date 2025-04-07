package shzeproject.initialization_and_completion;

public class Finalize {
    private final String name;

    public Finalize(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println(name);
    }

    @Override
    @SuppressWarnings("FinalizeDoesntCallSuperFinalize")
    protected void finalize() throws Throwable {
        System.out.println("Я сработал");
    }
    
    public static void main(String[] args) {
        Finalize obj = new Finalize("Test");
        obj.displayName();

        obj = null;

        System.gc();
    }
}
 