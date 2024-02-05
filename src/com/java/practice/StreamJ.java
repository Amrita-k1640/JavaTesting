package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Immutable
		 List<Integer> list1= List.of(3,5,6,9,23,26,88,98,56);
		 System.out.println(list1);
		 List<Integer> list2=Arrays.asList(23,56,12,45,88);
		 System.out.println(list2);
		 
		 List<Integer>listEven=new ArrayList<>();
		 for(Integer i:list1)
		 {
			 if(i%2==0)
			 {
				 listEven.add(i); 
			 }
		 }
		 
		 System.out.println("this is list Even" + listEven);
		 System.out.println(list1);
		 
		 Stream<Integer> stream=list1.stream();
	List<Integer> ListOfEven=stream.filter(i->i%2==0).collect(Collectors.toList());
	 System.out.println(ListOfEven);
	 
	List<Integer> newList=list1.stream().filter(i->i>20).collect(Collectors.toList());
	
	List<String> names=List.of("Amresh","Anay","Aarya","Dhruv");
	List<String>newNames=names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
	System.out.println(newNames); 
	
	List<Integer>listNumber=List.of(25,34,9,45,12);
	List<Number>listNewNumber=listNumber.stream().map(i->i*i).collect(Collectors.toList());
    System.out.println(listNewNumber);
    
	listNumber.stream().sorted().forEach(e->{
		System.out.println(e);
	}
	);
	Integer compare=listNumber.stream().min((x,y)->x.compareTo(y)).get();
	System.out.println("Minimum number is " + compare);
	

	}

}
