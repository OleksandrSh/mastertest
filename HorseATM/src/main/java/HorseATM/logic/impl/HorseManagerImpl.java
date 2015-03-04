package HorseATM.logic.impl;

import HorseATM.entity.Horse;
import HorseATM.logic.HorseManager;

import java.util.List;

/**
 * Created by Oleksandr on 3/3/15.
 */
public class HorseManagerImpl implements HorseManager {
    @Override
    public void printAllHorse(List<Horse> horses) {
        String status=null;
        System.out.println("Horses:");
        for (Horse onehors:horses)
        {
            if (onehors.getStatus())
            {
            status="won";
            }
            else{
            status="lost";
            }
            System.out.println(onehors.getNumberHorse().toString() + "," + onehors.getNameHorse() + "," + onehors.getOdds() + "," + status);
        }
    }

    @Override
    public void setWonHorses(List<Horse> horses, Integer number) {
        for (Horse onehors:horses)
        {
            onehors.setStatus(false);
        }
        horses.get(number).setStatus(true);

    }
}
