package Gui;

import Heroes.FortressHeroes;
import Heroes.HeroesAdapter;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class InfoPane {

    public static GridPane infoPane() {
        GridPane infoPane = new GridPane();

        //infoPane.setGridLinesVisible(true);
        infoPane.setHgap(10);
        infoPane.setVgap(10);

        ColumnConstraints userCol = new ColumnConstraints();
        ColumnConstraints serverCol = new ColumnConstraints();
        ColumnConstraints levelCol = new ColumnConstraints();
        ColumnConstraints vipCol = new ColumnConstraints();

        userCol.setHgrow(Priority.ALWAYS);
        serverCol.setHgrow(Priority.ALWAYS);
        levelCol.setHgrow(Priority.ALWAYS);
        vipCol.setHgrow(Priority.ALWAYS);

        infoPane.getColumnConstraints().add(userCol);
        infoPane.getColumnConstraints().add(serverCol);
        infoPane.getColumnConstraints().add(levelCol);
        infoPane.getColumnConstraints().add(vipCol);

        Label user = new Label("Username");
        infoPane.add(user, 0, 0);

        Label server = new Label("Server");
        infoPane.add(server, 1, 0);

        Label level = new Label("Level");
        infoPane.add(level, 2, 0);

        Label vip = new Label("VIP");
        infoPane.add(vip, 3, 0);

        return infoPane;
    }
}
