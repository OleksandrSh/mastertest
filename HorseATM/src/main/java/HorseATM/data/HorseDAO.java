package HorseATM.data;

import HorseATM.entity.Horse;

import java.util.List;

/**
 * Created by Oleksandr on 3/3/15.
 */
public interface HorseDAO {

    public void addHorse(Horse horse);

    void deleteAllHorse();

    public Horse findHorse(String name);

    public List<Horse> getAll();

    public void setAll(List<Horse> horses);


}
