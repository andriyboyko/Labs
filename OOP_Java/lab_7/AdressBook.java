package lab_7;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AdressBook{
	private String name;
	private String date;
	private ArrayList<Integer> numbers;
	private String adress;
	private String regdate;
	Scanner scn=new Scanner(System.in);
	public AdressBook(String name)
	{
		this.name = name;
	}
	public AdressBook()
	{	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	public void setNumbers(ArrayList<Integer> value ) {
		
		numbers=value;
	}
	
	public void setAdress(String adress)
	{
		this.adress = adress;
	}
	public void setRegdate(String regdate)
	{
		this.regdate = regdate;
	}
	
	 
	public String getname()
	 {
		 return name;
	 }
	 public String getDate()
	 {
		 return date;
	 }
	 
	 public String getAdress()
	 {
		return adress;
	 }
	 public String getRegdate()
	 {
		 return regdate;
	 }
	 public ArrayList<Integer> getNumbers()
	 {
		return numbers;
	 }
}

	 
	 
