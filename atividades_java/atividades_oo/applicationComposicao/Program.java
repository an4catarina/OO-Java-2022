package applicationComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitiesComposicao.Client;
import entitiesComposicao.Order;
import entitiesComposicao.OrderItem;
import entitiesComposicao.OrderStatus;
import entitiesComposicao.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate= sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter other data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		for ( int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(productName, price);
			OrderItem item = new OrderItem(quantity, price, product);
			
			order.addItem(item);
		}
		
		System.out.println();
		System.out.print("Order Summary: " + order);
	}

}
