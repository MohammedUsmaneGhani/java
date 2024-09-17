													//Discount
package datatype.javaprogramme;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		double price, dis_price, final_price ;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the price: ");
		price=sc.nextDouble();
		
		if(price>=1000 && price<=2000) {
			dis_price=price/5;
			final_price=price-dis_price;
			System.out.println("You got 5% Discount on your Purchase");
			System.out.printf("The discounted price:%.2f\n",dis_price);
			System.out.printf("Final price:%.2f",final_price);
		}
		else if(price>2000 && price<=4000) {
			dis_price=price/7;
			final_price=price-dis_price;
			System.out.println("You got 7% Discount on your Purchase");
			System.out.printf("The discounted price:%.2f\n",dis_price);
			System.out.printf("Final price:%.2f",final_price);
		}
		else if(price>4000 && price<=8000) {
			dis_price=price/10;
			final_price=price-dis_price;
			System.out.println("You got 10% Discount on your Purchase");
			System.out.printf("MRP:%.2f\n",price);
			System.out.printf("The discounted price:%.2f\n",dis_price);
			System.out.printf("Final price:%.2f",final_price);	
		}
		else {
			System.out.println("Sorry, No Discount's available");
			
		}
		
	}

}
