package shzeproject.interface_and_abstraction.factories.cast_emulation;

public class CoinFactory implements ThrowFactory {

    @Override
    public Throw getThrow() {
      return new Coin();
    }

}
