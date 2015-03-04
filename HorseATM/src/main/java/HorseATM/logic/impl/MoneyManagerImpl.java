package HorseATM.logic.impl;

import HorseATM.entity.Money;
import HorseATM.logic.MoneyManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksandr on 3/4/15.
 */
public class MoneyManagerImpl implements MoneyManager {

    @Override
    public void setRestocksAll(List<Money> money) {
        for (Money setmoney : money) {
            setmoney.setCount(10);
        }
    }

    @Override
    public void giveCashe(List<Money> money, Integer sumgiv) {
        Integer rezult = 0;
        Integer sum = sumgiv;
        List<Money> outcash = new ArrayList<Money>();

        for (int i = 0; i <= money.size() - 1; i++) {
            outcash.add(new Money(money.get(i).getNominal(), 0));

            if (sum > 0) {
                int max = money.get(i).getCount();
                for (int j = 0; j <= max; j++) {
                    rezult = sum - money.get(i).getNominal();
                    if (rezult >= 0 && money.get(i).getCount() > 0) {
                        sum = sum - money.get(i).getNominal();
                        money.get(i).setCount(money.get(i).getCount() - 1);
                        outcash.get(i).setCount(outcash.get(i).getCount() + 1);
                    }
                }

            }
        }
        printAllMoney(outcash, "Dispensing: ");
    }

    @Override
    public Integer setamount(List<Money> money) {
        Integer sum = 0;
        for (Money setmoney : money) {
            sum = sum + setmoney.getCount() * setmoney.getNominal();
        }
        return sum;
    }

    @Override
    public void printAllMoney(List<Money> money, String action) {
        System.out.println(action);
        for (int i = money.size() - 1; i >= 0; i--) {
            System.out.println("$" + money.get(i).getNominal() + "," + money.get(i).getCount());
        }
    }
}
