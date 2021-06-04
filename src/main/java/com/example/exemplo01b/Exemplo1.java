package com.example.exemplo01b;

public class Exemplo1 {

	public static void main(String[] args) {
		
		MyFuncInterface fi;
		
		
		//Completo
		fi=(int x) -> { return x * 2;};
		System.out.println(fi.calc(3));
		
		//Sem return
		fi=(int x) -> x * 3;
		System.out.println(fi.calc(3));
		
		//Forma mais simples
		fi=(x) -> x - 2;
		System.out.println(fi.calc(3));
		
		

	
	
		
	}

}



