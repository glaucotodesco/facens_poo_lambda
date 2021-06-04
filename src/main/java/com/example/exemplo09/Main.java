package com.example.exemplo09;


@FunctionalInterface
interface  Processor <T>{
      T  process(T[] list);
}



public class Main {

	public static void main(String[] args) {
	
		Processor <String> proc = (p) -> {
			 String aux="";
	    		 for(String t: p)
  	                    aux = aux + t.toLowerCase()+"#";
		   	     return aux;
		         };
				 
		String dados[]={"A","B", "C"};
		
		System.out.println(proc.process(dados));
		
		
	}
}


