package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

class Driver {

	private static Scanner sc=new Scanner(System.in);
	private static Employee emp ;
	private static CredentialService cred ;

	public static void main(String[] args){

		String firstName;
		String lastName;
		String departmentId="";
		int choice ;

		//Welcome Message				
		displayMessage();

		System.out.println("Enter Your First Name ");
		firstName =  sc.next().toLowerCase();

		System.out.println("Enter Your Last Name ");
		lastName =  sc.next().toLowerCase();

		displayMenu();

		System.out.println("Your Choice please ");
		choice =(int) sc.nextInt();
		switch (choice)
		{
		case 1:
			departmentId="tech";							
			break;
		case 2:
			departmentId="admin";							
			break;
		case 3:
			departmentId="hr";							
			break;
		case 4:
			departmentId="legal";							
			break;	
		default:
			System.out.println("Invalid Choice ");
		}
		try {
			emp = new Employee(firstName,lastName,departmentId);
			cred= new CredentialService();
			cred.generateEmailAddress(emp);
			cred.generatePassword();
			cred.showCredentials(emp);
		}
		catch(Exception e){
			System.out.println("Enter Your First Name " + e.getMessage());
		}

	}

	public static void displayMessage() {
		System.out.println("Welcome Student !!! ");
	}

	public static void displayMenu() {

		System.out.println("Please enter the department from the following ");
		System.out.println("1.Technical ");
		System.out.println("2.Admin ");
		System.out.println("3.Human Service ");
		System.out.println("4.Legal ");
	}
}
