package com.example.interfazdinamicafxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class VistaAnidadaController {
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ImageView imagenDato;

    @FXML
    private Button botonVolver;

    Persona persona1 = new Persona("Javier","javi@gmail","DAM");
    Persona persona2 = new Persona("Daniel","dani@gmail","DAM");
    Persona persona3 = new Persona("Mario","mario@gmail","DAW");


    public void volver(){
        anchorPane.setTranslateX(+1500);
    }

    public void cargarPersona(){


    }

}
