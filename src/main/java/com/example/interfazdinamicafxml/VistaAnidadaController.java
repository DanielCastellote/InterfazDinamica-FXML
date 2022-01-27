package com.example.interfazdinamicafxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class VistaAnidadaController {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Text nombre;
    @FXML
    private Text correo;
    @FXML
    private Text curso;

    @FXML
    private Button botonVistaAnidada1;

    @FXML
    private ImageView imagenDato;

    @FXML
    private Button botonVolver;


    public void volver(){
        anchorPane.setTranslateX(+1500);
    }

    public void cargarPersona1(String nombre1,String correo1, String curso1){

        nombre.setText(nombre1);
        correo.setText(correo1);
        curso.setText(curso1);

    }

}
