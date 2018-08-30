package Heroes;

import Helper.Sheet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HeroesAdapter  {

    public static ArrayList<String> getHero(String hero) {
        ArrayList<String> heroList = new ArrayList<>();
        try {
            BufferedReader heroesList = new BufferedReader(new FileReader("C:\\Users\\dolanb\\Desktop\\Book1.csv"));
            heroesList.readLine(); // skip headers
            ArrayList heroes = Sheet.getHeroNames();
            int index = heroes.indexOf(hero);
            for (int i = 0; i < index; i++) {
                heroesList.readLine();
            }
            String fullLine = heroesList.readLine();
            Scanner heroLine = new Scanner(fullLine);
            heroLine.useDelimiter(",");
            while (heroLine.hasNext()) {
                heroList.add(heroLine.next());
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return heroList;
    }

    private static int getFourStarQuantity(String hero) {
        return Integer.parseInt(getHero(hero).get(4));
    }

    private static int getFiveStarQuantity(String hero) {
        return Integer.parseInt(getHero(hero).get(5));
    }

    private static int getSixStarQuantitiy(String hero) {
        return Integer.parseInt(getHero(hero).get(6));
    }

    private static int getNineStarQuantity(String hero) {
        return Integer.parseInt(getHero(hero).get(9));
    }

    private static int getTenStarQuantitiy(String hero) {
        return Integer.parseInt(getHero(hero).get(10));
    }

    private static boolean canCraftFiveStar(Heroes hero) {
        boolean canCraftFiveStar = false;
        return canCraftFiveStar;
    }

    public static boolean canCraftSixStar(Heroes hero) {
        boolean canCraftSixStar = false;

        String heroName = hero.getName();
        String requirementName = hero.getRequirement1().getName();

        ArrayList requirements = Requirements.sixStarRequirements();
        ArrayList<Object> inventory = new ArrayList<>();

        inventory.add(getFiveStarQuantity(heroName));
        inventory.add(getFiveStarQuantity(requirementName));
        inventory.add(hero.getFaction().getFiveStarFodderQuant() - getFiveStarQuantity(heroName) - 1); // subtract the five star copies of the hero & the five star copy of the requirement

        if     (((int)inventory.get(0) >= (int)requirements.get(0)) &&
                ((int)inventory.get(1) >= (int)requirements.get(1)) &&
                ((int)inventory.get(2) >= (int)requirements.get(2)))
        {
            canCraftSixStar = true;
        }

        // /*
        System.out.println(inventory.get(0) + " -- " + requirements.get(0));
        System.out.println(inventory.get(1) + " -- " + requirements.get(1));
        System.out.println(inventory.get(2) + " -- " + requirements.get(2));

        System.out.println(heroName);
        System.out.println(requirementName);
        // */

        return canCraftSixStar;
    }

    public static boolean canCraftSevenStar(Heroes hero) {
        boolean canCraftSevenStar = false;

        String heroName = hero.getName();

        ArrayList requirements = Requirements.sevenStarRequirements();
        ArrayList<Object> inventory = new ArrayList<>();

        inventory.add(hero.getFaction().getFiveStarFodderQuant() - getFiveStarQuantity(heroName)); // subtract the five star copies of the hero

        if ((int)inventory.get(0) >= (int)requirements.get(0)) {
            canCraftSevenStar = true;
        }

        // /*
        System.out.println(inventory.get(0) + " -- " + requirements.get(0));
        System.out.println(inventory.get(1) + " -- " + requirements.get(1));
        System.out.println(inventory.get(2) + " -- " + requirements.get(2));

        System.out.println(heroName);
        // */

        return canCraftSevenStar;
    }

    private static boolean canCraftEightStar(Heroes hero) {
        boolean canCraft = false;

        String heroName = hero.getName();

        ArrayList requirements = Requirements.eightStarRequirements();
        ArrayList<Object> inventory = new ArrayList<>();

        inventory.add(hero.getFaction().getSixStarFodderQuant());
        inventory.add(hero.getFaction().getFiveStarFodderQuant() - getFiveStarQuantity(heroName)); // subtract the five star copies of the hero

        int trues = 0;

        for (int i = 0; i < requirements.size(); i++) {
            if ((int)inventory.get(i) >= (int)requirements.get(i)) {
                trues++;
            }
        }

        if (trues == requirements.size()) {
            canCraft = true;
        }

        // /*
        System.out.println(inventory.get(0) + " -- " + requirements.get(0));
        System.out.println(inventory.get(1) + " -- " + requirements.get(1));
        System.out.println(inventory.get(2) + " -- " + requirements.get(2));

        System.out.println(heroName);
        // */

        return canCraft;
    }

    private static boolean canCraftNineStar(Heroes hero) {
        boolean canCraft = false;

        String heroName = hero.getName();

        ArrayList requirements = Requirements.eightStarRequirements();
        ArrayList<Object> inventory = new ArrayList<>();

        inventory.add(getFiveStarQuantity(heroName));
        inventory.add(hero.getFaction().getSixStarFodderQuant());
        inventory.add(hero.getFaction().getFiveStarFodderQuant() - getFiveStarQuantity(heroName)); // subtract the five star copies of the hero

        int trues = 0;

        for (int i = 0; i < requirements.size(); i++) {
            if ((int)inventory.get(i) >= (int)requirements.get(i)) {
                trues++;
            }
        }

        if (trues == requirements.size()) {
            canCraft = true;
        }

        // /*
        System.out.println(inventory.get(0) + " -- " + requirements.get(0));
        System.out.println(inventory.get(1) + " -- " + requirements.get(1));
        System.out.println(inventory.get(2) + " -- " + requirements.get(2));

        System.out.println(heroName);
        // */

        return canCraft;
    }

    private static boolean canCraftTenStar(Heroes hero) {
        boolean canCraft = false;

        String heroName = hero.getName();

        ArrayList requirements = Requirements.eightStarRequirements();
        ArrayList<Object> inventory = new ArrayList<>();

        inventory.add(getFiveStarQuantity(heroName));
        inventory.add(hero.getFaction().getSixStarFodderQuant());
        inventory.add(Sheet.getStarCount(9) - 1); // subtract out the nine star hero trying to be upgraded

        int trues = 0;

        for (int i = 0; i < requirements.size(); i++) {
            if ((int)inventory.get(i) >= (int)requirements.get(i)) {
                trues++;
            }
        }

        if (trues == requirements.size()) {
            canCraft = true;
        }

        // /*
        System.out.println(inventory.get(0) + " -- " + requirements.get(0));
        System.out.println(inventory.get(1) + " -- " + requirements.get(1));
        System.out.println(inventory.get(2) + " -- " + requirements.get(2));

        System.out.println(heroName);
        // */

        return canCraft;
    }

    public static boolean canUpgrade(Heroes hero) {
        boolean canUpgrade = false;
        switch (hero.getStars()) {
            case 4 :
                canUpgrade = canCraftFiveStar(hero);
                break;
            case 5 :
                canUpgrade = canCraftSixStar(hero);
                break;
            case 6 :
                canUpgrade = canCraftSevenStar(hero);
                break;
            case 7:
                canUpgrade = canCraftEightStar(hero);
                break;
            case 8 :
                canUpgrade = canCraftNineStar(hero);
                break;
            case 9 :
                canUpgrade = canCraftTenStar(hero);
                break;
        }
        return canUpgrade;
    }
}
