package com.example.myjavafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button btn_start;

    @FXML
    private Button btn_end;

    @FXML
    protected Circle circle;

    boolean check = true;

    @FXML
    //This method causes the text and colour to change the first time the "Start Universe" button is pressed.
    //On each following press the color of the circle changes between green and blue.
    protected void onStartButtonClick() {
        welcomeText.setText("The universe has started ...");
        btn_start.setText("Grow universe");

        if(!check) {
            circle.setFill(Paint.valueOf("blue"));
            check = true;
        }
        else{
            circle.setFill(Paint.valueOf("green"));
            check = false;
        }

    }

    @FXML
    //This method allows the circle to change color to black when the "End universe" button is pressed.
    protected void onEndButtonClick(){
        welcomeText.setText("The universe has ended.");
        circle.setFill(Paint.valueOf("black"));
    }


}