package OOP;

import java.util.Scanner;

public class Help {
	public static Scanner scn = new Scanner(System.in);
	static void help() {

    System.out.println("HELP");
    System.out.println("Andriy Boyko  Lab1");
    System.out.println(" ");
    System.out.println("Information about menu: ");
    System.out.println("1 - Enter data   (You should input some information)");
    System.out.println("2 - Show input   (You will see  input)");
    System.out.println("3 - Working out  (Program will be dividing strings into parts )");
    System.out.println("4 - Results      (Program will show results)");
    System.out.println("0 - Exit         (Program stop working)");
    System.out.println(" ");
    System.out.println("ComandLine arguments: ");
    System.out.println("-d (show additional inf during the work session)");
    System.out.println("-h (help menu)");
     
    while(true) {
        System.out.print("To continue press 0: ");
        byte b = scn.nextByte();
        if(b == 0)  break;
    }

	}}
