package lab_2;

import java.util.ArrayList;
import java.lang.Iterable;
import java.util.Iterator;
import java.io.Serializable;

public class Container implements Iterable<String> , Serializable {
	private static final long serialVersionUID = 1L;
	MyList<String> str = new MyList<String>();
	Container()
	{
		
	}
	Container(String input)
	{

		String[] inputArr = input.split(" ");
		for(int i = 0 ; i < inputArr.length; i++)
		{
			str.add(inputArr[i]);
		}
	}
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		for(int i = 0 ; i< str.size(); i++)
		{
			if(i == 0)
				builder.append(str.get(i));
			else
			builder.append(" ").append(str.get(i));

		}
		
		return builder.toString();
	}
	
	public String get(int possition)
	{
		return str.get(possition);
	}
	public void add(String string)
	{
		str.add(string);
	}
	
	public void clear()
	{
		str = new MyList<String>();
	}
	
	boolean remove(String string)
	{
		for(int i = 0 ; i < str.size(); i++)
		{
			if(str.get(i).equals(string))
			{
				str.delete(i);
				return true;
			}
		}
		return false;
	}
	
	Object[] toArray()
	{
		String[] string = new String[str.size()];
		for(int i = 0 ; i < str.size(); i++)
			string[i] = str.get(i);
		
		return string;
	}
	
	int size()
	{
		return str.size();
	}
	
	boolean contains(String string)
	{
		for(int i = 0 ; i < str.size(); i++)
		{
			if(str.get(i).equals(string))
			{
				return true;
			}
		}
		return false;
	}
	
	boolean ContainsAll(Container cont)
	{
		if(cont.str.size() == str.size())
		{
			for(int i = 0 ; i < str.size(); i++)
			{
			if(!cont.str.get(i).equals(str.get(i)))
					{
					return false;
					}
			}

		}
		return false;
	}
	
	    @Override
	    public Iterator<String> iterator() {
	        Iterator<String> it = new Iterator<String>() {

	            private int currentIndex = 0;

	            @Override
	            public boolean hasNext() {
	                return currentIndex < str.size();
	            }

	            @Override
	            public String next() {
	            	currentIndex++;
	                return str.get(currentIndex-1);
	            }

	            @Override
	            public void remove() {
	                throw new UnsupportedOperationException();
	            }
	        };
	        return it;
	    }
	
	
	
	}


