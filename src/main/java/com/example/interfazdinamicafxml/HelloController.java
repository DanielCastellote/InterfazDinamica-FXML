package com.example.interfazdinamicafxml;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Duration;


public class HelloController {

    @FXML
    public AnchorPane vistaAnidada;
    @FXML
    private VBox vBox;
    @FXML
    private Button botonMenu;
    @FXML
    private Button botonVistaAnidada1;
    @FXML
    private Button botonVistaAnidada2;
    @FXML
    private Button botonVistaAnidada3;

    @FXML
    private VistaAnidadaController vistaAnidadaController;

    private Animation animacion;

    Persona persona1 = new Persona("Javier","javi@gmail","DAM");
    Persona persona2 = new Persona("Daniel","dani@gmail","DAM");
    Persona persona3 = new Persona("Mario","mario@gmail","DAW");



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

        botonVistaAnidada1.setVisible(false);
        botonVistaAnidada2.setVisible(false);
        botonVistaAnidada3.setVisible(false);

        cargarPersonas();

        this.animacion = new Timeline(new KeyFrame(Duration.millis(17), t -> {

            vistaAnidada.setTranslateX(vistaAnidada.getTranslateX() - 8);
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

    public void cargarPersonas(){

        //vistaAnidadaController = new VistaAnidadaController();
        //vistaAnidadaController.cargarPersona1(persona1.getNombre(),persona1.getCorreo(),persona1.getCurso());
        //nombre.setText(persona1.getNombre());

    }

    @FXML
    public void persona1() {

        botonVistaAnidada1.setVisible(true);
        botonVistaAnidada2.setVisible(false);
        botonVistaAnidada3.setVisible(false);
        botonVistaAnidada1.setText("Cargar datos persona 1");

    }

    @FXML
    public void persona2() {

        botonVistaAnidada2.setVisible(true);
        botonVistaAnidada1.setVisible(false);
        botonVistaAnidada3.setVisible(false);
        botonVistaAnidada2.setText("Cargar datos persona 2");
    }

    @FXML
    public void persona3() {

        botonVistaAnidada3.setVisible(true);
        botonVistaAnidada1.setVisible(false);
        botonVistaAnidada2.setVisible(false);
        botonVistaAnidada3.setText("Cargar datos persona 3");
    }

    @FXML
    public void salir(){

        System.exit(0);
    }


}