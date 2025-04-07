package shzeproject.interface_and_abstraction.factories.cast_emulation;

public class ThrowFactories {
    public static void emulate(ThrowFactory factory){
        Throw thr = factory.getThrow();
        System.out.println(thr.getClass().getSimpleName() + ": Result -> " + thr.getResult());
    }

    public static void main(String[] args) {
        emulate(new CoinFactory());
        emulate(new DiceFactory());
    }
}
