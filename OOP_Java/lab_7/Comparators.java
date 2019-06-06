package lab_7;

import java.util.Comparator;

public class Comparators { }
	


	class compByName implements Comparator<AdressBook>{
		public int compare(AdressBook a, AdressBook b){
			return a.getname().compareTo(b.getname());
		}
	}

