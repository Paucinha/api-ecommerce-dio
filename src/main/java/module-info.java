module com.example.ecommercecheckoutapi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ecommercecheckoutapi to javafx.fxml;
    exports com.example.ecommercecheckoutapi;
}