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
        try {
            requirement1 = new ImageView(hero.getRequirement1().getImage());
        } catch (NullPointerException e) {
            requirement1 = new ImageView(hero.getImage());
        }
        ImageView requirement2 = new ImageView(hero.getRequirement2().getImage());
        ImageView requirement3 = new ImageView(hero.getRequirement3().getImage());
        ImageView arrow = new ImageView("http://png-1.findicons.com/files/icons/756/ginux/64/forward.png");
        ImageView arrow2 = new ImageView("http://png-1.findicons.com/files/icons/756/ginux/64/forward.png");
        ImageView plus = new ImageView("http://files.softicons.com/download/toolbar-icons/16x16-free-toolbar-icons-by-aha-soft/png/16/plus.png");
        ImageView plus2 = new ImageView("http://files.softicons.com/download/toolbar-icons/16x16-free-toolbar-icons-by-aha-soft/png/16/plus.png");
        ImageView plus3 = new ImageView("http://files.softicons.com/download/toolbar-icons/16x16-free-toolbar-icons-by-aha-soft/png/16/plus.png");
        ImageView holder = new ImageView("http://files.softicons.com/download/toolbar-icons/vista-base-software-icons-2-by-icons-land/png/128x128/Box_Blue.png");
        ImageView holder2 = new ImageView("http://files.softicons.com/download/toolbar-icons/vista-base-software-icons-2-by-icons-land/png/128x128/Box_Blue.png");
        ImageView holder3 = new ImageView("http://files.softicons.com/download/toolbar-icons/vista-base-software-icons-2-by-icons-land/png/128x128/Box_Blue.png");
        ImageView holder4 = new ImageView("http://files.softicons.com/download/toolbar-icons/vista-base-software-icons-2-by-icons-land/png/128x128/Box_Blue.png");

        ArrayList<ImageView> images = new ArrayList<>();
        images.add(requirement1);
        images.add(plus);
        images.add(requirement2);
        images.add(plus2);
        images.add(requirement3);

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
