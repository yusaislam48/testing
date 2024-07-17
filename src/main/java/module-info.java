module com.oop.tutorialproject.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.tutorialproject.demo to javafx.fxml;
    exports com.oop.tutorialproject.demo;
}