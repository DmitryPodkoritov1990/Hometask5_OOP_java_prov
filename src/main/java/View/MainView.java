package View;
import Model.HotDrink;
import Presenter.AvtomatPresenter;
import Presenter.view;

public class MainView implements view{
AvtomatPresenter avtomatPresenter = new AvtomatPresenter();

    @Override
    public void drink(String name, int volume, int temperature) {
        avtomatPresenter.createHotDrink(name, volume, temperature);
    }

    @Override
    public void AllHotDrink() {
        System.out.println(avtomatPresenter.AllHotDrinks());
    }

    @Override
    public void inssuance(String name) {
        System.out.println(avtomatPresenter.getDrink(name));
    }
}
