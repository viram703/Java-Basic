import java.util.*;

class Employe{
	String name;
	long number;
	Employe(String name,long number)
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
public class LinkedListDemo {
	
	

	public static void main(String[] args) {
		
		LinkedList<Employe> ll=new LinkedList<Employe>(); 
		Employe em=new Employe("john",12301l);
		Employe em2=new Employe("smith",12302l);
		Employe em3=new Employe("john",12303l);
		
		ll.add(em);
		ll.add(em2);
		ll.add(em3);
		Iterator itr=ll.descendingIterator(); 
		while(itr.hasNext())  
        {  Employe temp=(Employe)itr.next();
            System.out.println("employe naem : "+temp.name+" and number:"+temp.number);  
        }  
          



		

	}

}
