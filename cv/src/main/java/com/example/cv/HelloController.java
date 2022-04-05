package com.example.cv;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.regex.*;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class HelloController {

    public Label l;
    public TextArea t;
    public TextField f;
    public Button b;

    @FXML
    public void onHelloButtonClick() {
        l.setText(Pattern.matches(f.getText(), t.getText()) ? "OK" : "NG");
    }
}