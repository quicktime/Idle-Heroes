package Helper;

import Heroes.Heroes;

import java.io.*;
import java.lang.reflect.Array;
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
            for (int i = 0; i < 114; i++) { // TODO: Change 115 to be variable
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
            for (int i = 0; i < 114; i++) { // TODO: Change 115 to be variable
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

    public static int getQuant(Heroes hero) {
        int stars = hero.getStars();
        String heroName = hero.getName();
        ArrayList names = getHeroNames();
        int index = names.indexOf(heroName);
        String name = getHeroes().get(index);
        String[] split = name.split(",");

        return Integer.parseInt(split[stars]);
    }

    public static void setQuant(Heroes hero, int stars, int quant) {
        ArrayList names = getHeroNames();
        System.out.println(names);
        String heroName = hero.getName();
        int index = names.indexOf(heroName);

        System.out.println(index);

        ArrayList<String> heroesList = getHeroes();
        String name = heroesList.get(index);

        String[] split = name.split(",");
        split[stars] = String.valueOf(quant);
        System.out.println(split[stars]);
        String combined = "";

        for (int i = 0; i < split.length; i++) {
            combined = combined.concat(split[i]);
            if (i != split.length - 1) {
                combined = combined.concat(",");
            }
        }

        heroesList.set(index, combined);

        System.out.println(combined);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(" ,1,2,3,4,5,6,7,8,9,10,11,12,13\n");
            for (String string : heroesList) {
                writer.write(string + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}