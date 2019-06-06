package lab_6;

import java.util.ArrayList;

public class MultiThread {
	static Thread1 t1;
	static Thread2 t2;
	static Thread3 t3;
	static Thread4 t4;
	static Thread5 t5;
	public ArrayList<Integer> begin(int n) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n ; i++) {	//Run n times
			long s = System.nanoTime();
			
			runFunc();
			check();
			
			l.add( (int) Math.round((System.nanoTime() - s)/10000000) );
		}
		return l;
	}

	private void runFunc() {	  //To short the main
		t1 = new Thread1();
		t1.start();
		
		t2 = new Thread2();
		t2.start();
		
		/*t3=new Thread3();
		t3.start();
		
		t4=new Thread4();
		t4.start();
		t5=new Thread5();
		t5.start();*/
		for(int i = 1 ; i <= 100 ; i++) {
			try { Thread.sleep(10);
			} catch (InterruptedException e) { }
			System.out.println("m  "+i);
		}
	}

	private void check() {	//If alive - continue		
		if(t1.isAlive()) {
			try {
				t1.join();
			} catch (InterruptedException e) { }
		}
		if(t2.isAlive()) {
			try {
				t2.join();
			} catch (InterruptedException e) { }
		}
		
	}
}