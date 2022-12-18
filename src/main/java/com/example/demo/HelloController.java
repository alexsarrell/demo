package com.example.demo;

import com.example.demo.factories.FenderFactory;
import com.example.demo.factories.GibsonFactory;
import com.example.demo.factories.IbanezFactory;
import com.example.demo.factories.YamahaFactory;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    GuitarFactory factory;
    ArrayList<String> backlog = new ArrayList<>();
    public Button produce;
    public ListView<String> guitar;
    public ComboBox<String> model;
    public ComboBox<String> fabric;
    private void addBackLog(String fabric, String type, Guitar guitar) {
        String item = "Гитара с фабрики " +
                fabric +
                " типа " +
                type +
                " модель " +
                guitar.name +
                " произведена успешно ";
        backlog.add(item);
        this.guitar.getItems().add(item);
    }
    public void produceClick() {
        String guitarFabric = fabric.getSelectionModel().getSelectedItem();
        String guitarModel = model.getSelectionModel().getSelectedItem();
        System.out.println(guitarFabric);
        switch (guitarFabric) {
            case "YAMAHA" -> {
                factory = new YamahaFactory();
                createGuitar(guitarFabric, guitarModel);
            }
            case "GIBSON" -> {
                factory = new GibsonFactory();
                createGuitar(guitarFabric, guitarModel);
            }
            case "FENDER" -> {
                factory = new FenderFactory();
                createGuitar(guitarFabric, guitarModel);
            }
            case "IBANEZ" -> {
                factory = new IbanezFactory();
                createGuitar(guitarFabric, guitarModel);
            }
        }
    }

    private void createGuitar(String guitarFabric, String guitarModel) {
        Guitar guitar = null;
        switch (guitarModel) {
            case "BAS" -> guitar = factory.createBas();
            case "SOLO" -> guitar = factory.createSolo();
            case "RHYTHM" -> guitar = factory.createRhythm();
        }
        if (guitar == null) return;
        addBackLog(guitarFabric, guitarModel, guitar);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fabric.getItems().add(Factories.YAMAHA.name());
        fabric.getItems().add(Factories.GIBSON.name());
        fabric.getItems().add(Factories.IBANEZ.name());
        fabric.getItems().add(Factories.FENDER.name());
        model.getItems().add(GuitarType.SOLO.name());
        model.getItems().add(GuitarType.RHYTHM.name());
        model.getItems().add(GuitarType.BAS.name());
    }
}