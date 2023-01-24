package com.unilim.iut.info.jpo_2023.model;

public class Position {

	//attributs
	private final Integer x;
	private final Integer y;

	//constructeur
	public Position (Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	//méthodes

	//guetter pour x
	public Integer x() {
		//Cette méthode retourne la valeur de l'attribut x
		return this.x;
	}

	//guetter pour y
	public Integer y() {
		//Cette méthode retourne la valeur de l'attribut y
		return this.y;
	}
}
