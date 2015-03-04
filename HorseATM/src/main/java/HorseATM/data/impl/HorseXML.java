package HorseATM.data.impl;

import HorseATM.data.HorseDAO;
import HorseATM.entity.AlltheHorses;
import HorseATM.entity.Horse;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/**
 * Created by Oleksandr on 3/3/15.
 */
public class HorseXML  implements HorseDAO {

    @Override
    public void addHorse(Horse horse) {

    }


    @Override
    public void deleteAllHorse() {

    }

    @Override
    public Horse findHorse(String name) {
        return null;
    }

    @Override
    public List<Horse> getAll() {
        XStream xstream = new XStream(new StaxDriver());
        xstream.alias("horse", Horse.class);
        xstream.alias("allhorses",AlltheHorses.class);
        FileInputStream fis=null;
        try {
            fis = new FileInputStream(new File("").getAbsolutePath() + File.separator+ "horses.xml");
            AlltheHorses allhorese = (AlltheHorses)xstream.fromXML(fis);
            fis.close();
            return allhorese.getHorses();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void setAll(List<Horse> horsesі) {

    }
}
