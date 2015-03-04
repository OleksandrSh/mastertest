package HorseATM.data.impl;

import HorseATM.data.MoneyDAO;
import HorseATM.entity.AlltheMoney;
import HorseATM.entity.Money;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/**
 * Created by Oleksandr on 3/4/15.
 */
public class MoneyXML implements MoneyDAO {
    @Override
    public void addMoney(Money money) {

    }

    @Override
    public void deleteAllMoney() {

    }

    @Override
    public Money findmoney(String name) {
        return null;
    }

    @Override
    public List<Money> getAll() {
        XStream xstream = new XStream(new StaxDriver());
        xstream.alias("money", Money.class);
        xstream.alias("allmoney",AlltheMoney.class);
        FileInputStream fis=null;
        try {
            fis = new FileInputStream(new File("").getAbsolutePath() + File.separator+ "money.xml");
            AlltheMoney allmoney = (AlltheMoney)xstream.fromXML(fis);
            fis.close();
            return allmoney.getMoney();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }



    @Override
    public void setAll(List<Money> money) {

    }
}
