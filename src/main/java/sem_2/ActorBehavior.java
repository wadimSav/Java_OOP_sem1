package sem_2;

public interface ActorBehavior {

    boolean isMakeOrder();

    boolean isTakeOrder();

    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean takeOrder);
}
