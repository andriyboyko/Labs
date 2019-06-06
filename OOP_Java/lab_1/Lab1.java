package OOP;
 
import java.util.LinkedList;
import java.util.Scanner;
 
public class Lab1 {
    public static Scanner scn = new Scanner(System.in);
    public static LinkedList<String> list = new LinkedList<>();
    public static double b=0;
    public static double a = 0;
    public static boolean d = false;
    
     
    public static void main(String[] args) {
       
         
        comLine(args);
        m.menu();
        
        helper();
         
    }
     
    public static Menu m= new Menu(); 
    	

    
    
     
    private static void comLine(String args[]) {
        if(args.length > 0) {
            if(args[0].compareTo("-h") == 0)    h.help();
            if(args[0].compareTo("-d") == 0) d = true;
        }
    }
     
    public static  Help h= new Help();
    
     
    private static void helper() {
        while(true) {
            System.out.println(" ");
            System.out.print("What to do: ");
            int choise = scn.nextInt();
            if(choise == 1) enterStrings();
            if(choise == 2) System.out.println(list);
            if(choise == 3) WorkingOut();
            if(choise == 4) Results();
            
             
            if(choise == 0) break;
        }
    }
 
    private static void enterStrings() {
    	String str1="0";
    	String str=new String();
    	
        System.out.print("Enter smth: ");
        
      while(true)
       {
             str= scn.nextLine();
             b=b+str.length();
             
             if(str.equals(str1)) {
            	break;
             }
             else {
             list.add(str);
             
             }
       
            
       }
         
    }
        private static void WorkingOut() {
        if(list == null)   enterStrings();
        a=(b-1)/(list.size()-1);
     
       if(d) {
    	   System.out.println("Average length of symbols is: "+a+"");
       }
        
    }
     
    
    private static void Results() {
    	
    	System.out.println("First part: ");
        	 for(int i=1;i<list.size();i++)
        	{ 
        	 if(list.get(i).length() <= a) {
             	System.out.println(""+list.get(i)+"");
        	 }}
    
    System.out.println("Second part: ");
    for(int t=1;t<list.size();t++)
	{ 
    if(list.get(t).length() > a) {
     	System.out.println(""+list.get(t)+"");
	 }}
}}
        	