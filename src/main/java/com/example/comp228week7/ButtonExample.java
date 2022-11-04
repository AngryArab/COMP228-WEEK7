package com.example.comp228week7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("button ezample");

        VBox layout = new VBox();

        layout.setPadding(new Insets(10,10,10,10));

        Button button = new Button("click");

        //events , lets do something when u click the button

        button.setOnAction(e -> System.out.println("Hello at the FX BUTTON"));

        layout.getChildren().add(button);


        Scene scene = new Scene(layout, 200, 300);

        stage.setScene(scene);

        stage.show();


    }


    public static void main(String[] args){
        launch();
    }



}
