package com.unilim.iut.info.jpo_2023.model;


//Cette classe contient les informations sur Nunu, c'est maintenant à vous de la compléter afin
//que ce dernier puisse se déplacer.
public class Nunu {
    //position de Nunu
    private Position position;

    //direction de Nunu
    private Direction direction;

    //constructeur, c'est lorsque l'on appelle new Nunu() que ce constructeur est appelé, il permet
    //d'initialiser les attributs de la classe
    public Nunu(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    //méthode pour faire avancer le rover
    //Cette méthode est appelée lorsque l'on appelle la méthode avancer() sur un objet de type Nunu
    //elle va permettre de faire avancer Nunu d'une case dans la direction dans laquelle il est tourné
    public void avancer() {

        switch (this.direction) {
            case NORTH -> {
                this.position = new Position(this.position.x(), this.position.y() + 1);
            }
            case SOUTH -> {
                this.position = new Position(this.position.x(), this.position.y() - 1);
            }
            case EAST -> {
                this.position = new Position(this.position.x() + 1, this.position.y());
            }
            case WEST -> {
                this.position = new Position(this.position.x() - 1, this.position.y());
            }
        }
    }

    //méthode pour tourner à gauche, on considèrera que l'on tourne sur place
    public void tournerAGauche() {
        switch (this.direction) {
            case NORTH -> {
                this.direction = Direction.WEST;
            }
            case SOUTH -> {
                this.direction = Direction.EAST;
            }
            case EAST -> {
                this.direction = Direction.NORTH;
            }
            case WEST -> {
                this.direction = Direction.SOUTH;
            }
        }
    }


    //méthode pour tourner à droite on considèrera que l'on tourne sur place
    public void tournerADroite() {
        switch (this.direction) {
            case NORTH -> {
                this.direction = Direction.EAST;
            }
            case SOUTH -> {
                this.direction = Direction.WEST;
            }
            case EAST -> {
                this.direction = Direction.SOUTH;
            }
            case WEST -> {
                this.direction = Direction.NORTH;
            }
        }
    }

    //Cette méthode est un getter, elle permet de récupérer la position de Nunu, en respectant
    //le principe d'encapsulation, on ne peut pas modifier la position de Nunu depuis l'extérieur
    //de la classe
    public Position getPosition() {
        return this.position;
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
