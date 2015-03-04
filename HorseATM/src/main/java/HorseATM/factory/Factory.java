package HorseATM.factory;

import HorseATM.data.HorseDAO;
import HorseATM.data.MoneyDAO;
import HorseATM.data.impl.HorseXML;
import HorseATM.data.impl.MoneyXML;
import HorseATM.logic.HorseManager;
import HorseATM.logic.MoneyManager;
import HorseATM.logic.impl.HorseManagerImpl;
import HorseATM.logic.impl.MoneyManagerImpl;

import java.util.Scanner;

/**
 * Created by Oleksandr on 3/3/15.
 */
public class Factory {
    public static final Factory FACTORY = new Factory();


    public MoneyDAO getMoneyDaoIml() {
        return new MoneyXML();
    }
    public MoneyManager getMoneyManager()
    {
        return new MoneyManagerImpl();
    }
    public HorseDAO getHorseDaoIml() {
        return new HorseXML();
    }

    public HorseManager getHorseManager() {
        return new HorseManagerImpl();
    }

    public Scanner getScanner() {
        return new Scanner(System.in);
    }

}
