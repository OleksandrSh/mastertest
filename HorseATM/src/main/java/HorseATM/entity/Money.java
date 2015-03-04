package HorseATM.entity;

/**
 * Created by Oleksandr on 3/4/15.
 */
public class Money implements Comparable {
   private Integer nominal;
   private Integer count;

    public Money() {
    }

    public Money(Integer nominal, Integer count) {
        this.nominal = nominal;
        this.count = count;
    }

    public Integer getNominal() {
        return nominal;
    }

    public Integer getCount() {
        return count;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int compareTo(Object o)
    {
        Money tmp = (Money)o;
        if(this.getNominal() < tmp.getNominal())
        {
            return 1;
        }
        else if(this.getNominal()> tmp.getNominal())
        {
            return -1;
        }
        return 0;
    }

}
