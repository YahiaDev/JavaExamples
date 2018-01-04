package com.javaexamples.Arbre;

public class ArbreBinaire {

	private int val;
	private ArbreBinaire filsGauche;
	private ArbreBinaire filsDroite;

	public ArbreBinaire(int val, ArbreBinaire filsGauche, ArbreBinaire filDroite) {
		super();
		this.val = val;
		this.filsGauche = filsGauche;
		this.filsDroite = filDroite;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ArbreBinaire getFilsGauche() {
		return filsGauche;
	}

	public void setFilsGauche(ArbreBinaire filsGauche) {
		this.filsGauche = filsGauche;
	}

	public ArbreBinaire getFilsDroite() {
		return filsDroite;
	}

	public void setFilsDroite(ArbreBinaire filsDroite) {
		this.filsDroite = filsDroite;
	}

	public ArbreBinaire addNewEntrie(ArbreBinaire tree, ArbreBinaire newVal) {
		if (tree.getFilsDroite() == null && tree.getFilsGauche() == null) {
			if (tree.getVal() < newVal.getVal()) {
				tree.setFilsDroite(newVal);
			} else {
				tree.setFilsGauche(newVal);
			}
			return tree;
		}
		else{
			/*if(newVal.getVal()<=tree.getVal()){
				ArbreBinaire a =  addNewEntrie(tree.getFilsGauche(),newVal));
			}*/
			return null;
			
		}
	}
}
