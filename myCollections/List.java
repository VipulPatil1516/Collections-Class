package myCollections;

import java.util.Collections;
import java.util.LinkedList;
import org.junit.Test;

  // main difference in array and collections is size
  // array has fixed size but collections size defends on requirements if requirements increases we can increase size of collections

public class List 
{
	@Test
	public void myLinkedList_Integer()
	{
		LinkedList<Integer> numbers= new LinkedList<Integer>();
	    int len=numbers.size(); //Initial length will be 0;
	    System.out.println("Length of the array list" +len);
	    numbers.add(1); //0
	    numbers.add(12); //1
	    numbers.add(262); //2
		numbers.add(17); //0
		numbers.add(162); //1
		numbers.add(22); //2
		numbers.add(111); //0
		numbers.add(912); //1
		numbers.add(122); //2
		System.out.println("Length of the array after :" + numbers.size() );
	    for(int i=0;i<numbers.size();i++)
	    {
	    	System.out.print(" " +numbers.get(i));
	    }
	    int len1= numbers.size();
	    System.out.println();
	    System.out.println("Array Size after adding some elements" +len1);
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
		System.out.println("after sorting , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		Collections.reverse(numbers);
		System.out.println();
		System.out.println("after sorting in reverse , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
	}
	@Test
	public void myLinkedList_Character()
	{
		LinkedList<Character> charlist= new LinkedList<Character>();
	    int len=charlist.size(); //Initial length will be 0;
	    System.out.println("Length of the array list" +len);
	    charlist.add('A'); //0
	    charlist.add('B'); //1
	    charlist.add('C'); //2
	    charlist.add('D'); //0
	    charlist.add('E'); //1
	    charlist.add('F'); //2
	    charlist.add('G'); //0
	    charlist.add('H'); //1
	    charlist.add('I'); //2
		System.out.println("Length of the array after :" + charlist.size() );
	    for(int i=0;i<charlist.size();i++)
	    {
	    	System.out.print(" " +charlist.get(i));
	    }
	    int len1= charlist.size();
	    System.out.println();
	    System.out.println("Array Size after adding some elements" +len1);
	    charlist.add(2,'M'); //At position 2 after 12 and before 22 it will add 16 and push 22 to the right
	    System.out.println("After Adding");
	    for(int i=0;i<charlist.size();i++)
	    {
	    	System.out.print(" " +charlist.get(i));
	    }
	    charlist.remove(1);
	    System.out.println();
	    System.out.println("After removing");
	    for(int i=0;i<charlist.size();i++)
	    {
	    	System.out.print(" " +charlist.get(i));
	    }
	}
	@Test
	public void myLinkedList_String()
	{
		LinkedList<String> stringlist= new LinkedList<String>();
	    int len=stringlist.size(); //Initial length will be 0;
	    System.out.println("Length of the array list" +len);
	    stringlist.add("Annu"); 
	    stringlist.add("Aashi"); 
	    stringlist.add("Afreen");
	    stringlist.add("Bobby");
	    stringlist.add("Bani"); 
	    stringlist.add("Chad"); 
	    stringlist.add("Chin"); 
	    stringlist.add("Dan"); 
	    stringlist.add("Diana"); 
		System.out.println("Length of the array after :" + stringlist.size() );
	    for(int i=0;i<stringlist.size();i++)
	    {
	    	System.out.print(" " +stringlist.get(i));
	    }
	    int len1= stringlist.size();
	    System.out.println();
	    System.out.println("Array Size after adding some elements" +len1);
	    stringlist.add(2,"Mannu"); //At position 2 after 12 and before 22 it will add 16 and push 22 to the right
	    System.out.println("After Adding");
	    for(int i=0;i<stringlist.size();i++)
	    {
	    	System.out.print(" " +stringlist.get(i));
	    }
	    stringlist.remove(1);
	    System.out.println();
	    System.out.println("After removing");
	    for(int i=0;i<stringlist.size();i++)
	    {
	    	System.out.print(" " +stringlist.get(i));
	    }
	}
	//Write a program to sort the array / collection elements in ascending / descending order
	@Test
	public void myLinkedList_Sort()
	{
		LinkedList<Integer> numbers= new LinkedList<Integer>();
	    numbers.add(1); //0
	    numbers.add(12); //1
	    numbers.add(262); //2
		numbers.add(17); //0
		numbers.add(162); //1
		numbers.add(22); //2
		numbers.add(111); //0
		numbers.add(912); //1
		numbers.add(122); //2
		System.out.println("array  :" );
	    for(int i=0;i<numbers.size();i++)
	    {
	    	System.out.print(" " +numbers.get(i));
	    }
	    for(int i=0;i<numbers.size();i++)
	    {
	    		for(int j=1; j<numbers.size(); j++)
	    		{
	                if(numbers.get(j-1) > numbers.get(j))
	                {
	                    int temp = numbers.get(j-1);
	                    int num = numbers.get(j);
	                    numbers.set(j-1, num);
	                    numbers.set(j, temp);
	                }
	            }
	    		
	    	}
	    System.out.println("");
	    System.out.println("Sorted Array: ");
	    for(int i=0;i<numbers.size();i++)
	    {
	    	System.out.print(" " +numbers.get(i));
	    }
	}
}
