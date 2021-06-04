package com.example.exemplo06;


public class Main {
	public static void main(String[] argv) {
          
		//Não compila
        //engine((x, y) -> x + y);  
		engine((IntCalculator) ((x, y) -> x + y));
		engine((long x, long y) -> x * y);
		engine((int x, int y) -> x / y);
		engine((long x, long y) -> x % y);
	}

	private static void engine(IntCalculator calculator) {
		int x = 2, y = 4;
		int result = calculator.calculate(x, y);
		System.out.println(result);
	}

	private static void engine(LongCalculator calculator) {
		long x = 2, y = 4;
		long result = calculator.calculate(x, y);
		System.out.println(result);
	}
}

@FunctionalInterface
interface IntCalculator {
	int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator {
	long calculate(long x, long y);
}