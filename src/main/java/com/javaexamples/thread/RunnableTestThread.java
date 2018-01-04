package com.javaexamples.thread;

public class RunnableTestThread implements Runnable {

	private String name;
	private CompteBancaire cp;

	public RunnableTestThread(String name, CompteBancaire cp) {
		this.name = name;
		this.cp = cp;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			this.cp.retrerCompte(i);
			System.out.println("retrait effectuer par " + this.name);
		}

	}

}
