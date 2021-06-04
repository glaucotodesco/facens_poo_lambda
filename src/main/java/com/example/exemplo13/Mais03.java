package com.example.exemplo13;

import java.util.Arrays;
import java.util.List;

public class Mais03 {

	public static void main(String[] args) {
		
		List<Integer> numeros =
				Arrays.asList(-1,2,-3,2,2,2,2,2);

		int x =   numeros.
			         stream().
			         filter( n -> n > 0).
		             reduce(1, (a,b) -> a * b);
		             
				
		System.out.println(x);


		 x =   numeros.
		         stream().
		         filter( n -> n > 0).
	             reduce(0, (a,b) -> a + b);
	             
			
	System.out.println(x);

		
		
	}

}
