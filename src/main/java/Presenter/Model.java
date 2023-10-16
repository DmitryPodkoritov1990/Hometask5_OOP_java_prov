package Presenter;
import Model.HotDrink;

import java.util.List;


public interface Model {

  HotDrink getProduct(String name);
  void addDrink(String drinkName, int volume, int temperature);

  List<HotDrink> getList();
}
