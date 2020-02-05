import java.util.TreeSet;

public class SortSetDemo {

	public static void main(String[] args) {
		
		  TreeSet set=new TreeSet<Integer>();
		  
		  set.add(101);
		  set.add(102);
		  set.add(103);
		  set.add(104);
		  set.add(105);
		  set.add(106);
		  
		  System.out.println("treeset :"+set);
		  System.out.println("headset of 103 :"+set.headSet(103));
		  System.out.println("tail set of 104 :"+set.tailSet(104));
		  System.out.println("headset :"+set.subSet(102, 106));

		

	}

}
