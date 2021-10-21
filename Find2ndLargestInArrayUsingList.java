package week3.day2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find2ndLargestInArrayUsingList {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		//List<Integer> lst=new ArrayList<Integer>();
		//lst.add(3);
		List<Integer> lst= Arrays.asList(3,2,11,4,6,7);
		Collections.sort(lst);//to sort the List
		System.out.println(lst);//sorted input
		System.out.println(lst.size());//get the no. of values in List
		System.out.println(lst.get(lst.size()-1));//to get last value in Array List
		System.out.println(lst.get(lst.size()-2)); //to get 2nd largest value in array list
		
		
		
		

	}

}
