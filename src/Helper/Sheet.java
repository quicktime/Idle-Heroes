package Helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sheet {

    private static String path = "C:\\Users\\dolanb\\Desktop\\Book1.csv";

    public static ArrayList<String> getHeroes() {
        ArrayList<String> heroes = new ArrayList<>();
        try {
            BufferedReader heroesList = new BufferedReader(new FileReader(path));
            heroesList.readLine(); // skip headers
            for (int i = 0; i < 115; i++) { // TODO: Change 115 to be variable
                String fullLine = heroesList.readLine();
                heroes.add(fullLine);
            }
            heroesList.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return heroes;
    }

    public static ArrayList<String> getHeroNames() {
        ArrayList<String> heroes = new ArrayList<>();
        try {
            BufferedReader heroesList = new BufferedReader(new FileReader(path));
            heroesList.readLine(); // skip headers
            for (int i = 0; i < 115; i++) { // TODO: Change 115 to be variable
                String fullLine = heroesList.readLine();
                Scanner heroLine = new Scanner(fullLine);
                heroLine.useDelimiter(",");
                heroes.add(heroLine.next());
            }
            heroesList.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return heroes;
    }

    public static int getStarCount(String faction, int stars) {
        int starCount = 0;
        int startIndex = 0;
        int endIndex = 114;
        ArrayList heroes = getHeroes();

        switch (faction) {
            case "Shadow" :
                startIndex = 1;
                endIndex = 24;
                break;
            case "Fortress" :
                startIndex = 25;
                endIndex = 48;
                break;
            case "Abyss" :
                startIndex = 49;
                endIndex = 72;
                break;
            case "Forest" :
                startIndex = 73;
                endIndex = 96;
                break;
            case "Dark" :
                startIndex = 97;
                endIndex = 105;
                break;
            case "Light" :
                startIndex = 106;
                endIndex = 114;
                break;
        }

        List factionHeroes = heroes.subList(startIndex, endIndex);
        for (int i = 0; i < (endIndex - startIndex); i++) {
            String hero = factionHeroes.get(i).toString();
            String[] split = hero.split(",");
            // Name, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            starCount += Integer.parseInt(split[stars]);
        }

        return starCount;
    }

    public static int getStarCount(int stars) {
        int starCount = 0;
        int endIndex = 114;

        ArrayList heroes = getHeroes();
        for (int i = 0; i < endIndex; i++) {
            String hero = heroes.get(i).toString();
            String[] split = hero.split(",");
            starCount += Integer.parseInt(split[stars]);
        }
        return starCount;
    }
}