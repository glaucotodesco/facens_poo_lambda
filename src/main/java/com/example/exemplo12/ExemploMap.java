package com.example.exemplo12;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Novo{
	int codigo;
	
	Novo(int codigo) {
		this.codigo = codigo;
	}
	
}

public class ExemploMap {
	public static void main(String[] args) {

		List <Pessoa> pessoas =  
				Arrays.asList(
					new Pessoa("A",12),
					new Pessoa("B",2),
					new Pessoa("C",3));

		
		Stream <Novo> s = 	pessoas.
				stream().
				filter( p-> p.nome.startsWith("B")).
				map(p -> new Novo(p.idade));
						
		s.forEach(p -> System.out.println(p.codigo));
		
	}
}
