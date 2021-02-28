package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.println("====== iniciando sistema ======");
		System.out.println();
		System.out.print("Informe a lotação da sala: ");
		int n = tc.nextInt();
		System.out.println();
		System.out.println("====== Cadastro de pessoa ======");
		
		for(int i=0; i<n;i++) {
			
			System.out.println();
			System.out.println("Pessoa " + (i+1) + ": ");
			System.out.print("Informe o ID da pessoa: ");
			Integer id = tc.nextInt();
			//Condição enquanto ID já existente, o sistema pede para entrar com outro ID.
			while(hasID(list,id)) {
				
				System.out.println("ID já cadastrado! Entre com outro ID: ");
				id = tc.nextInt();
				
			}
			
			System.out.print("Informe o nome sobrenome da pessoa: ");
			tc.nextLine();
			String nome = tc.nextLine();
			System.out.print("Informe o nome da sala: ");
			//tc.nextLine();
			String nomeSala = tc.nextLine();
			System.out.print("Informe o ID da sala: ");
			Integer idSala = tc.nextInt();
			
			Pessoa pessoa = new Pessoa(nome, id, nomeSala,idSala);
			list.add(pessoa);
		}
		
		
		System.out.println();
		System.out.println("======== Consultar pessoa pelo ID ========");
		System.out.print("Entre com o ID da pessoa para consulta: ");
		int idpessoa = tc.nextInt();

		 //Integer pos = position(list, idpessoa);
		
		Pessoa pessoa = list.stream().filter(x -> x.getId() == idpessoa).findFirst().orElse(null);
		
		// if (pos == null) {
		if (pessoa == null) {
			System.out.println("##### ID inexistente! ######");
		}
		else {
			
		System.out.println();
		System.out.println("Pessoa: " + pessoa.getNome());
		//System.out.println(pessoa.getNome()); 
		
		System.out.println("====== Lista completa das pessoas ======");
		System.out.println();
		for (Pessoa e : list) {
			System.out.println(e.getNome());
			}		
		
		}
		
		System.out.println();
		System.out.println("======== Consultar sala pelo nome ========");
		System.out.print("Entre com o ID da sala para consulta: ");
		tc.nextLine();
		Integer idSala = tc.nextInt();

		 //Integer pos = position(list, idpessoa);
		
		Pessoa id = list.stream().filter(x -> x.getIdSala() == idSala).findFirst().orElse(null);
		
		// if (pos == null) {
		if (id == null) {
			System.out.println("##### Sala inexistente! ######");
		}
		else {
			
		System.out.println();
		System.out.println("Sala: " + id.getNomeSala());
		//System.out.println(pessoa.getNome()); 
		
		System.out.println("====== Lista completa das salas ======");
		System.out.println();
		for (Pessoa e : list) {
			System.out.println(e.getNomeSala());
			}		
		
		}
		
		tc.close();
		
	}
	//Função para encontrar uma pessoa pelo ID.
	public static Integer position(List<Pessoa> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	//Função lambda para verificar se o id já existe.
	private static boolean hasID(List<Pessoa> list, Integer id) {

		Pessoa pessoa = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return pessoa != null;
	}

}
