package com.example.exemplo03;

public class Main {

	public static void main(String[] args) {
        
		engine((x,y) -> x + y);
		engine((x,y) -> x * y);
		engine((x1,y1) -> x1 / y1);
		engine((a,b) -> a - b);
 
	}
	
	public static void engine(Calculator c){
		int x = 2, y = 4;
		int result = c.calculate(x, y);
		System.out.println(result);
	}

}
