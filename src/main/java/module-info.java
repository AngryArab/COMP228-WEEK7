module com.example.comp228week7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp228week7 to javafx.fxml;
    exports com.example.comp228week7;
}