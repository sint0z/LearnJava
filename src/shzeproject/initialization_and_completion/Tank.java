package shzeproject.initialization_and_completion;

public class Tank {
    private int amountLiquid = 0;
    private final int volume;

    public Tank(int volume) {
        this.volume = volume;
    }

    

    public void fillInLiquid(int amountLiquid){
        if(amountLiquid < volume && this.amountLiquid + amountLiquid < volume){
            this.amountLiquid += amountLiquid;
        }
    }

    public int getAmountLiquid(){
        return amountLiquid;
    }

    public void emptyLiquid(){
        amountLiquid = 0;
    }

    @Override
    protected void finalize() throws Throwable {

        if(amountLiquid > 0){
            System.out.println("Я не могу убрать данный объект, так как в нем есть " + amountLiquid + " жидкости");
        }
    }

    public static void main(String[] args) {
        /*Действия над емкостью 1, в результате емкость освобождаеться */
        Tank tank = new Tank(1000);
        tank.fillInLiquid(300);
        System.out.println(tank.getAmountLiquid());
        tank.emptyLiquid();
        System.out.println(tank.getAmountLiquid() + "\n");
        tank = null;
        
        /*Действия над емкостью 2, в результате мы не опусташаем ее
         * в следствии чего вызываетсья метож finalize()
         */
        Tank superTank = new Tank(1000);
        superTank.fillInLiquid(100);
        System.out.println(superTank.getAmountLiquid());
        superTank.fillInLiquid(100);
        System.out.println(superTank.getAmountLiquid());


        superTank = null;
        

        System.gc();
    }
}
