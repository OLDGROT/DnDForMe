package com.myprogramms.dndforme;

import com.myprogramms.dndforme.entities.NPC;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.List;

public class DndApp extends Application {
    List<NPC> npcList = new LinkedList<>();

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Создать NPC");
        Label label = new Label("Здесь будет информация о NPC");
        VBox root = new VBox(10, btn, label);

        btn.setOnAction(event -> {
            NPC npc = new NPC("Гаррик", "Торговец", 2, "Грубый");
            label.setText(npc.getInfo());
            npcList.add(npc);
            StringBuilder sb = new StringBuilder();
            for (NPC n : npcList) {
                sb.append(n.getInfo()).append("\n");
            }

            label.setText(sb.toString());


        });

        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("D&D Помощник мастера");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


