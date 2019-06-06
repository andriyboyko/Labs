package lab_6;

import java.util.ArrayList;

public class Linear {
	public ArrayList<Integer> begin(int n) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n ; i++) {
			long s = System.nanoTime();
			
			runFunc();
			
			l.add( (int) Math.round((System.nanoTime() - s)/10000000) );
		}
		return l;
	}
	
	private void runFunc() {	  //To short the main
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println("m  "+i);
			try { Thread.sleep(10);
			} catch (InterruptedException e) { }
		}
		
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println("t1 " + i);
			try { Thread.sleep(10);
			} catch (InterruptedException e) { }
		}
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println("l1 " + i);
			try { Thread.sleep(10);
			} catch (InterruptedException e) { }
		}
		
		
		
	}
	
	
}