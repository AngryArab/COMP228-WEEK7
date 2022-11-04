package com.example.comp228week7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginExample  extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("login");

        GridPane layout = new GridPane();

        //add padding
        layout.setPadding(new Insets(10,10,10,10));

        //add spacing

        layout.setHgap(10);
        layout.setVgap(10);
        //add a password label
        Label UserLabal = new Label("Username");



        //password label
        Label passwordLabel = new Label("password");

        GridPane.setConstraints(passwordLabel, 0,0);

        TextField username = new TextField();

        TextField password = new TextField();

        GridPane.setConstraints(username,1,1);

        layout.getChildren().addAll(username,passwordLabel, button);

        Scene scene = new Scene()

        //add button

        Button button = new Button("Login");


    }



    public static void main(String[] args){
        System.out.println();
    }



}
