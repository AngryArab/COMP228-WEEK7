package com.example.comp228week7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Hello world");

        //creating layout

        StackPane layout = new StackPane();

        Scene scene = new Scene(layout ,200, 150);

        //assign the scene to the stage object
        stage.setScene(scene);

        stage.show();


    }




    public static void main(String[] args){
        launch();
    }





}

