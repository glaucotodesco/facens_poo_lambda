package com.example.exemplo13;

import java.util.Arrays;
import java.util.List;

public class Mais05 {

	public static void main(String[] args) {
		List<Integer> numeros =
				Arrays.asList(-1,2,3,-4);

		int soma = numeros.
			       stream().
		                    filter( n -> n > 0).
		                    reduce(0,Integer::sum);
				
		System.out.println(soma);


	}

}
