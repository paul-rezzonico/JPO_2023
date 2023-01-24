package com.unilim.iut.info.jpo_2023;

import com.unilim.iut.info.jpo_2023.model.Direction;
import com.unilim.iut.info.jpo_2023.model.Nunu;
import com.unilim.iut.info.jpo_2023.model.Position;

public class Main {

    public static void main(String[] args) {

        //initialisation de la position de Nunu
        Position position = new Position(0, 0);

        //initialisation de la direction de Nunu
        Direction direction = Direction.NORTH;

        //initialisation de Nunu
        Nunu nunu = new Nunu(position, direction);

        //Implémenter ci dessous les instruction nécéssaire afin que nunu arrive à la position(20,11)
        //insipirez vous de la ligne suivante :
        nunu.afficher();    //cette ligne permet d'afficher la position et la direction de nunu
        nunu.avancer();     //cette ligne permet de faire avancer nunu d'une case dans la direction dans laquelle il est tourné
        nunu.afficher();

    }
}