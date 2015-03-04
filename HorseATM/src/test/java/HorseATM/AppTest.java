package HorseATM;

import HorseATM.data.HorseDAO;
import HorseATM.data.MoneyDAO;
import HorseATM.entity.Horse;
import HorseATM.entity.Money;
import HorseATM.factory.Factory;
import HorseATM.logic.HorseManager;
import HorseATM.logic.MoneyManager;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
   {
       private static HorseDAO myhorses;
       private static HorseManager manager;
       private static  MoneyDAO moneyDAO;
       private static MoneyManager moneyManager;
       private static List<Horse> mylovehorses=new ArrayList<Horse>();
       private static  List<Money> allListMoney= new ArrayList<Money>();
       @BeforeClass
       public  static void setUp(){
          myhorses = Factory.FACTORY.getHorseDaoIml();
           manager = Factory.FACTORY.getHorseManager();
           moneyDAO = Factory.FACTORY.getMoneyDaoIml();
           moneyManager = Factory.FACTORY.getMoneyManager();
           mylovehorses = myhorses.getAll();
          allListMoney = moneyDAO.getAll();
       }

       @Test
       public void setamountTest()
       {
           long test=moneyManager.setamount(allListMoney);
           assertEquals("Set amount",1360,test);
           moneyManager.giveCashe(allListMoney,200);
           test=moneyManager.setamount(allListMoney);
           assertEquals("Set amount",1160,test);
           moneyManager.giveCashe(allListMoney,30);
           test=moneyManager.setamount(allListMoney);
           assertEquals("Set amount",1130,test);
           moneyManager.giveCashe(allListMoney,275);
           test=moneyManager.setamount(allListMoney);
           assertEquals("Set amount",855,test);
           moneyManager.giveCashe(allListMoney,16);
           test=moneyManager.setamount(allListMoney);
           assertEquals("Set amount",839,test);
       }
}
