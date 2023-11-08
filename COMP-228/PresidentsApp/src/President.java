public class President {
    private String name;
    private String birthDate;
    private String deathDate;
    private String politicalParty;
    private double netWorth;

    public President(String name, String birthDate, String deathDate, String politicalParty, double netWorth) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.politicalParty = politicalParty;
        this.netWorth = netWorth;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public double getNetWorth() {
        return netWorth;
    }
}
