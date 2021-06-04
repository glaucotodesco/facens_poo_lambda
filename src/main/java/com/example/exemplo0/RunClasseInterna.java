package com.example.exemplo0;

public class RunClasseInterna {

	public static void main(String[] args) {
		
		SaudacaoInterface s = new SaudacaoInterface() {
			
			@Override
			public void saudar() {
				System.out.println("Dizer oi");
				
			}
		};
                
                
        s.saudar();

	}

}
