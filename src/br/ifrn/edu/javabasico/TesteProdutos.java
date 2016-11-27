package br.ifrn.edu.javabasico;

public class TesteProdutos {

	public static void main(String[] args) {
		Produtos feijaoPreto = new Produtos();
		feijaoPreto.produto("Feijão", 3.5);
		feijaoPreto.produto("Outro Feijão", 4.0);
		
		Produtos cafeTorrado = new Produtos();
		cafeTorrado.produto("Café Santa Clara", 4.8);
		
		
		Produtos queijoJucurutu = new Produtos();
		queijoJucurutu.produto("Queijo Jucurutu KG", 22.5);
		
		//exibe quantos objetos foram criados;
		
		 System.out.println("Total itens Feijão: "+feijaoPreto.contador);
		 System.out.println("Total itens Cafés: "+cafeTorrado.contador);
		 System.out.println("Total itens Queijos: "+queijoJucurutu.contador);

	}

}
