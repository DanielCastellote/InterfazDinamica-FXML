package com.example.interfazdinamicafxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.time.format.TextStyle;

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

    Persona persona1 = new Persona("Javier","javi@gmail","DAM");
    Persona persona2 = new Persona("Daniel","dani@gmail","DAM");
    Persona persona3 = new Persona("Mario","mario@gmail","DAW");

    public void volver(){
        anchorPane.setTranslateX(+1500);
    }

    public void cargarPersona1(){

        nombre.setText(persona1.getNombre());
        correo.setText(persona1.getCorreo());
        curso.setText(persona1.getCurso());


    }
    public void cargarPersona2(){

        nombre.setText(persona2.getNombre());
        correo.setText(persona2.getCorreo());
        curso.setText(persona2.getCurso());

    }
    public void cargarPersona3(){

        nombre.setText(persona3.getNombre());
        correo.setText(persona3.getCorreo());
        curso.setText(persona3.getCurso());

    }

}
