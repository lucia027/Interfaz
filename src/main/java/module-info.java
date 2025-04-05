module org.example.interfaz {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.interfaz to javafx.fxml;
    exports org.example.interfaz;
    opens org.example.interfaz.controllers to javafx.fxml;
    exports org.example.interfaz.controllers;
}