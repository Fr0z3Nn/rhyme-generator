package ru.rhyme.generator.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.rhyme.generator.StartMenu;
import ru.rhyme.generator.parser.RhymeParser;

import java.applet.AppletContext;

public class StartMenuController {
    @FXML
    public Button searchButton;
    @FXML
    public TextField textInput;
    @FXML
    public TextArea resultArea;
    @FXML
    public Text myGitHub;
    @FXML
    public void initialize() {
        searchButton.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            RhymeParser rhymeParser = new RhymeParser();
            String textToParse = textInput.getText();
            if(textToParse.equals("")){
                resultArea.setText("Введите слово");
            }else{
                rhymeParser.parse(textToParse);
                resultArea.setText(rhymeParser.getResult());
            }
        });
    }
}

