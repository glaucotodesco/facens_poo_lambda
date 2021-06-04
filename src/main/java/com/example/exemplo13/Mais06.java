package com.example.exemplo13;

import java.util.Arrays;
import java.util.List;

public class Mais06 {

	public static void main(String[] args) {
		List<Integer> numeros = 
				Arrays.asList(1,2,3,4);

		double media = numeros.
				       parallelStream().
				       filter( n -> n > 2).
				       mapToDouble( n -> n ).
				       average().
		  	           getAsDouble();

		System.out.println(media);

	}

}
