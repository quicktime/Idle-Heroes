package Gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        initUI(stage);
    }

    public static Scene scene() {
        GridPane root = new GridPane();
        GridPane infoPane = InfoPane.infoPane();
        GridPane lineupPane = LineupPane.lineupPane();
        GridPane bagPane = new GridPane();
        GridPane factionPane = FactionPane.factionPane();

        //root.setHgap(8);
        //root.setPadding(new Insets(5));

        ColumnConstraints col = new ColumnConstraints();
        col.setHgrow(Priority.ALWAYS);

        RowConstraints infoRow = new RowConstraints();
        RowConstraints lineupRow = new RowConstraints();
        RowConstraints bagRow = new RowConstraints();
        RowConstraints factionRow = new RowConstraints();

        infoRow.setMaxHeight(100);
        lineupRow.setVgrow(Priority.ALWAYS);
        bagRow.setVgrow(Priority.ALWAYS);
        factionRow.setVgrow(Priority.ALWAYS);

        root.getColumnConstraints().add(col);
        root.getRowConstraints().addAll(infoRow, lineupRow, bagRow, factionRow);

        root.getChildren().add(infoPane);
        root.add(lineupPane, 0, 1);
        // root.add(bagPane, 0, 2);
        root.add(factionPane, 0, 3);

        return new Scene(root, 900, 480);
    }

    private void initUI(Stage stage) {
        Scene scene = scene();
        setStage(stage);
        setScene(scene);

        stage.setTitle("IH");
        stage.setScene(scene);
        stage.show();
    }

    private static Stage thisStage;
    private static Scene thisScene;

    public static void setStage(Stage stage){
        thisStage = stage;
    }

    public static void showStage() {
        thisStage.setScene(thisScene);
        thisStage.show();
    }

    public static void setScene(Scene scene) {
        thisScene = scene;
    }


}
