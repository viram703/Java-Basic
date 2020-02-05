package GenericExample;
import java.util.*;

class Area<T extends Number>
{
	T number1,number2;
	Area(T number1,T number2 )
	{
		this.number1=number1;
		this.number2=number2;
	}
	public T calculateArea(T number1,T number2)
	{
		
		return number1*number2;
	}
	
}

public class AreaGeneric {

	public static void main(String[] args) {
		Area<Integer> squre=new Area<Integer>(10,10);
		System.out.println("The area of squre"+squre.calculateArea(10,10));

	}

}
