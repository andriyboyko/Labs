package lab_5;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import java.util.Scanner;

import lab_4.LinkedList;
class Menu
	{
	int k;
	public int execute(Scanner in)
	{
		System.out.println("Choose what you want to do:");
		System.out.println("1. Create new person");
		System.out.println("2. Change name of the person");
		System.out.println("3. Change date of the person");
		System.out.println("4. Change numbers");
		System.out.println("5. Change adress");
		System.out.println("6. Change regdate");
		System.out.println("7. name");
		System.out.println("8. date");
		System.out.println("9. number");
		System.out.println("10. adress");
		System.out.println("11. regdate");
		System.out.println("12. Print to the file");
		System.out.println("13. Get from the file");
		System.out.println("14. Choose the person");
		System.out.println("15 . Finish the program");
		k = in.nextInt();
		
		return k;
	}
	
	}
public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<AdressBook> list = new LinkedList<AdressBook>();
		int user = 0;
		Scanner in = new Scanner(System.in);
		Scanner on = new Scanner(System.in);
		LinkedList<Integer> temp=new LinkedList<>();
		LinkedList<Integer> temp1=new LinkedList<>();
		Menu main = new Menu();
		
		while(true)
		{
		int k = main.execute(in);
		
		switch (k)
		{
		case 1 :
			list.add(new AdressBook());
		break;
		
		case 2 :
			System.out.println("Enter the name : ");
				list.get(user).setName(on.nextLine());	
		break;
		
		case 3 :
			System.out.println("Enter the date : ");
				list.get(user).setDate(on.nextLine());	
		break;
		
		case 4 :
			System.out.println("Enter phone number : ");
			int t;
				while(true) {
				t=in.nextInt();
				if(t==0)
				{
					break;
				}
				else {
					temp.add(t);
			}}
				list.get(user).setNumbers(temp);
				break;
				
		
		case 5 : 
			System.out.println("Enter adress : ");
			list.get(user).setAdress(on.nextLine());
		break;
		
		case 6 :
			System.out.println("Enter regdate : ");
			list.get(user).setRegdate(on.nextLine());
		break;
		
		
		case 7: 
			System.out.println(list.get(user).getname());
		break;
		
		case 8 : 
			System.out.println((list.get(user).getNumbers()));
		break;
		
		case 9 : 
			System.out.println(list.get(user).getDate());
		break;
		
		case 10 :
			System.out.println(list.get(user).getAdress());
		break;
		
		case 11 : 
			System.out.println(list.get(user).getRegdate());
		break;
		case 12:
			XMLEncoder encoder;
			try {
				encoder = new XMLEncoder(
				           new BufferedOutputStream(
				           new FileOutputStream(PathGetter.getPath(in).toString())));
				encoder.writeObject(list);
				encoder.close(); 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		break;
		case 13 :
			XMLDecoder decoder = new XMLDecoder(
				    new BufferedInputStream(
				    new FileInputStream(PathGetter.getPath(in).toString())));

				list =(LinkedList<AdressBook>) decoder.readObject();
				decoder.close();
				
				break;
		
		case 14 : 
			System.out.println("Choose the person from 0 to "+(list.size()-1));
			user = in.nextInt();
		break;
		case 15 : 
			in.close();
			on.close();
			return;
		
		}
		}
	
}}