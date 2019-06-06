package lab_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static MultiThread multi = new MultiThread();
	static Linear linear = new Linear();
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter count of rounds: ");
		int n = scn.nextInt();	scn.close();
		
		ArrayList<Integer> mList;
		ArrayList<Integer> lList;
		
		long mStart = System.nanoTime();
		mList = multi.begin(n);
		long mFInish = System.nanoTime();
		
		long lStart = System.nanoTime();
		lList = linear.begin(n);
		long lFInish = System.nanoTime();
		
		double m = (double)Math.round((mFInish-mStart)/10000000)/100;
		double l = (double)Math.round((lFInish-lStart)/10000000)/100;
		
		System.out.println("MultiThread time is: "+ m+" mid time is: "+m/n);
		System.out.println("Linear run time is: " + l+" mid time is: "+l/n);
		
		if(args.length > 0)	
			if(args[0].compareTo("-d") == 0) {
				System.out.println();
				addInfo(mList , lList);
			}
	}

	private static void addInfo(ArrayList<Integer> m, ArrayList<Integer> l) {
		for(int i : m)
			System.out.print((double)i/100 + "sec ");
		
		System.out.println();
		
		for(int i : l)
			System.out.print((double)i/100 + "sec ");
	}
}