import java.util.List;
import java.util.*;

class Person
{
	String name;
	long number;
}

public class CollectionDemo {
	
	public static void main(String[] args) {

		System.out.println("collection session ");
		Person person=new Person();
		person.name="Viram_sarvariya";
		person.number=9904168517l;
		
		
		List p1=new ArrayList<>();
		p1.add(person);
		System.out.println(p1);
		
/* 
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("viram");
		al.add("ronak");  
		al.add("vijay");  
		al.add("Ajay");  
		
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("Ravi");  
		ll.add("Vijay");  
		ll.add("ashok");  
		ll.add("Ajay");
		ll.set(0,"xyz");
		ll.addFirst("shyam");
		ll.removeLast();
	
		al.remove(2);
		al.add(2,"jayraj");
		
		System.out.println("arrayList"+al);
		
		Iterator itr=al.iterator();  

  		System.out.println("Display ArrayList");

		while(itr.hasNext())
		{  
			System.out.println(itr.next());
		}
		System.out.println("Display Lindlist");
		Iterator itr2=ll.iterator();  
		while(itr2.hasNext())
		{  
			System.out.println(itr2.next());
	 
		}
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("viram");  
		queue.add("Raj");  
		queue.add("jayraj");  
		queue.add("ronak");  
		System.out.println("Display priority-queue");

		Iterator tr=queue.iterator();
		while(tr.hasNext())
		{
			System.out.println(tr.next());  

		}
		
	*/
	}
}
