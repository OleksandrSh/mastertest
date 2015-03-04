package HorseATM.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksandr on 3/3/15.
 */
public class AlltheHorses {
    private List<Horse> horses = new ArrayList<Horse>();

    public AlltheHorses() {
    }

    public AlltheHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public void setOneHorses(Horse horse) {
        this.horses.add(horse);
    }
}
