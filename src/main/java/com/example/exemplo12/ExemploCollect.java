package com.example.exemplo12;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ExemploCollect {
	public static void main(String[] args) {

		List <Pessoa> pessoas = 
				Arrays.asList(new Pessoa("A",12),
				              new Pessoa("B",2),
					          new Pessoa("C",3));
		
		List <Pessoa> l = 	pessoas.
					stream().
					filter( p-> p.nome.startsWith("B")).
					collect(Collectors.toList());
               
		l.forEach(p -> System.out.println(p.nome));

	}
}
