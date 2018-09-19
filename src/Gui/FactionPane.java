package Gui;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class FactionPane {

    public static GridPane factionPane() {

        GridPane factionPane = new GridPane();

        ColumnConstraints firstSlot = new ColumnConstraints();
        ColumnConstraints secondSlot = new ColumnConstraints();
        ColumnConstraints thirdSlot = new ColumnConstraints();
        ColumnConstraints fourthSlot = new ColumnConstraints();
        ColumnConstraints fifthSlot = new ColumnConstraints();
        ColumnConstraints sixthSlot = new ColumnConstraints();

        firstSlot.setHgrow(Priority.ALWAYS);
        secondSlot.setHgrow(Priority.ALWAYS);
        thirdSlot.setHgrow(Priority.ALWAYS);
        fourthSlot.setHgrow(Priority.ALWAYS);
        fifthSlot.setHgrow(Priority.ALWAYS);
        sixthSlot.setHgrow(Priority.ALWAYS);

        firstSlot.setHalignment(HPos.CENTER);
        secondSlot.setHalignment(HPos.CENTER);
        thirdSlot.setHalignment(HPos.CENTER);
        fourthSlot.setHalignment(HPos.CENTER);
        fifthSlot.setHalignment(HPos.CENTER);
        sixthSlot.setHalignment(HPos.CENTER);

        factionPane.getColumnConstraints().addAll(firstSlot, secondSlot, thirdSlot, fourthSlot, fifthSlot, sixthSlot);

        Button firstBtn = new Button();
        final ImageView firstImage = new ImageView("factions/iko-shadow-faction.png");
        firstBtn.setGraphic(firstImage);
        firstBtn.setOnAction((ActionEvent e) -> {
            GridPane pane = ShadowFactionScene.shadowFactionPane();
            Scene scene = new Scene(pane, 900, 480);
            Main.setScene(scene);
            Main.showStage();
        });

        Button secondBtn = new Button();
        final ImageView secondImage = new ImageView("factions/iko-fortress-faction.png");
        secondBtn.setGraphic(secondImage);

        Button thirdBtn = new Button();
        final ImageView thirdImage = new ImageView("factions/iko-abyss-faction.png");
        thirdBtn.setGraphic(thirdImage);

        Button fourthBtn = new Button();
        final ImageView fourthImage = new ImageView("factions/iko-forest-faction.png");
        fourthBtn.setGraphic(fourthImage);

        Button fifthBtn = new Button();
        final ImageView fifthImage = new ImageView("factions/iko-dark-faction.png");
        fifthBtn.setGraphic(fifthImage);

        Button sixthBtn = new Button();
        final ImageView sixthImage = new ImageView("factions/iko-light-faction.png");
        sixthBtn.setGraphic(sixthImage);

        factionPane.add(firstBtn, 0, 0);
        factionPane.add(secondBtn, 1, 0);
        factionPane.add(thirdBtn, 2, 0);
        factionPane.add(fourthBtn, 3, 0);
        factionPane.add(fifthBtn, 4, 0);
        factionPane.add(sixthBtn, 5, 0);
        return factionPane;
    }
}
