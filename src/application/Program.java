package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados de contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(),fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number,date,totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		sc.close();

	}

}
