package Java.DZ.Market;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue = new ArrayList<>();

    @Override // вошел в магазин
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " вошел в магазин");
        takeInQueue(actor);

    }

    @Override // вышел из магазмна
    public void releaseFromMarket(List<Actor> listActors) {
        for (Actor actor : listActors) {
            System.out.printf("%s вышел из магазмна\n", actor.getName());
            queue.remove(actor);
        }
    }

    @Override // обновлять
    public void update() {
        takeOrders();
        giveOrders();
    }

    @Override // занять очередь
    public void takeInQueue(Actor actor) {
        System.out.printf("%s занял очередь\n", actor.getName());
        queue.add(actor);
//        update();

    }

    @Override // принять заказ
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isTakeOrder()) {
                System.out.printf("%s сделал заказ\n", actor.getName());
                actor.setTakeOrder(true);

            }
        }


    }

    @Override // отдать заказ
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                System.out.printf("%s отдать заказ\n", actor.getName());
                actor.setMakeOrder(true);
            }
        }
        releaseFromQueue();
    }

    @Override // выпустить из очереди
    public void releaseFromQueue() {
        List<Actor> exit = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && actor.isTakeOrder()) {
                System.out.printf("%s вышел из очереди\n", actor.getName());
                exit.add(actor);
            }
        }
        releaseFromMarket(exit);
    }
}
