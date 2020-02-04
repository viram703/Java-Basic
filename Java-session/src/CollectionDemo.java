import java.util.List;
import java.util.*;
import java.util.Scanner;

class Person
{
	String name;
	long number;
}

public class CollectionDemo {
	
	public static void main(String[] args) {

		System.out.println("collection session ");
		Person person=new Person();
		Scanner input = new Scanner(System.in);
		int number; 
		String iname;
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Name of employe: ");
			iname=input.next();
			System.out.print("Enter number of employe : ");

			
			
		}
		
		person.name="Viram_sarvariya";
		person.number=9904168517l;
		
		
		List p1=new ArrayList<>();
		p1.add(person);
		
		 for(int i=0;i<p1.size();i++)  
         {  
			 System.out.println(p1.get(i));     
         } 
//		System.out.println(p1);
		
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
