package Java.OOP.Seminars.Seminars07.fabricMethod;

public class GemGen implements ItemGen{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
