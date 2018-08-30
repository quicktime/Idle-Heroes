package Heroes;

import Helper.Sheet;

public class Faction {

    private static String faction;

    public Faction(String faction) {
        this.faction = faction;
    }

    public static int getFourStarFodderQuant() {
        return Sheet.getStarCount(faction, 4);
    }

    public static int getFiveStarFodderQuant() {
        return Sheet.getStarCount(faction, 5);
    }

    public static int getSixStarFodderQuant() {
        return Sheet.getStarCount(faction, 6);
    }

}
