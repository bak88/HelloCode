package Java.DZ.Market;

public interface QueueBehaviour {

    void takeInQueue(Actor actor); // стать в очередь

    void takeOrders(); // принимать заказы

    void giveOrders(); // отдать заказ

    void releaseFromQueue(); // выпустить из очереди

}
