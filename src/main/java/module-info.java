module main.javafxgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens main.javafxgui to javafx.fxml;
    exports main.javafxgui;
    exports main.javafxgui.algorithms;
    opens main.javafxgui.algorithms to javafx.fxml;
}