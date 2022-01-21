package com.example.interfazdinamicafxml;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.util.Duration;


public class HelloController {

    @FXML
    public AnchorPane vistaAnidada;
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
    private Button botonVistaAnidada;

    private Animation animacion;


    @FXML
    public void iniciarVbox() {

        if (botonMenu.getTranslateX() == 0) {
            vBox.setTranslateX(0);
            botonMenu.setTranslateX(75);
            vBox.setEffect(new DropShadow());
        } else {
            vBox.setTranslateX(-75);
            botonMenu.setTranslateX(0);
        }
    }

    @FXML
    public void añadirVistaAnidada() {

        botonVistaAnidada.setVisible(false);
        labelInicial.setVisible(false);
        label1.setVisible(false);
        label2.setVisible(false);

        this.animacion = new Timeline(new KeyFrame(Duration.millis(17), t -> {

            vistaAnidada.setTranslateX(vistaAnidada.getTranslateX() - 7);
            detectarColision();
        }));
        animacion.setCycleCount(Animation.INDEFINITE);
        animacion.play();
    }

    public void detectarColision() {
        if (vistaAnidada.getBoundsInParent().intersects(botonMenu.getBoundsInParent())) {
            vistaAnidada.setTranslateX(0);
            animacion.stop();
        }
    }

    @FXML
    public void panel1() {
        labelInicial.setVisible(false);
        label2.setVisible(false);
        label1.setTranslateX(+200);
        label1.setTranslateY(+200);
        label1.setVisible(true);
        botonVistaAnidada.setVisible(true);

    }

    @FXML
    public void panel2() {
        labelInicial.setVisible(false);
        label1.setVisible(false);
        botonVistaAnidada.setVisible(false);

        label2.setTranslateX(+200);
        label2.setTranslateY(+200);

        label2.setVisible(true);
    }
}