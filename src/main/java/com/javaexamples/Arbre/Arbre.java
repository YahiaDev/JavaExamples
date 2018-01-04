package com.javaexamples.Arbre;

import java.util.List;

public class Arbre {

	private int val;
	private List<Arbre> fils;

	public Arbre(int val, List<Arbre> fils) {
		super();
		this.val = val;
		this.fils = fils;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public List<Arbre> getFils() {
		return fils;
	}

	public void setFils(List<Arbre> fils) {
		this.fils = fils;
	}

	public int getSize(Arbre arbre) {
		int size = 1;
		if (arbre.getFils() != null)
			for (Arbre a : arbre.getFils()) {
				size += arbre.getSize(a);
			}
		return size;
	}

	public int getHeight(Arbre arbre) {
		int height = 1;
		int heightF = 1;
		if (arbre.getFils() == null) {
			return 1;
		} else {
			for (Arbre a : arbre.getFils()) {
				heightF += getHeight(a);
				height = height < heightF ? heightF : height;
			}
		}
		return height;
	}

	public void displayTree(Arbre arbre, String sep) {
		System.out.println(sep + arbre.getVal());
		if (arbre.getFils() != null) {
			for (Arbre a : arbre.getFils()) {
				displayTree(a, sep + sep);
			}
		}
	}

}
