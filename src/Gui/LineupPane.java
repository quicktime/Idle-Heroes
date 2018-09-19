package Gui;

import Heroes.FortressHeroes;
import Heroes.Heroes_NineStars;
import Heroes.ShadowHeroes;
import Heroes.LineupHeroes;
import Heroes.Heroes;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.image.*;
import javafx.event.ActionEvent;


public class LineupPane {

    public static GridPane lineupPane() {
        GridPane lineupPane = new GridPane();

        //lineupPane.setGridLinesVisible(true);
        //lineupPane.setHgap(10);
        lineupPane.setVgap(10);

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

        lineupPane.getColumnConstraints().addAll(firstSlot, secondSlot, thirdSlot, fourthSlot, fifthSlot, sixthSlot);

        Heroes firstHero = ShadowHeroes.jahra_9;
        Heroes secondHero = ShadowHeroes.baade_5;
        Heroes thirdHero = ShadowHeroes.aidan_6;
        Heroes fourthHero = ShadowHeroes.kamath_10;
        Heroes fifthHero = ShadowHeroes.poisonTongue_3;
        Heroes sixthHero = ShadowHeroes.field_13;

        Button firstBtn = new Button();
        final ImageView firstImage = new ImageView(firstHero.getImage());
        firstBtn.setGraphic(firstImage);

//        firstBtn.setOnAction(new EventHandler<>() {
//            @Override public void handle(ActionEvent e) {
//                // TODO: do stuff
//            }
//        });

        firstBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane1 = HeroPane.heroPane(firstHero);
            Scene scene1 = new Scene(heroPane1, 900, 480);
            Main.setScene(scene1);
            Main.showStage();
        });

        Button secondBtn = new Button();
        final ImageView secondImage = new ImageView(secondHero.getImage());
        secondBtn.setGraphic(secondImage);
        secondBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane2 = HeroPane.heroPane(secondHero);
            Scene scene2 = new Scene(heroPane2, 900, 480);
            Main.setScene(scene2);
            Main.showStage();
        });

        Button thirdBtn = new Button();
        final ImageView thirdImage = new ImageView(thirdHero.getImage());
        thirdBtn.setGraphic(thirdImage);
        thirdBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane = HeroPane.heroPane(thirdHero);
            Scene scene = new Scene(heroPane, 900, 480);
            Main.setScene(scene);
            Main.showStage();
        });

        Button fourthBtn = new Button();
        final ImageView fourthImage = new ImageView(fourthHero.getImage());
        fourthBtn.setGraphic(fourthImage);
        fourthBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane = HeroPane.heroPane(fourthHero);
            Scene scene = new Scene(heroPane, 900, 480);
            Main.setScene(scene);
            Main.showStage();
        });

        Button fifthBtn = new Button();
        final ImageView fifthImage = new ImageView(fifthHero.getImage());
        fifthBtn.setGraphic(fifthImage);
        fifthBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane = HeroPane.heroPane(fifthHero);
            Scene scene = new Scene(heroPane, 900, 480);
            Main.setScene(scene);
            Main.showStage();
        });

        Button sixthBtn = new Button();
        final ImageView sixthImage = new ImageView(sixthHero.getImage());
        sixthBtn.setGraphic(sixthImage);
        sixthBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane = HeroPane.heroPane(sixthHero);
            Scene scene = new Scene(heroPane, 900, 480);
            Main.setScene(scene);
            Main.showStage();
        });

        lineupPane.add(firstBtn, 0, 0);
        lineupPane.add(secondBtn, 1, 0);
        lineupPane.add(thirdBtn, 2, 0);
        lineupPane.add(fourthBtn, 3, 0);
        lineupPane.add(fifthBtn, 4, 0);
        lineupPane.add(sixthBtn, 5, 0);
        return lineupPane;
    }
}