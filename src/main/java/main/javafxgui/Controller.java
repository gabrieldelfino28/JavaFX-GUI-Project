package main.javafxgui;
/*
 * This Class controls both home and decisionScene fxml files.
 */

import javafx.animation.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.web.*;
import javafx.util.Duration;
import main.javafxgui.algorithms.ArraysList;
import main.javafxgui.algorithms.DecisionList;
import main.javafxgui.algorithms.LoopList;
import main.javafxgui.algorithms.RecursiveList;

import java.util.ResourceBundle;
import java.io.IOException;
import java.net.URL;

public class Controller implements Initializable {

    @FXML
    public Button returnB = new Button();
    @FXML
    public Button okB;

    @FXML
    private TextField InputField;
    private Stage stage;
    private Scene scene;

    URL path1 = this.getClass().getResource("/Web/batch1.html");
    URL path2 = this.getClass().getResource("/Web/batch2.html");
    URL path3 = this.getClass().getResource("/Web/batch3.html");
    URL path4 = this.getClass().getResource("/Web/batch4.html");

    WebEngine DecisionEngine;
    WebEngine LoopEngine;
    WebEngine ArrayEngine;
    WebEngine RecursiveEngine;

    @FXML
    public WebView webView1 = new WebView();
    public WebView webView2 = new WebView();
    public WebView webView3 = new WebView();
    public WebView webView4 = new WebView();

    @Override
    public void initialize(URL url, ResourceBundle arg1) {
        //Loading the HTML file in each scene.fxml
        LoopEngine = webView2.getEngine();
        LoopEngine.load(path2.toString());

        DecisionEngine = webView1.getEngine();
        DecisionEngine.load(path1.toString());

        webView1.translateXProperty();
        webView2.translateXProperty();

        /*
         * Animations and Return_Button Functionality
         */

        TranslateTransition translate = new TranslateTransition(Duration.seconds(0.5));
        TranslateTransition translate2 = new TranslateTransition(Duration.seconds(0.5));
        TranslateTransition buttonTransition = new TranslateTransition(Duration.seconds(0.5));
        TranslateTransition fieldTransition = new TranslateTransition(Duration.seconds(0.5));

        FadeTransition fade = new FadeTransition(Duration.millis(450));
        FadeTransition fade1 = new FadeTransition(Duration.millis(450));
        FadeTransition fade2 = new FadeTransition(Duration.millis(450));
        FadeTransition fade3 = new FadeTransition(Duration.millis(450));

        //returnButton
        fade3.setNode(returnB);
        fade3.setFromValue(0);
        fade3.setToValue(1);
        fade3.play();

        fade1.setNode(InputField);
        fade1.setFromValue(0);
        fade1.setToValue(1);
        fade1.play();

        fade2.setNode(okB);
        fade2.setFromValue(0);
        fade2.setToValue(1);
        fade2.play();

        fade.setNode(webView1);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();

        translate.setNode(webView1);
        translate.setByX(+600);
        translate.play();

        translate2.setNode(webView2);
        translate2.setByX(+600);
        translate2.play();

        buttonTransition.setNode(okB);
        buttonTransition.setByX(+600);
        buttonTransition.play();

        fieldTransition.setNode(InputField);
        fieldTransition.setByX(+600);
        fieldTransition.play();

        //Return Button
        returnB.setOnMouseClicked(event -> {

            fade.setFromValue(1);
            fade.setToValue(0);
            fade1.setFromValue(1);
            fade1.setToValue(0);
            fade2.setFromValue(1);
            fade2.setToValue(0);
            fade3.setFromValue(1);
            fade3.setToValue(0);

            fade.play();
            fade1.play();
            fade2.play();
            fade3.play();

            translate.setByX(-600);
            translate2.setByX(-600);
            buttonTransition.setByX(-600);
            fieldTransition.setByX(-600);

            translate2.play();
            translate.play();
            buttonTransition.play();
            fieldTransition.play();

            returnB.setVisible(false);

        });

    }

    public void DecisionScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("decisionScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void LoopScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loopScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ArrayScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loopScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void RecursiveScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loopScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ATMScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loopScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ATM(){
        ArraysList batch = new ArraysList();
    }

    @FXML
    protected void ExitDialog() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        FadeTransition transition = new FadeTransition();
        transition.setDuration(Duration.millis(300));
        transition.setNode(alert.getDialogPane());
        transition.setFromValue(0);
        transition.setToValue(1);
        transition.play();

        ButtonType yesB = new ButtonType("Exit", ButtonBar.ButtonData.YES);
        ButtonType cancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getDialogPane().getButtonTypes().remove(ButtonType.OK);
        alert.getDialogPane().getButtonTypes().remove(ButtonType.CANCEL);
        alert.getDialogPane().getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        alert.getDialogPane().getStyleClass().add("dialog");//adding css to the alert dialog
        alert.setTitle("Confirmation");
        alert.setHeaderText("You're about to exit the app!");
        alert.initStyle(StageStyle.TRANSPARENT);
        alert.getDialogPane().getButtonTypes().add(yesB);
        alert.getDialogPane().getButtonTypes().add(cancel);
        alert.setContentText("Do you indeed wish to exit the application?");
        alert.setGraphic(new ImageView(this.getClass().getResource("/icon_question.png").toString()));
        alert.showAndWait();
        ButtonType Result = alert.getResult();
        ButtonBar.ButtonData button = Result.getButtonData();

        if (button == ButtonBar.ButtonData.YES) {
            Platform.exit();
        }
    }

    @FXML
    public void OkButton() {
        DecisionList batch = new DecisionList();
        String text = InputField.getText();
        batch.main(text);
    }

    @FXML
    public void OkButton2() {
        LoopList batch = new LoopList();
        String text = InputField.getText();
        batch.main(text);
    }

    @FXML
    public void OkButton3() {
        ArraysList batch = new ArraysList();
        String text = InputField.getText();
        //batch.main(text);
    }

    @FXML
    public void OkButton4() {
        RecursiveList batch = new RecursiveList();
        String text = InputField.getText();
        //batch.main(text);
    }
}