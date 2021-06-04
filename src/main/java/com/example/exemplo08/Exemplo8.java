package com.example.exemplo08;



public class Exemplo8 {

	public static void main(String[] args) {
		
		MyFuncInterface <String> c1 = (s1,s2) -> 
		s1.length() > s2.length() ? s1.length() : s2.length();
		System.out.println(c1.comp("a", "badasdasd"));
		
		
		MyFuncInterface <Integer> c2 = (s1,s2) -> 
		s1 > s2 ? s1 : s2;
		System.out.println(c2.comp(10,23));
	
		

	}

}
