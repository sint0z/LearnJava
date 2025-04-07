package shzeproject.initialization_and_completion;

public enum Money {
    ONE (1),
    FIVE (5),
    TEN (10),
    HUNDRED (100),
    THOUSAND (1000),
    MILLION (1000000);

    private final int value;

    private Money(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    
}
