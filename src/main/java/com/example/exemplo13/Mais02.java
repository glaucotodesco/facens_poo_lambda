package com.example.exemplo13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mais02 {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList(
				"aaa", 
				"bbbbb",
				"cccccccc");

		Stream <String> stream = palavras.
						 stream().
						 filter( s -> s.length() > 5 ).
						 map(s-> s.toUpperCase());
				
		stream.forEach(p -> System.out.println(p));


		List <String> list = palavras.
							 stream().
							 filter( s -> s.length() > 5 ).
							 map(s-> s.toUpperCase()).
							 collect(Collectors.toList());

	    list.forEach(p -> System.out.println(p));


		
	}

}
