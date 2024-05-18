package sem_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavior, MarketBehavior {

    private List<Actor> actors = new ArrayList<>();

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " попал в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        List<Actor> queue = new ArrayList<>(actors);
        for (Actor actor : queue) {
            if(actor.isTakeOrder()) {
                System.out.println(actor.getName() + " вышел из магазина");
                actors.remove(actor);
            }
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        actors.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : actors) {
            if(!actor.isMakeOrder()) {
                actor.isMakeOrder = true;
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : actors) {
            if(actor.isMakeOrder()) {
                actor.isTakeOrder = true;
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        releaseFromMarket(actors);
    }
}
