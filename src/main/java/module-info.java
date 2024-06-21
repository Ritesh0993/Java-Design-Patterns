module com.ritesh.designpatterns {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.ritesh.designpatterns to javafx.fxml;
    exports com.ritesh.designpatterns;
}