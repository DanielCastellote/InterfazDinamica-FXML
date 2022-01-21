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


    public void volver(){
        anchorPane.setTranslateX(+1500);
    }
}
