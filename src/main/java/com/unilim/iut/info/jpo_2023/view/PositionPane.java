package com.unilim.iut.info.jpo_2023.view;

import com.unilim.iut.info.jpo_2023.model.Nunu;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class PositionPane extends HBox {

    private TextArea position;
    private TextArea direction;
    private Nunu rover;
    public PositionPane(Nunu rover) {
        this.rover = rover;
        this.position = new TextArea();
        this.position.setText("La position du rover est : " + this.rover.getPosition().x() + ',' + this.rover.getPosition().y());
        this.direction = new TextArea();
        this.direction.setText("La direction du rover est : " + this.rover.getDirection().toString());
        this.getChildren().add(this.position);

    }
}
