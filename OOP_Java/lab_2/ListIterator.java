package lab_2;
import java.util.Iterator;
import java.io.Serializable;

public class ListIterator<E> implements Iterator<E>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int index =0;
	private E[] values;
	ListIterator(E[] values){
		this.values=values;
	}
	
	public boolean hasNext() {
		return index < values.length;
	}
	
	public E next() {
		return values[index++];
	}
	public void remove() {
		throw new UnsupportedOperationException();
	}
}

