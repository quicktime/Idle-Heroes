package Heroes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Requirements {

    public static ArrayList fiveStarRequirements() {
        ArrayList fiveStarRequirements = new ArrayList();

        fiveStarRequirements.add(4);
        fiveStarRequirements.add(4);
        fiveStarRequirements.add(4);

        return fiveStarRequirements;
    }

    public static ArrayList sixStarRequirements() {
        ArrayList sixStarRequirements = new ArrayList();

        sixStarRequirements.add(2);
        sixStarRequirements.add(1);
        sixStarRequirements.add(3);

        return sixStarRequirements;
    }

    public static ArrayList sevenStarRequirements() {
        ArrayList sevenStarRequirements = new ArrayList();

        sevenStarRequirements.add(4);

        return sevenStarRequirements;
    }

    public static ArrayList eightStarRequirements() {
        ArrayList eightStarRequirements = new ArrayList();

        eightStarRequirements.add(1);
        eightStarRequirements.add(3);

        return eightStarRequirements;
    }

    public static ArrayList nineStarRequirements() {
        ArrayList nineStarRequirements = new ArrayList();

        nineStarRequirements.add(1);
        nineStarRequirements.add(1);
        nineStarRequirements.add(2);

        return nineStarRequirements;
    }

    public static ArrayList tenStarRequirements() {
        ArrayList tenStarRequirements = new ArrayList();

        tenStarRequirements.add(2);
        tenStarRequirements.add(1);
        tenStarRequirements.add(1);

        return tenStarRequirements;
    }

    public static ArrayList buildRequirements(int stars) {
        ArrayList buildRequirements = new ArrayList();

        switch(stars) {
            case 5 :
                buildRequirements = sixStarRequirements();
                break;
            case 6 :
                buildRequirements = sevenStarRequirements();
                break;
            case 7 :
                buildRequirements = eightStarRequirements();
                break;
            case 8 :
                buildRequirements = nineStarRequirements();
                break;
            case 9 :
                buildRequirements = tenStarRequirements();
                break;
        }

        return buildRequirements;
    }
}
