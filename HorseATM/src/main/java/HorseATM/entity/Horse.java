package HorseATM.entity;

/**
 * Created by Oleksandr on 3/3/15.
 */
public class Horse {
    private Integer numberHorse;
    private String nameHorse;
    private Integer  odds;
    private Boolean status;

    public Horse(Integer numberHorse, String nameHorse, Integer odds, Boolean status) {
        this.numberHorse = numberHorse;
        this.nameHorse = nameHorse;
        this.odds = odds;
        this.status = status;
    }

    public Horse() {
    }

    public Integer getNumberHorse() {
        return numberHorse;
    }

    public String getNameHorse() {
        return nameHorse;
    }

    public Integer getOdds() {
        return odds;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setNumberHorse(Integer numberHorse) {
        this.numberHorse = numberHorse;
    }

    public void setNameHorse(String nameHorse) {
        this.nameHorse = nameHorse;
    }

    public void setOdds(Integer odds) {
        this.odds = odds;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
