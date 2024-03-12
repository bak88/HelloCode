package Java.DZ.Market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human = new Human("Жора");
        Human human1 = new Human("Maxim");
        market.acceptToMarket(human);
        market.acceptToMarket(human1);
        market.update();


    }
}
