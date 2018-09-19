package Gui;

import Heroes.Heroes;
import Heroes.Faction;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

import java.util.ArrayList;

public class HeroPane {

    public static GridPane heroPane(Heroes hero) {
        GridPane heroPane = new GridPane();
        //heroPane.setGridLinesVisible(true);

        Button homeBtn = new Button("Home");
        homeBtn.setOnAction((ActionEvent e) -> {
            Main.setScene(Main.scene());
            Main.showStage();
        });

        ImageView heroImage = new ImageView(hero.getImage());
        ImageView heroUpgrade = new ImageView(hero.getUpgrade().getImage());

        ImageView requirement1;
        ImageView requirement2;
        ImageView requirement3;
        ImageView fodder1;
        ImageView fodder2;

        ImageView arrow = new ImageView("http://png-1.findicons.com/files/icons/756/ginux/64/forward.png");
        ImageView arrow2 = new ImageView("http://png-1.findicons.com/files/icons/756/ginux/64/forward.png");
        ImageView plus = new ImageView("http://files.softicons.com/download/toolbar-icons/16x16-free-toolbar-icons-by-aha-soft/png/16/plus.png");
        ImageView plus2 = new ImageView("http://files.softicons.com/download/toolbar-icons/16x16-free-toolbar-icons-by-aha-soft/png/16/plus.png");
        ImageView plus3 = new ImageView("http://files.softicons.com/download/toolbar-icons/16x16-free-toolbar-icons-by-aha-soft/png/16/plus.png");

        ArrayList<ImageView> images = new ArrayList<>();

        try {
            requirement1 = new ImageView(hero.getRequirement1().getImage());
            images.add(requirement1);
            images.add(plus);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        try {
            fodder1 = new ImageView(hero.getFodder1().getImage());
            images.add(fodder1);
            images.add(plus2);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        try {
            requirement2 = new ImageView(hero.getRequirement2().getImage());
            images.add(requirement2);
            images.add(plus3);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        try {
            fodder2 = new ImageView(hero.getFodder2().getImage());
            images.add(fodder2);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        try {
            requirement3 = new ImageView(hero.getRequirement3().getImage());
            images.add(requirement3);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }


        int stars = hero.getStars();
        Faction faction = hero.getFaction();
        ArrayList buildRequirements = hero.getBuildRequirements(stars);

        int columns = 4 + buildRequirements.size() + (buildRequirements.size() - 1);

        // 4 columns + req.size + (req.size - 1) = 9
        for (int i = 0; i <= columns; i++) {
            ColumnConstraints name = new ColumnConstraints();
            heroPane.getColumnConstraints().add(name);
        }

        heroPane.add(heroImage, 0, 1);
        heroPane.add(arrow, 1, 1);
        for (int i = 0; i < columns - 4; i+=2) {
            heroPane.add(images.get(i), 2 + i, 1);
            if (i < images.size() - 1) {
                heroPane.add(images.get(i + 1), 2 + i + 1, 1);
            }
        }

        heroPane.add(arrow2, columns - 2, 1);
        heroPane.add(heroUpgrade, columns - 1, 1);

        heroPane.add(homeBtn, 0, 0);

        return heroPane;
    }
}
