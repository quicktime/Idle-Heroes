package Heroes;

import java.util.ArrayList;

public class Heroes {

    private String name;
    private Faction faction;
    private Heroes requirement1;
    private Heroes requirement2;
    private Heroes requirement3;
    private Heroes upgrade;
    private int stars;
    private String image;

    Heroes(String name, Faction faction) {
        this.name = name;
        this.faction = faction;
    }

    Heroes(String name, Faction faction, Heroes requirement) {
        this.name = name;
        this.faction = faction;
        this.requirement1 = requirement;
    }

    Heroes(String name, Faction faction, String image) {
        this.name = name;
        this.faction = faction;
        this.image = image;
    }

    Heroes(String name, Faction faction, int stars, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.image = image;
    }

    Heroes(String name, Faction faction, int stars, Heroes upgrade, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.upgrade = upgrade;
        this.image = image;
    }

    Heroes(String name, Faction faction, int stars, Heroes requirement1, Heroes requirement2, Heroes requirement3, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.requirement1 = requirement1;
        this.requirement2 = requirement2;
        this.requirement3 = requirement3;
        this.image = image;
    }

    Heroes(String name, Faction faction, int stars, Heroes requirement1, Heroes requirement2, Heroes requirement3, Heroes upgrade, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.requirement1 = requirement1;
        this.requirement2 = requirement2;
        this.requirement3 = requirement3;
        this.upgrade = upgrade;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Faction getFaction() {
        return faction;
    }

    public Heroes getRequirement1() {
        return requirement1;
    }
    public Heroes getRequirement2() { return requirement2; }
    public Heroes getRequirement3() { return requirement3; }

    public Heroes getUpgrade() { return upgrade; }

    public int getStars() {
        return stars;
    }

    public String getImage() {
        return image;
    }

    public ArrayList getBuildRequirements(int stars) {
        return Requirements.buildRequirements(stars);
    }

}