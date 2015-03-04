package HorseATM.logic;

import HorseATM.entity.Money;

import java.util.List;

/**
 * Created by Oleksandr on 3/4/15.
 */
public interface MoneyManager {

    public void setRestocksAll(List<Money> money) ;
    public void  printAllMoney(List<Money> money,String action);
    public void giveCashe(List<Money> money,Integer sumgiv);
    public Integer setamount(List<Money> money);

}
