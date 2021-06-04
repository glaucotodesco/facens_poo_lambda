package com.example.exemplo12;

import java.util.Arrays;
import java.util.List;

public class ExemploForEach {

	public static void main(String[] args) {

		List<Pessoa> pessoas = Arrays.asList(new Pessoa("A", 12), new Pessoa("B", 2), new Pessoa("C", 3));

		pessoas.forEach(p -> System.out.println(p.nome + " " + p.sobreNome));

		pessoas.forEach(p -> p.sobreNome = "Silva");

		pessoas.forEach(p -> System.out.println(p.nome + " " + p.sobreNome));

	}

}
