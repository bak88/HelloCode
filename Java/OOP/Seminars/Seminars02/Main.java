package Java.OOP.Seminars.Seminars02;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human = new Human("Maga");
        Human human1 = new Human("Magamed");
        market.accpeptToMarket(human);
        market.accpeptToMarket(human1);
        market.update();

    }
}
