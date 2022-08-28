module com.example.repasociclo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repasociclo3 to javafx.fxml;
    exports com.example.repasociclo3;
}