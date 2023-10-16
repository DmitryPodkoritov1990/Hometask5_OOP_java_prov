package Presenter;
import Model.AvtomatHotDrinks;
import Model.HotDrink;

import java.util.List;

public class AvtomatPresenter {
    private Model model;
    private AvtomatHotDrinks avtomatHotDrinks = new AvtomatHotDrinks();

    public void createHotDrink(String drinkName, int volume, int temperature){avtomatHotDrinks.addDrink(drinkName,volume, temperature);
    }
    public List<HotDrink> AllHotDrinks(){return avtomatHotDrinks.getList();}

    public HotDrink getDrink(String name){return avtomatHotDrinks.getProduct(name);}

}
