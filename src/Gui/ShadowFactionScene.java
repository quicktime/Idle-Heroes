package Gui;

import Helper.Sheet;
import Heroes.Heroes;
import Heroes.ShadowHeroes;
import Heroes.ShadowHeroes;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.RowConstraints;

import java.util.ArrayList;

public class ShadowFactionScene {

    public static GridPane shadowFactionPane() {

        ArrayList<Heroes> heroes = new ArrayList<Heroes>();
        heroes.add(ShadowHeroes.chainHammer_3);
        heroes.add(ShadowHeroes.darkPriest_3);
        heroes.add(ShadowHeroes.iceTroll_3);
        heroes.add(ShadowHeroes.poisonTongue_3);
        heroes.add(ShadowHeroes.shirley_3);
        heroes.add(ShadowHeroes.boneGeneral_4);
        heroes.add(ShadowHeroes.bonecarver_4);
        heroes.add(ShadowHeroes.deathsworn_4);
        heroes.add(ShadowHeroes.gbagbo_4);
        heroes.add(ShadowHeroes.glen_4);
        heroes.add(ShadowHeroes.grumpyCorpse_4);
        heroes.add(ShadowHeroes.lamb_4);
        heroes.add(ShadowHeroes.nightmareKnight_4);
        heroes.add(ShadowHeroes.aidan_5);
        heroes.add(ShadowHeroes.baade_5);
        heroes.add(ShadowHeroes.bloodBlade_5);
        heroes.add(ShadowHeroes.boneGeneral_5);
        heroes.add(ShadowHeroes.bonecarver_5);
        heroes.add(ShadowHeroes.corpsedemon_5);
        heroes.add(ShadowHeroes.deathsworn_5);
        heroes.add(ShadowHeroes.dominator_5);
        heroes.add(ShadowHeroes.field_5);
        heroes.add(ShadowHeroes.gbagbo_5);
        heroes.add(ShadowHeroes.glen_5);
        heroes.add(ShadowHeroes.grumpyCorpse_5);
        heroes.add(ShadowHeroes.kamath_5);
        heroes.add(ShadowHeroes.kharma_5);
        heroes.add(ShadowHeroes.lamb_5);
        heroes.add(ShadowHeroes.lutz_5);
        heroes.add(ShadowHeroes.nightmareKnight_5);
        heroes.add(ShadowHeroes.walter_5);
        heroes.add(ShadowHeroes.jahra_5);
        heroes.add(ShadowHeroes.aidan_6);
        heroes.add(ShadowHeroes.baade_6);
        heroes.add(ShadowHeroes.bloodBlade_6);
        heroes.add(ShadowHeroes.bonecarver_6);
        heroes.add(ShadowHeroes.corpsedemon_6);
        heroes.add(ShadowHeroes.deathsworn_6);
        heroes.add(ShadowHeroes.dominator_6);
        heroes.add(ShadowHeroes.field_6);
        heroes.add(ShadowHeroes.glen_6);
        heroes.add(ShadowHeroes.kamath_6);
        heroes.add(ShadowHeroes.kharma_6);
        heroes.add(ShadowHeroes.lutz_6);
        heroes.add(ShadowHeroes.walter_6);
        heroes.add(ShadowHeroes.jahra_6);
        heroes.add(ShadowHeroes.aidan_7);
        heroes.add(ShadowHeroes.baade_7);
        heroes.add(ShadowHeroes.bloodBlade_7);
        heroes.add(ShadowHeroes.bonecarver_7);
        heroes.add(ShadowHeroes.corpsedemon_7);
        heroes.add(ShadowHeroes.deathsworn_7);
        heroes.add(ShadowHeroes.dominator_7);
        heroes.add(ShadowHeroes.field_7);
        heroes.add(ShadowHeroes.glen_7);
        heroes.add(ShadowHeroes.kamath_7);
        heroes.add(ShadowHeroes.kharma_7);
        heroes.add(ShadowHeroes.lutz_7);
        heroes.add(ShadowHeroes.walter_7);
        heroes.add(ShadowHeroes.jahra_7);
        heroes.add(ShadowHeroes.aidan_8);
        heroes.add(ShadowHeroes.baade_8);
        heroes.add(ShadowHeroes.bloodBlade_8);
        heroes.add(ShadowHeroes.bonecarver_8);
        heroes.add(ShadowHeroes.corpsedemon_8);
        heroes.add(ShadowHeroes.deathsworn_8);
        heroes.add(ShadowHeroes.field_8);
        heroes.add(ShadowHeroes.glen_8);
        heroes.add(ShadowHeroes.kamath_8);
        heroes.add(ShadowHeroes.kharma_8);
        heroes.add(ShadowHeroes.lutz_8);
        heroes.add(ShadowHeroes.walter_8);
        heroes.add(ShadowHeroes.jahra_8);
        heroes.add(ShadowHeroes.aidan_9);
        heroes.add(ShadowHeroes.baade_9);
        heroes.add(ShadowHeroes.bloodBlade_9);
        heroes.add(ShadowHeroes.bonecarver_9);
        heroes.add(ShadowHeroes.corpsedemon_9);
        heroes.add(ShadowHeroes.deathsworn_9);
        heroes.add(ShadowHeroes.dominator_9);
        heroes.add(ShadowHeroes.field_9);
        heroes.add(ShadowHeroes.glen_9);
        heroes.add(ShadowHeroes.kamath_9);
        heroes.add(ShadowHeroes.kharma_9);
        heroes.add(ShadowHeroes.lutz_9);
        heroes.add(ShadowHeroes.walter_9);
        heroes.add(ShadowHeroes.jahra_9);
        heroes.add(ShadowHeroes.aidan_10);
        heroes.add(ShadowHeroes.baade_10);
        heroes.add(ShadowHeroes.bloodBlade_10);
        heroes.add(ShadowHeroes.corpsedemon_10);
        heroes.add(ShadowHeroes.dominator_10);
        heroes.add(ShadowHeroes.field_10);
        heroes.add(ShadowHeroes.kamath_10);
        heroes.add(ShadowHeroes.kharma_10);
        heroes.add(ShadowHeroes.lutz_10);
        heroes.add(ShadowHeroes.walter_10);
        heroes.add(ShadowHeroes.jahra_10);
        heroes.add(ShadowHeroes.aidan_11);
        heroes.add(ShadowHeroes.baade_11);
        heroes.add(ShadowHeroes.bloodBlade_11);
        heroes.add(ShadowHeroes.corpsedemon_11);
        heroes.add(ShadowHeroes.dominator_11);
        heroes.add(ShadowHeroes.field_11);
        heroes.add(ShadowHeroes.kamath_11);
        heroes.add(ShadowHeroes.kharma_11);
        heroes.add(ShadowHeroes.lutz_11);
        heroes.add(ShadowHeroes.walter_11);
        heroes.add(ShadowHeroes.jahra_11);
        heroes.add(ShadowHeroes.aidan_12);
        heroes.add(ShadowHeroes.baade_12);
        heroes.add(ShadowHeroes.bloodBlade_12);
        heroes.add(ShadowHeroes.corpsedemon_12);
        heroes.add(ShadowHeroes.dominator_12);
        heroes.add(ShadowHeroes.field_12);
        heroes.add(ShadowHeroes.kamath_12);
        heroes.add(ShadowHeroes.kharma_12);
        heroes.add(ShadowHeroes.lutz_12);
        heroes.add(ShadowHeroes.walter_12);
        heroes.add(ShadowHeroes.jahra_12);
        heroes.add(ShadowHeroes.aidan_13);
        heroes.add(ShadowHeroes.baade_13);
        heroes.add(ShadowHeroes.bloodBlade_13);
        heroes.add(ShadowHeroes.corpsedemon_13);
        heroes.add(ShadowHeroes.dominator_13);
        heroes.add(ShadowHeroes.field_13);
        heroes.add(ShadowHeroes.kamath_13);
        heroes.add(ShadowHeroes.kharma_13);
        heroes.add(ShadowHeroes.lutz_13);
        heroes.add(ShadowHeroes.walter_13);
        heroes.add(ShadowHeroes.jahra_13);

        GridPane pane = new GridPane();

        for (int i = 0; i < 7; i++) {
            ColumnConstraints slot = new ColumnConstraints();
            slot.setHgrow(Priority.ALWAYS);
            slot.setHalignment(HPos.CENTER);
            pane.getColumnConstraints().add(slot);
        }

        for (int i = 0; i < 264; i+=7) {
            for (int j = 0; j < 7; j++) {
                int index = i + j;
                if (index >= 131) {
                    break;
                }

                Heroes hero = heroes.get(index);
                int stars = hero.getStars();
                int currentQuant = Sheet.getQuant(hero);
                ImageView btn = new ImageView(hero.getImage());


                final TextField quant = new TextField();
                quant.setPromptText(String.valueOf(currentQuant));
                quant.setAlignment(Pos.CENTER);
                quant.setPrefColumnCount(10);
                quant.getText();

                quant.setOnKeyPressed(new EventHandler<>() {
                    @Override
                    public void handle(KeyEvent ke)
                    {
                        if (ke.getCode().equals(KeyCode.ENTER))
                        {
                            System.out.println(hero.getName());
                           Sheet.setQuant(hero, stars, Integer.parseInt(quant.getText()));
                        }
                    }
                });

                pane.add(btn, j, i);
                pane.add(quant, j, i+1);
            }
        }

//        11x 13*
//        11x 12*
//        11x 11*
//        11x 10*
//        14x 9*
//        14x 8*
//        14x 7*
//        14x 6*
//        19x 5*
//         8x 4*
//         5x 3*
//        ======
//        132x

        // 19 rows


        return pane;
    }
}
