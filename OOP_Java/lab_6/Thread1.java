package lab_6;

public class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println("t1 " + i);
			try {
				sleep(10);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}