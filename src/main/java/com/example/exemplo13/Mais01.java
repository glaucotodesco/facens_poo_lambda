package com.example.exemplo13;


import java.util.Arrays;
import java.util.List;

public class Mais01 {

	public static void main(String[] args) {
		List<String> palavras = Arrays.asList(
				"funcional",
				"java",
				"lambda",
				"um",
				"A");

		palavras.sort( (s1, s2) -> 
		Integer.compare(s1.length(), s2.length()));
		
		System.out.println("Exemplo 1 ");
		palavras.forEach(s -> System.out.println(s + " "));
		
		palavras.sort( (s1, s2) -> s1.compareTo(s2));
		System.out.println("\nExemplo 2 ");
		palavras.forEach(s -> System.out.println(s + " "));


	}

}
