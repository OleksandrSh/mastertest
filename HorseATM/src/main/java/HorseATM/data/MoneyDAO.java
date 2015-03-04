package HorseATM.data;

import HorseATM.entity.Money;

import java.util.List;

/**
 * Created by Oleksandr on 3/4/15.
 */
public interface MoneyDAO {

    public void addMoney(Money money);

    void deleteAllMoney();

    public Money findmoney(String name);

    public List<Money> getAll();

    public void setAll(List<Money> money);

}
