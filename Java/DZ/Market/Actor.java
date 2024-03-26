package Java.DZ.Market;

abstract class Actor implements ActorBehaviour {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }

    abstract String getName();


}
