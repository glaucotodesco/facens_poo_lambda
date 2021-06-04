package com.example.exemplo12;


import java.util.Arrays;
import java.util.List;

public class ExemploFilter {

	public static void main(String[] args) {
		
		List <Pessoa> pessoas =  
	        Arrays.asList(new Pessoa("A",1),
	 			 new Pessoa("B",2),
				 new Pessoa("C",3));
	
		pessoas.stream().
				filter(p -> p.idade > 2).
				forEach(p -> 
				  System.out.println(p.nome));

		
	}

}
