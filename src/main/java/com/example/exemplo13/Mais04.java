package com.example.exemplo13;

import java.util.Arrays;
import java.util.List;

public class Mais04 {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays
				.asList(-1,2,3,-4,-5,2,3,4);

		int red1 =   numeros.
			         stream().
			         distinct().
		             filter( n -> n > 0).
		             reduce(0, (a,b) -> a + b);
				
		int red2 = numeros.
		         stream().
		         		distinct().
	                    filter( n -> n > 0).
	                    reduce(0,Integer::sum);
		
		System.out.println(red1);
		System.out.println(red2);



	}

}
