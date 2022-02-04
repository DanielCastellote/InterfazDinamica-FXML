package com.example.interfazdinamicafxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        Locale localizacion = new Locale("es", "ES");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.example.interfazdinamicafxml.internacionalizacion.strings", localizacion);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"),resourceBundle);

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        scene.getStylesheets().add("com/example/interfazdinamicafxml/estilo.css");
        stage.setTitle("Interfaz Dinamica");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}