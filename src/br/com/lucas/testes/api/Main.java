package br.com.lucas.testes.api;

import br.com.lucas.testes.api.Endereco;
import br.com.lucas.testes.api.ServicoCEP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("Digite o CEP para saber mais informações: ");
		String CEP = new Scanner(System.in).nextLine();
		//String CEP = "70150903";
		System.out.println();
        Endereco endereco = ServicoCEP.buscaEndereco(CEP);
        System.out.println(endereco);
        
	}

}