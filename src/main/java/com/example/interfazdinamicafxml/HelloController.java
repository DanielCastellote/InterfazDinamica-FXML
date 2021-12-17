package com.example.interfazdinamicafxml;

import javafx.animation.Animation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.VBox;


public class HelloController {

    @FXML
    private VBox vBox;
    @FXML
    private Button botonMenu;
    @FXML
    private Button panel1;
    @FXML
    private Button panel2;
    @FXML
    private Label labelInicial;
    @FXML
    private Label label1;
    @FXML
    private Label label2;


    @FXML
    public void iniciarVbox() {

        if (botonMenu.getTranslateX() == 0) {
            vBox.setTranslateX(0);
            botonMenu.setTranslateX(70);
            vBox.setEffect(new DropShadow());
        } else {
            vBox.setTranslateX(-70);
            botonMenu.setTranslateX(0);
        }
    }

    @FXML
    public void panel1() {
        labelInicial.setVisible(false);
        label2.setVisible(false);
        label1.setTranslateX(+200);
        label1.setTranslateY(+200);
        label1.setVisible(true);

    }

    @FXML
    public void panel2() {
        labelInicial.setVisible(false);
        label1.setVisible(false);

        label2.setTranslateX(+200);
        label2.setTranslateY(+200);

        label2.setVisible(true);
    }
}