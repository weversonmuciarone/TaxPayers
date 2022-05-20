package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.TaxPayers;
import entities.Individual;
import entities.Company;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<TaxPayers> list = new ArrayList<>();
		
		System.out.print("Enter the number of Tax Payers:");
		
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Tax payer # " + i + " data:");
			System.out.print("Individual or Comapny (I/C)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if(ch == 'I') {
				System.out.print("Health Expenditure: ");
				double healthExpenditure = sc.nextDouble();
				list.add(new Individual(name,anualIncome,healthExpenditure));
			}
			else {
				System.out.print("Number of Employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name,anualIncome,numberOfEmployees));
			}
		}
			
			double sum = 0;
			
			System.out.println();
			System.out.println("TAXES PAID:");
			
			for(TaxPayers tp : list) {
				tp.tax();
				System.out.println(tp.getName() + " £ " + String.format("%.2f",tp.tax()));
				sum += tp.tax();
			}
			System.out.println();
			System.out.println("TOTAL TAXES");
			System.out.print("£ " + String.format("%.2f",sum));
			
		
		sc.close();
	}

}
