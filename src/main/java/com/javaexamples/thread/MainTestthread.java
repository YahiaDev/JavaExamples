package com.javaexamples.thread;

public class MainTestthread {

	public static void main(String[] args) {
		try {
			TestThread t = new TestThread("A");
			TestThread t2 = new TestThread("  B");
			t.start();

			//Thread.sleep(1000);

			t2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
