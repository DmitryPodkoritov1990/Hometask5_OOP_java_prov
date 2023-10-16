package Model;

import Presenter.Model;

import java.util.ArrayList;
import java.util.List;

public class AvtomatHotDrinks implements Model {
private List<HotDrink> list = new ArrayList<>();
public List<HotDrink> getList(){return list;}

    public AvtomatHotDrinks(){

    }

    @Override
    public HotDrink getProduct(String name) {
    for(HotDrink drinks : list){
        if(drinks.getDrinkName().equals(name)){
            return drinks;
        }
    }
    return null;
    }

    @Override
    public void addDrink(String drinkName, int volume, int temperature) {
    list.add(new HotDrink(drinkName, volume, temperature));

    }
}
