package com.javaexamples.thread;

public class CompteBancaire {

	private int solde;

	public CompteBancaire() {
		solde = 100;
	}

	public void retrerCompte(int solde) {
		if (this.solde < 0) {
			System.out.println("vous ete à decouvert");
		}
		this.solde -= solde;
		System.out.println("votre solde est " + this.solde);

	}

}
