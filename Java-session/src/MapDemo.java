import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
	    Map map=new HashMap();
	    map.put(1,"hashmap");
	    map.put(2,"LindHashmap");
	    map.put(3,"TreeMap");
	    
	    Set set=map.entrySet();
	    
	    Iterator itr=set.iterator();
	    
	    while(itr.hasNext())
	    {
	        Map.Entry entry=(Map.Entry)itr.next();  
	    	System.out.println("key ="+entry.getKey()+" value = "+entry.getValue());
	    }
	    
	    
	     

	}

}
