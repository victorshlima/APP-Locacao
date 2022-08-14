package com.victation.AppLocacao.model.test;


import com.victation.AppLocacao.interfaces.IPrinter;

public class AppLocacao {
	public static void relatorio (String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		printer.impressao();
		
	}
}
