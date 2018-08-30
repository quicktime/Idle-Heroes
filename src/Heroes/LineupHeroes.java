package Heroes;

public class LineupHeroes {

    private static Faction fortress = new Faction("Fortress");
    private static Faction abyss = new Faction("Abyss");
    private static Faction shadow = new Faction("Shadow");
    private static Faction dark = new Faction("Dark");
    private static Faction light = new Faction("Light");
    private static Faction forest = new Faction("Forest");

    public static Heroes kroos = new Heroes("Kroos", abyss, 8, "https://playidleheroes.com/icons/heroes/kroos-10.png");
    public static Heroes mihm = Heroes_FiveStars.Mihm;
    public static Heroes belrain = new Heroes("Belrain", light, 6, "https://playidleheroes.com/icons/heroes/belrain-10.png");
    public static Heroes sigmund = Heroes_FiveStars.Sigmund;
    public static Heroes jahra = new Heroes("Jahra", shadow, 9, "https://playidleheroes.com/icons/heroes/jahra-10.png");
    public static Heroes valkyrie = new Heroes("Valkyrie", forest, 9, "https://playidleheroes.com/icons/heroes/valkyrie-10.png");
}
