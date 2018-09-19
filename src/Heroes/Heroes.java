package Heroes;

import java.util.ArrayList;

public class Heroes {

    private String name;
    private Faction faction;
    private Heroes requirement1;
    private Heroes requirement2;
    private Heroes requirement3;
    private Fodder fodder1;
    private Fodder fodder2;
    private Heroes upgrade;
    private int stars;
    private String image;

    // 13 Star
    Heroes(String name, Faction faction, int stars, Fodder fodder1, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.fodder1 = fodder1;
        this.image = image;
    }

    // 12 Star & 11 Star
    Heroes(String name, Faction faction, int stars, Heroes requirement1, Fodder fodder1, Heroes upgrade, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.requirement1 = requirement1;
        this.fodder1 = fodder1;
        this.upgrade = upgrade;
        this.image = image;
    }

    // 10 Star & Upgradeable Nine Star
    Heroes(String name, Faction faction, int stars, Heroes requirement1, Fodder fodder1, Fodder fodder2, Heroes upgrade, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.requirement1 = requirement1;
        this.fodder1 = fodder1;
        this.fodder2 = fodder2;
        this.upgrade = upgrade;
        this.image = image;
    }

    // Non Upgradeable Nine Star
    Heroes(String name, Faction faction, int stars, Heroes requirement1, Fodder fodder1, Fodder fodder2, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.requirement1 = requirement1;
        this.fodder1 = fodder1;
        this.fodder2 = fodder2;
        this.image = image;
    }

    // Eight Star
    Heroes(String name, Faction faction, int stars, Fodder fodder1, Fodder fodder2, Heroes upgrade, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.fodder1 = fodder1;
        this.fodder2 = fodder2;
        this.upgrade = upgrade;
        this.image = image;
    }

    // Seven Star
    Heroes(String name, Faction faction, int stars, Fodder fodder1, Heroes upgrade, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.fodder1 = fodder1;
        this.upgrade = upgrade;
        this.image = image;
    }

    // Six Star & Upgradeable Five Star
    Heroes(String name, Faction faction, int stars, Heroes requirement1, Heroes requirement2, Fodder fodder1, Heroes upgrade, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.requirement1 = requirement1;
        this.requirement2 = requirement2;
        this.fodder1 = fodder1;
        this.upgrade = upgrade;
        this.image = image;
    }

    // Non Upgradeable Five Star
    Heroes(String name, Faction faction, int stars, Heroes requirement1, Heroes requirement2, Fodder fodder1, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.requirement1 = requirement1;
        this.requirement2 = requirement2;
        this.fodder1 = fodder1;
        this.image = image;
    }

    // Noncrafted 5 Star
    Heroes(String name, Faction faction, int stars, Heroes upgrade, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
        this.upgrade = upgrade;
        this.image = image;
    }

    // 4 Star & 3 Star
    Heroes(String name, Faction faction, int stars, String image) {
        this.name = name;
        this.faction = faction;
        this.stars = stars;
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

    public Fodder getFodder1() { return fodder1; }
    public Fodder getFodder2() { return fodder2; }

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