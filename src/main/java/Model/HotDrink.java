package Model;

public class HotDrink extends Drink{

    private int temperature;

    public HotDrink(String drinkName, int volume, int temperature) {
        super(drinkName, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Выбранный напиток >> " + drinkName + "\n Объем заказанного напитка >> " + volume + "\n Температура напитка составляет >> " + temperature + "\n" + "\n");
    }
}
