package com.unilim.iut.info.jpo_2023.model;


//Cette classe contient les informations sur Nunu, c'est maintenant à vous de la compléter afin
//que ce dernier puisse se déplacer.
public class Nunu {
    //position de Nunu
    //TODO: ajouter l'attribut nécessaire

    //direction de Nunu
    private Direction direction;

    //constructeur, c'est lorsque l'on appelle new Nunu() que ce constructeur est appelé, il permet
    //d'initialiser les attributs de la classe
    public Nunu(Position position, Direction direction) {
        //initialisation de la position du rover

        //initialisation de la direction du rover

    }

    //méthode pour faire avancer le rover
    //Cette méthode est appelée lorsque l'on appelle la méthode avancer() sur un objet de type Nunu
    //elle va permettre de faire avancer Nunu d'une case dans la direction dans laquelle il est tourné
    public void avancer() {

        switch (this.direction) {
            case NORTH -> {
                //TODO
                //Vos instructions doivent ressembler à ceci :
                //this.position = new Position(this.position.x(), this.position.y() + 1);
            }
            case SOUTH -> {
                //TODO
            }
            case EAST -> {
                //TODO
            }
            case WEST -> {
                //TODO
            }
        }
    }

    //méthode pour tourner à gauche, on considèrera que l'on tourne sur place
    public void tournerAGauche() {
        //Todo
    }


    //méthode pour tourner à droite on considèrera que l'on tourne sur place
    public void tournerADroite() {
        //Todo
    }

    //Cette méthode est un getteur, elle permet de récupérer la position de Nunu, en respectant
    //le principe d'encapsulation, on ne peut pas modifier la position de Nunu depuis l'extérieur
    //de la classe
    public Position getPosition() {
        //Todo
        return null;
    }

    //getter pour la direction de Nunu
    public Direction getDirection() {
        return this.direction;
    }

    public void afficher() {
        System.out.println("La position de Nunu est : " + this.getPosition().x() + ',' + this.getPosition().y());
        System.out.println("La direction de Nunu est : " + this.getDirection().toString());
    }

}
