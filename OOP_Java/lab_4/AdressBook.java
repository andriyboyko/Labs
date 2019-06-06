package lab_4;



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
	public AdressBook(){ }
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
    public void setNumbers(LinkedList<Integer> value) {
		
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
	 public LinkedList<Integer> getNumbers()
	 {
		 return numbers;
	 }
	
		
	
}