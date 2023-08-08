package main.javafxgui;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import java.io.IOException;
import java.util.Objects;

public class HomeApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader root = new FXMLLoader(HomeApp.class.getResource("home.fxml"));

        Scene scene = new Scene(root.load());

        stage.setTitle("Java Algorithms");
        stage.getIcons().add(new Image(Objects.requireNonNull(HomeApp.class.getResourceAsStream("/icon.png"))));
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
        FadeTransition transition = new FadeTransition();
        transition.setDuration(Duration.millis(650));
        transition.setNode(scene.getRoot());
        transition.setFromValue(0.1);
        transition.setToValue(10);
        transition.play();

    }

    public static void main(String[] args) {
        launch(args);
    }
}