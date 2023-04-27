module com.example.demofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.demofx to javafx.fxml;
    exports com.example.demofx;
}