package lab_5;

import lab_4.LinkedList;

public class AdressBook{

	private String name;
	private String date;
	private LinkedList<Integer> numbers;
	private String adress;
	private String regdate;
	
	public AdressBook(String name)
	{
		this.name = name;
	}
	public AdressBook()
	{}
	
	public void setName(String name)
	{if(Check.nameCheck(name)) {
		this.name = name;}
	else {
	System.out.println("Wrong name");
	}
	}
	
	
	public void setDate(String date)
	{
		if(Check.regDateCheck(date)) {
		this.date = date;}
		else {
		System.out.println("Wrong date");
		}
	}
	public void setNumbers(LinkedList<Integer> temp) {
		
		this.numbers=temp;
		
	
	}
	
	public void setAdress(String adress)
	{
		if(Check.adressCheck(adress))
		this.adress = adress;
		else System.out.println("Wrong adress");
	}
	public void setRegdate(String regdate)
	{
		if(Check.regDateCheck(regdate)) 
		this.regdate = regdate;
		else 
			System.out.println("Wrong date");
		
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
	 public LinkedList<Integer> getNumbers()
	 {
		 return numbers;
	 }
	
		
	}
	 
