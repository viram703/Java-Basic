package GenericExample;

import java.util.*;

class GenDemo<T>
{
	T var;
	GenDemo(T var)
	{
		this.var=var;
	}
	public void display()
	{
		System.out.println("The type of object"+var.getClass().getName());
	}
	public T getObject()
	{
		return var;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
	
		/* Non-Generic method
		//runtime error
		List arraylist=new ArrayList();
		arraylist.add("collection");
		arraylist.add("datatype");
		arraylist.add("generic");
		aaraylist.add(new Integer(10));
		
		for(int i=0;i<arraylist.size();i++)
		{
//			comile time error type casting 	
			String temp=(String)arraylist.get(i);
			String temp=(String)arraylist.get(i);
		}
		*/
		
		
//		Generic Method compile time 
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("collection");
		arraylist.add("datatype");
		arraylist.add("generic");
		//aaraylist.add(new Integer(10));
		
		for(int i=0;i<arraylist.size();i++)
		{
			String temp=(String)arraylist.get(i);
		}
		GenDemo<String> gen=new GenDemo<String>("viram_sarvariya");
		gen.display();
		System.out.println(gen.getObject());		


	}

}
