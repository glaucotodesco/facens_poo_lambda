package com.example.exemplo02;

@FunctionalInterface
interface Teste {
	public boolean proc();
}

public class Exemplo2 {
	public static void main(String[] args) {
		Teste bs;
		int x = 0, y= 1;
		
		//Sem parametros
		bs = () -> x > y;
		System.out.println(bs.proc());
	   
		bs = () -> true;
		System.out.println(bs.proc());
                
		bs = () -> 3 > 4;
                System.out.println(bs.proc());
	}

}
