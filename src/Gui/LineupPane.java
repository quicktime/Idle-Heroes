package Gui;

import Heroes.FortressHeroes;
import Heroes.LineupHeroes;
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

        Button firstBtn = new Button();
        final ImageView firstImage = new ImageView("https://playidleheroes.com/icons/heroes/sigmund.png");
        firstBtn.setGraphic(firstImage);

//        firstBtn.setOnAction(new EventHandler<>() {
//            @Override public void handle(ActionEvent e) {
//                // TODO: do stuff
//            }
//        });

        firstBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane1 = HeroPane.heroPane(LineupHeroes.sigmund);
            Scene scene1 = new Scene(heroPane1, 900, 480);
            Main.setScene(scene1);
            Main.showStage();
        });

        Button secondBtn = new Button();
        final ImageView secondImage = new ImageView("https://playidleheroes.com/icons/heroes/mihm.png");
        secondBtn.setGraphic(secondImage);
        secondBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane2 = HeroPane.heroPane(LineupHeroes.mihm);
            Scene scene2 = new Scene(heroPane2, 900, 480);
            Main.setScene(scene2);
            Main.showStage();
        });

        Button thirdBtn = new Button();
        final ImageView thirdImage = new ImageView("https://playidleheroes.com/icons/heroes/belrain-10.png");
        thirdBtn.setGraphic(thirdImage);
        thirdBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane = HeroPane.heroPane(LineupHeroes.belrain);
            Scene scene = new Scene(heroPane, 900, 480);
            Main.setScene(scene);
            Main.showStage();
        });

        Button fourthBtn = new Button();
        final ImageView fourthImage = new ImageView("https://playidleheroes.com/icons/heroes/jahra-10.png");
        fourthBtn.setGraphic(fourthImage);
        fourthBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane = HeroPane.heroPane(LineupHeroes.jahra);
            Scene scene = new Scene(heroPane, 900, 480);
            Main.setScene(scene);
            Main.showStage();
        });

        Button fifthBtn = new Button();
        final ImageView fifthImage = new ImageView("https://playidleheroes.com/icons/heroes/kroos-10.png");
        fifthBtn.setGraphic(fifthImage);
        fifthBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane = HeroPane.heroPane(LineupHeroes.kroos);
            Scene scene = new Scene(heroPane, 900, 480);
            Main.setScene(scene);
            Main.showStage();
        });

        Button sixthBtn = new Button();
        final ImageView sixthImage = new ImageView("https://playidleheroes.com/icons/heroes/valkyrie-10.png");
        sixthBtn.setGraphic(sixthImage);
        sixthBtn.setOnAction((ActionEvent e) -> {
            GridPane heroPane = HeroPane.heroPane(LineupHeroes.valkyrie);
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