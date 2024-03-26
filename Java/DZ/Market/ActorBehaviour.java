package Java.DZ.Market;

interface ActorBehaviour {

    void setMakeOrder(boolean isMakeOrder); // Сделать заказ

    void setTakeOrder(boolean isTakeOrder);  // принимать заказы

    boolean isMakeOrder();

    boolean isTakeOrder();
}
