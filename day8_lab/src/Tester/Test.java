package Tester;
import java.util.Date;
import java.util.Scanner;
import static utils.ValidationRules.*;
import  com.customer.app.Customer;
import com.customer.app.CustomerType;



public abstract class Test {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
		int counter=0;
		boolean exit=false;
		Customer[] cus = new Customer[1]; 
		while(!exit)
		{
		System.out.println("OPTIONS");
		System.out.println("1.Add Customer details");
		System.out.println("2.Display added customer");
		System.out.println("3.exit");
		System.out.println("Enter your choice");
		try {
		switch(scan.nextInt()) {
		case 1:System.out.println("Enter name of customer");
				String name = scan.next();
				System.out.println("Enter email of customer");
				String email = scan.next();
				ValidateEmail(email);
				System.out.println("Enter password of customer");
				String password = scan.next();
				ValidatePassword(password);
				System.out.println("Enter regAmount of customer");
				double regAmount = scan.nextDouble();
				ValidateRegAmount(regAmount);
				System.out.println("Enter dob of customer in dd-MM-yyyy");
				String date = scan.next();
				Date date2 =  Customer.dateFormater.parse(date);
				validateDob(date2);
				System.out.println("Enter Category of customer");
				String cateogy = scan.next();
				CustomerType customerType = CustomerType.valueOf(cateogy.toUpperCase());
				Customer newCus = new Customer(name,email,password,regAmount,date2,customerType);
				if(counter == 0) {
					cus[counter++]=newCus;
				}
				else {
					validateDuplication(cus,newCus);
					Customer[] newArray = new Customer[cus.length+1];
					for(int i=0;i<cus.length;i++) {
						newArray[i]=cus[i];
					}
					newArray[cus.length]=newCus;
					cus=newArray;
				}
				break;
		case 2:for(Customer c:cus) {
			System.out.println(c);
		     }		
				break;
		case 3:exit=true;
				break;
		default:System.out.println("Wrong Choice");		
				
		
		}}catch(Exception e) {
			e.printStackTrace();
		}
		}}
		
	}

}
