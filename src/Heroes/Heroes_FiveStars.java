package Heroes;

public class Heroes_FiveStars {

    private static Faction fortress = new Faction("Fortress");
    private static Faction abyss = new Faction("Abyss");
    private static Faction forest = new Faction("Forest");
    private static Faction shadow = new Faction("Shadow");
    private static Faction light = new Faction("Light");
    private static Faction dark = new Faction("Dark");

    /**
     *  5* hero + 5* copy + 5* req + 3x 5* fodder
     */

    public static Heroes Sigmund_5 = new Heroes("Sigmund", fortress, 5, "heroes/Sigmund-5-icon.png");
    public static Heroes Mihm_5 = new Heroes("Mihm", dark, 5, "heroes/Mihm-5-icon.png");

    public static Heroes FortressHolder_3 = new Heroes("Holder3", fortress, "heroes/FortressHolder-3-icon.png");
    public static Heroes IronBambi = new Heroes("Iron Bambi", fortress, "heroes/Iron_Bambi-5-icon.png");
    public static Heroes Sigmund = new Heroes("Sigmund", fortress, 5, Sigmund_5, Heroes_FiveStars.IronBambi, Heroes_FiveStars.FortressHolder_3, Heroes_SixStars.Sigmund, "heroes/Sigmund-5-icon.png");

    public static Heroes DarkHolder_3 = new Heroes("Holder3", fortress, "heroes/FortressHolder-3-icon.png");
    public static Heroes DarkSpirit = new Heroes("Dark Spirit", dark, 5, "heroes/Dark_Spirit-5-icon.png");
    public static Heroes Mihm = new Heroes("Mihm", dark, 5, Mihm_5, Heroes_FiveStars.DarkSpirit, Heroes_FiveStars.DarkHolder_3, Heroes_SixStars.Mihm, "heroes/Mihm-5-icon.png");
}
