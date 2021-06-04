package com.example.exemplo07;



public class Exemplo7 {

	public static void main(String[] args) {
		
		
		//1. Na atribuicao
		Calculator c = (x,y) -> x + y;
		System.out.println(c.calc(4, 2));
		
		//2. Na chamada de m�todos
		m1((x,y) -> x * y);
		
		//3. No retorno de m�todos
		Calculator c2 = m2();
		System.out.println(c2.calc(3, 3));
		
		//4. No cast
		double val = ((Calculator)(x,y)-> x+y).calc(4, 4);
		System.out.println(val);
		
		
		
	}
	
        public static void m1(Calculator c){
		
		System.out.println(c.calc(4, 2));
	}
	

	private static Calculator m2() {
		int a=0, b=1;
		if(a > b)
			return (x,y)->Math.pow(x, y);
		else	
			return (x,y)-> x + y;
	}

	
}
