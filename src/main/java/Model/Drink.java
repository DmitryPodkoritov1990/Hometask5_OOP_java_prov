package Model;

public abstract class Drink {
    protected String drinkName;
    protected int volume;

    public Drink(String drinkName, int volume) {
        this.drinkName = drinkName;
        this.volume = volume;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
