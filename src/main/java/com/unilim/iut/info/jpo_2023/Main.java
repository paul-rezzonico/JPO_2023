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

        //Implémenter ci-dessous les instructions nécéssaires afin que Nunu arrive à la position (20, 11)
        //inspirez-vous de la ligne suivante :
        nunu.afficher();    //cette ligne permet d'afficher la position et la direction de Nunu
        nunu.avancer();     //cette ligne permet de faire avancer Nunu d'une case dans la direction dans laquelle il est tourné
        nunu.afficher();

    }
}