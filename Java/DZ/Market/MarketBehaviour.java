package Java.DZ.Market;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor); // помещает в очередь

    void releaseFromMarket(List<Actor> listActors); // удаляет из очереди

    void update(); // обновляет
}
