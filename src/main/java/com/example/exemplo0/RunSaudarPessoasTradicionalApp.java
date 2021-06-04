package com.example.exemplo0;

public class RunSaudarPessoasTradicionalApp {

	public static void main(String[] args) {
		
		
		SaudacaoInterface s = new DizerOi();
		s.saudar();
		
		s = new DizerBeleza();
		s.saudar();
		

	}

}
