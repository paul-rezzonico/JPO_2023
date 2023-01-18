module com.unilim.iut.info.jpo_2023 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.unilim.iut.info.jpo_2023 to javafx.fxml;
    exports com.unilim.iut.info.jpo_2023;
}