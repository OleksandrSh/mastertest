package HorseATM.logic;

import HorseATM.entity.Horse;

import java.util.List;

/**
 * Created by Oleksandr on 3/3/15.
 */
public interface HorseManager {
    public void  printAllHorse(List<Horse> horses);
    public void  setWonHorses(List<Horse> horses,Integer number);
}
