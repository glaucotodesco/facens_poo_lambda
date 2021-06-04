package com.example.exemplo0;
public class RunSaudarPessoasLambdaApp {

	public static void main(String[] args) {
		
		
		SaudacaoInterface s;
		s = () -> {
			int i;
			for(i=0; i < 10; i++)
			   System.out.println("Oi");
		};
		
		
		s.saudar();
		
		s = () -> System.out.println("Beleza");
		s.saudar();
		
		s = () -> System.out.println("Opa!!!");
		s.saudar();
		
	}

}
