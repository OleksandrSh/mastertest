package HorseATM.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksandr on 3/4/15.
 */
public class AlltheMoney {
    private List<Money> money =new ArrayList<Money>();

    public List<Money> getMoney() {
        return money;
    }

    public void setMoney(List<Money> money) {
        this.money = money;
    }
}
