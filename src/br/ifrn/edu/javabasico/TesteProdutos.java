package br.ifrn.edu.javabasico;

public class TesteProdutos {

	public static void main(String[] args) {
		Produtos feijaoPreto = new Produtos();
		feijaoPreto.produto("Feij�o", 3.5);
		feijaoPreto.produto("Outro Feij�o", 4.0);
		
		Produtos cafeTorrado = new Produtos();
		cafeTorrado.produto("Caf� Santa Clara", 4.8);
		
		
		Produtos queijoJucurutu = new Produtos();
		queijoJucurutu.produto("Queijo Jucurutu KG", 22.5);
		
		//exibe quantos objetos foram criados;
		
		 System.out.println("Total itens Feij�o: "+feijaoPreto.contador);
		 System.out.println("Total itens Caf�s: "+cafeTorrado.contador);
		 System.out.println("Total itens Queijos: "+queijoJucurutu.contador);

	}

}
