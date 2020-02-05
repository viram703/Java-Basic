import java.util.List;
import java.util.*;
import java.util.Scanner;

class Person
{
	String name;
	long number;
	Person(String name,long number)
	{
		this.name=name;
		this.number=number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	
}

public class CollectionDemo {
	
	public static void main(String[] args) {

		System.out.println("collection session ");
		Person person1=new Person("rohan",9904198517l);
		Person person2=new Person("jayraj",8517528777l);
		Person person3=new Person("smith",9723868517l);
		Person person4=new Person("anil",9902148517l);
		ArrayList<Person> al2=new ArrayList<Person>(); 
		al2.add(person1);
		al2.add(person2);
		al2.add(person3);
		al2.add(person4);


		al2.add(person1);
		Iterator itr2=al2.iterator();  


//		Scanner input = new Scanner(System.in);
//		int number; 
//		String iname;
	    System.out.println("display using for each loop");  

		for(Person pr2:al2)
		{
		    System.out.println(pr2.name+" "+pr2.number);  

			
		}
//		
		 while(itr2.hasNext()){  
			    Person pr=(Person)itr2.next();  
			    System.out.println(pr.name+" "+pr.number);  
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
