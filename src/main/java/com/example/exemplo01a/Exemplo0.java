package com.example.exemplo01a;

public class Exemplo0 {
	public static void main(String[] args) {
		
		MyLambda test;
		
		test = () -> System.out.println("Teste");
		test.f1();
		
	    test = () -> {
	    	for(int i=0; i < 10; i++)
	    	   System.out.println("Teste 2");
	    
	    };
        
		test.f1();
	}

}


