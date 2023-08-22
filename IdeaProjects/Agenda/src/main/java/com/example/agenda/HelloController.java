package com.example.agenda;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML //decoradores
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(":C");
    }
}