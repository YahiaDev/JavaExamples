package com.javaexamples.thread;

public class MainTestthread {

	public static void main(String[] args) {
		//try {
			CompteBancaire cp = new CompteBancaire();
			
			Thread th1 = new Thread(new RunnableTestThread("th1", cp));
			Thread th2 = new Thread(new RunnableTestThread("th2", cp));
			
			th1.start();
			th2.start();
//			TestThread t = new TestThread("A");
//			TestThread t2 = new TestThread("  B");
//			t.start();

			//Thread.sleep(1000);

//			t2.start();
	//	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}

	}

}
