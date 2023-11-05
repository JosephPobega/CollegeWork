public class President {
    private int number;
    private String name;
    private String birth;
    private String death;
    private String netWorth;
    private String health;

    public President(int number, String name, String birth, String death, String netWorth, String health) {
        this.number = number;
        this.name = name;
        this.birth = birth;
        this.death = death;
        this.netWorth = netWorth;
        this.health = health;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getDeath() {
        return death;
    }

    public String getNetWorth() {
        return netWorth;
    }

    public String getHealth() {
        return health;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public void setNetWorth(String netWorth) {
        this.netWorth = netWorth;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return number + " - " + name + ", " + birth + " - " + death;
    }
}