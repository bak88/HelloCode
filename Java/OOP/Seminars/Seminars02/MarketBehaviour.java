package Java.OOP.Seminars.Seminars02;

import java.util.List;

public interface MarketBehaviour {

    void accpeptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actorList);

    void update();
}
