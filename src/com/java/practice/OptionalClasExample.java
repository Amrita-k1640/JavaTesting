package com.java.practice;

import java.util.Optional;

public class OptionalClasExample {
	
	
	 public static Optional<String> getName(){
		String name= "Ammu";
		
		return Optional.ofNullable(name);
	}
	

	public static void main(String[] args) {
		
	
		
		// TODO Auto-generated method stub
		
		String str="Java is a Programming Language";
		//String str="Null";
		Optional<String>optional=Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		//System.out.println(value.get());
		System.out.println(optional.orElse("no value is available"));
		Optional<String>nameOptional=getName();
		System.out.println(nameOptional.orElse("null return"));
		
		

	}
}



