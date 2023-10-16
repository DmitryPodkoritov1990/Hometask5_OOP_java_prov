import Model.HotDrink;
import Model.AvtomatHotDrinks;
import  Model.Drink;
import Presenter.AvtomatPresenter;
import View.MainView;

public class Console {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.drink("Latte", 200, 85);
        mainView.drink("Cappucino", 250, 88);
        mainView.drink("Cacao", 150, 85);

        mainView.AllHotDrink();
        "////".repeat(15);
        mainView.inssuance("Cappucino");
    }
}
