package Heroes;

public class Fodder {

    private Faction faction;
    private int stars;
    private String image;

    Fodder(int stars, String image) {
        this.stars = stars;
        this.image = image;
    }

    Fodder(Faction faction, int stars, String image) {
        this.faction = faction;
        this.stars = stars;
        this.image = image;
    }

    public Faction getFaction() {
        return faction;
    }

    public int getStars() {
        return stars;
    }

    public String getImage() {
        return image;
    }
}
