module com.myprogramms.dndforme {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.myprogramms.dndforme to javafx.fxml;
    exports com.myprogramms.dndforme;
}