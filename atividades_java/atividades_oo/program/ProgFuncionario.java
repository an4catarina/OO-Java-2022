package program;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class ProgFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Funcionario emp = new Funcionario();
		
		System.out.print("Name: ");
		emp.name = sc.next();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp.name + " , $ " + emp.netSalary());
		System.out.println();
		
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		
		System.out.print("Updated data: " + emp.name + ", $ " + emp.netSalary());
		
		sc.close();
	}

}
