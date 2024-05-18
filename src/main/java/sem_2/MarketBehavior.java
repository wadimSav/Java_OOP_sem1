package sem_2;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
