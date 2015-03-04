package HorseATM;

import HorseATM.data.HorseDAO;
import HorseATM.data.MoneyDAO;
import HorseATM.entity.Horse;
import HorseATM.entity.Money;
import HorseATM.factory.Factory;
import HorseATM.logic.HorseManager;
import HorseATM.logic.MoneyManager;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        HorseDAO myhorses = Factory.FACTORY.getHorseDaoIml();
        HorseManager manager = Factory.FACTORY.getHorseManager();
        MoneyDAO moneyDAO = Factory.FACTORY.getMoneyDaoIml();
        MoneyManager moneyManager = Factory.FACTORY.getMoneyManager();
        List<Horse> mylovehorses = myhorses.getAll();
        List<Money> allListMoney = moneyDAO.getAll();
        Scanner sc = Factory.FACTORY.getScanner();
        String s = "start";
        moneyManager.printAllMoney(allListMoney, "Inventory:");
        manager.printAllHorse(mylovehorses);
        while (!s.equals("Q") && !s.equals("q")) {
            s = sc.nextLine();
            if (s.length() != 0) {
                Pattern pattern = Pattern.compile("^([w,W])\\s([1-9]+)$");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()) {
                    int i = Integer.parseInt(matcher.group(2));
                    if (i <= mylovehorses.size()) {
                        manager.setWonHorses(mylovehorses, i - 1);
                    } else {
                        System.out.println("Sorry i dont have horse :-)");
                    }
                }
                pattern = Pattern.compile("^([r,R])$");
                matcher = pattern.matcher(s);
                if (matcher.find()) {
                    moneyManager.setRestocksAll(allListMoney);
                }
                pattern = Pattern.compile("^([0-9]+)\\s([0-9]+)$");
                matcher = pattern.matcher(s);
                if (matcher.find()) {
                    int current = Integer.parseInt(matcher.group(1));
                    Integer amount = moneyManager.setamount(allListMoney);
                    if (current <= mylovehorses.size()) {
                        current = current - 1;
                        int bland = Integer.parseInt(matcher.group(2)) * mylovehorses.get(current).getOdds();
                        if (amount > bland) {
                            if (mylovehorses.get(current).getStatus()) {
                                System.out.println("Payout: " + mylovehorses.get(current).getNameHorse() + " " + bland);
                                moneyManager.giveCashe(allListMoney, bland);
                            } else {
                                System.out.println("No Payout: " + mylovehorses.get(current).getNameHorse());
                            }
                        } else {
                            System.out.println("Sorry i dont have enought money, try later :-) Your wont: " + bland + " I have only :" + amount);
                        }
                    } else {
                        System.out.println("Sorry i dont have horse :-)");
                    }
                }
                pattern = Pattern.compile("^([0-9]+)\\s([0-9]+\\.[0-9]+)$");
                matcher = pattern.matcher(s);
                if (matcher.find()) {
                    System.out.println("Invalid Bet: " + matcher.group(2));
                }

                moneyManager.printAllMoney(allListMoney, "Inventory:");
                manager.printAllHorse(mylovehorses);
            }
        }
        System.out.println("Bye!");
    }
}
