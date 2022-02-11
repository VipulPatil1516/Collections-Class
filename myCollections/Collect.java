package myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;


// main difference in array and collections is size
// array has fixed size but collections size defends on requirements if requirements increases we can increase size of collections

public class Collect 
{
	@Test
	public void arrayList_Ineger()
	{
		List<Integer> numbers= new ArrayList<Integer>();//List-Interface
	    int len=numbers.size(); //Initial length will be 0;
	    System.out.println("Length of the Linked list" +len);
	    numbers.add(1); //0
	    numbers.add(12); //1
	    numbers.add(22); //2
	    numbers.add(262);
	    numbers.add(17);
	    numbers.add(162);
	    numbers.add(111);
	    numbers.add(912);
	    numbers.add(122);
	    System.out.println("Array List After inserting:");
	    for(int i=0;i<numbers.size();i++)
	    {
	    	System.out.print(" " +numbers.get(i));
	    }
	    int len1= numbers.size();
	    System.out.println();
	    System.out.println("Linked list Size after adding some elements" +len1);
	    numbers.add(2,16); //At position 2 after 12 and before 22 it will add 16 and push 22 to the right
	    System.out.println("After Adding");
	    for(int i=0;i<numbers.size();i++)
	    {
	    	System.out.print(" " +numbers.get(i));
	    }
	    numbers.remove(1);
	    System.out.println();
	    System.out.println("After removing");
	    for(int i=0;i<numbers.size();i++)
	    {
	    	System.out.print(" " +numbers.get(i));
	    }
	    Collections.sort(numbers);
	    System.out.println();
	    System.out.println("After sorting,size " +numbers.size());
	    for(int i=0;i<numbers.size();i++)
	    {
	    	System.out.print(" " +numbers.get(i));
	    }
	    Collections.reverse(numbers);
		System.out.println();
		System.out.println("after sorting in reverse , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
	}
}
