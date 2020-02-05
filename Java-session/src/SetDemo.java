import java.util.*;
class Intern
{
	int id;
	String name;
	String college;
	long number;
	String email;
	
	Intern(int id, String name, String college, long number, String email) {
		this.id = id;
		this.name = name;
		this.college = college;
		this.number = number;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	
}
class Employes{
	String name;
	long number;
	Employes(String name,long number)
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
public class SetDemo {


	public static void main(String[] args) {
//		create intern object
		
		Intern i1=new Intern(12501,"rock","BVM",9851445652l,"abc.xyz@peaas.co");
		Intern i2=new Intern(12502,"smith","ddu",785514456l,"bla.pqr@peaas.co");
		Intern i3=new Intern(12503,"rock","BVM",9851445652l,"abc.xyz@peaas.co");
		
		Employes em=new Employes("john",12301l);
		Employes em2=new Employes("smith",12302l);
		Employes em3=new Employes("john",12303l);

		
		  HashSet set=new HashSet(); 
		  set.add(i1);
		  set.add(i2);
		  set.add(i3);
		  set.add(em);
		  set.add(em2);
		  set.add(em3);
		  
		  Iterator itr=set.iterator();
		  Employes temp2;
		  Intern temp1;
		  while(itr.hasNext())
		  {
			  Object temp=itr.next();
			  if(temp instanceof Intern)
			  {		temp1=(Intern)temp;
				 	System.out.println("Id of Intern: "+temp1.id+" name "+temp1.name+" Number"+temp1.number+" email"+temp1.email);  
			  }
			  else
			  {
				  temp2=(Employes)temp;
				  System.out.println("Employe name :"+temp2.name+" and number "+temp2.number);
			  }
		  }

		  
		/*  
		  for(Intern i:set)
		  {
			 System.out.println("Id of Intern: "+i.id+" name "+i.name+" Number"+i.number+" email"+i.email);  

		  }
		*/


	}

}
