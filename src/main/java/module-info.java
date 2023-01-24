module com.unilim.iut.info.jpo_2023 {
    opens com.unilim.iut.info.jpo_2023 to javafx.fxml;
    exports com.unilim.iut.info.jpo_2023;
    exports com.unilim.iut.info.jpo_2023.model;
    opens com.unilim.iut.info.jpo_2023.model to javafx.fxml;
    exports com.unilim.iut.info.jpo_2023.view;
    opens com.unilim.iut.info.jpo_2023.view to javafx.fxml;

}