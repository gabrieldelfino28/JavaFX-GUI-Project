package main.javafxgui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.javafxgui.algorithms.LoopList;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class webController extends Controller implements Initializable {
    @FXML
    private final WebView webView = new WebView();
    private Stage stage;
    private Scene scene;
    private Parent root;
    WebEngine engine;
    URL path = this.getClass().getResource("/Web/batch2.html");

    public void initialize(URL arg0, ResourceBundle arg1) {
        engine = webView.getEngine();
        engine.load(path.toString());
    }

    public void DecisionScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("decisionScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void ArrayScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("decisionScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void RecursiveScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("decisionScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void HomeScene(javafx.event.ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private TextField InputField;

    public void OkButton() {
        LoopList batch = new LoopList();
        String text = InputField.getText();
        batch.main(text);
    }

    @FXML
    protected void ExitDialog() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType yesB = new ButtonType("Yes", ButtonBar.ButtonData.YES);
        ButtonType noB = new ButtonType("No", ButtonBar.ButtonData.NO);
        alert.getDialogPane().getButtonTypes().remove(ButtonType.OK);
        alert.setTitle("Confirmation");
        alert.setHeaderText("You're about to exit the app!");
        alert.initStyle(StageStyle.TRANSPARENT);
        alert.getDialogPane().getButtonTypes().add(yesB);
        alert.getDialogPane().getButtonTypes().add(noB);
        alert.setContentText("Do you indeed wish to exit the application?");
        alert.setGraphic(new ImageView(this.getClass().getResource("/icon_question.png").toString()));
        alert.showAndWait();
        ButtonType Result = alert.getResult();
        ButtonBar.ButtonData button = Result.getButtonData();

        if (button == ButtonBar.ButtonData.YES) {
            Platform.exit();
        }
    }

    public void Generic() {
        //Generic Function with nothing for buttons without function
        System.out.println("Already in the current page");
    }
}

