package ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		ArrayList<Pessoa>listaPessoas = new ArrayList<>();
		Scanner leitura = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			Pessoa pessoa = new Pessoa();
			System.out.println("Insira o nome: ");
			pessoa.nome = leitura.nextLine();
			System.out.println("Insira o email: ");
			pessoa.email = leitura.nextLine();
			System.out.println("Insira o telefone: ");
			pessoa.telefone = Integer.valueOf(leitura.nextLine());
			System.out.println("Insira o nome da cidade: ");
			pessoa.nomeDaCidade = leitura.nextLine();
			System.out.println("Insira o nome da rua: ");
			pessoa.rua = leitura.nextLine();
			System.out.println("Insira o número do endereço: ");
			pessoa.numero = Integer.valueOf(leitura.nextLine());
			
			listaPessoas.add(pessoa);
		}
		
		for (Pessoa p : listaPessoas) {
			System.out.println("Nome: "+p.nome);
			System.out.println("E-mail: "+p.email);
			System.out.println("Telefone: "+p.telefone);
			System.out.println("Nome da cidade: "+p.nomeDaCidade);
			System.out.println("Rua: "+p.rua);
			System.out.println("Número: "+p.numero);
		}
	}

}