/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.Restaurant;
import java.util.Scanner;

/**
 *
 * @author thanh
 */
public class View {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner scanner = new Scanner(System.in);
		Restaurant restaurant = new Restaurant("My Restaurant");
		
		loop:
		while (true) {	
			mainMenu();
			int choice = 0;
			do {			
				System.out.print("Your choice: ");
				choice = Integer.parseInt(scanner.nextLine());
			} while (choice < 0 || choice > 9);
			
			switch (choice) {
				case 1:
					addDish(restaurant);
					break;
				case 2:
					removeDish(restaurant);
					break;
				case 3:
					showMenu(restaurant);
					break;
				case 4:
					addTable(restaurant);
					break;
				case 5:
					removeTable(restaurant);
					break;
				case 6:
					listTables(restaurant);
					break;
				case 7:
					addEmployee(restaurant);
					break;
				case 8:
					removeEmployee(restaurant);
					break;
				case 9:
					listEmployee(restaurant);
				case 0:
					break loop;
				default:
					throw new AssertionError();
			}
		}
	}
	
//	== == == == == == == == == == == == == == == == == == == == == == == == == == == == ==
//	Menu
	public static void addDish(Restaurant restaurant) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n[ ADD A DISH ]");
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Price: ");
		double price = Double.parseDouble(scanner.nextLine());
		restaurant.addDish(name, price);
		System.out.print("Press [enter] to continue.");
		String enter = scanner.nextLine();
	}
	
	public static void removeDish(Restaurant restaurant) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n[ REMOVE A DISH ]");
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		restaurant.removeDish(name);
		System.out.print("Press [enter] to continue.");
		String enter = scanner.nextLine();
	}
	
	public static void showMenu(Restaurant restaurant) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n[ SHOW MENU ]");
		restaurant.showMenu();
		System.out.print("Press [enter] to continue.");
		String enter = scanner.nextLine();
	}
		
//	== == == == == == == == == == == == == == == == == == == == == == == == == == == == ==
//	Table
	public static void addTable(Restaurant restaurant) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n[ ADD A TABLE ]");
		System.out.print("Enter Number: ");
		int number = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter Capacity: ");
		int capacity = Integer.parseInt(scanner.nextLine());
		restaurant.addTable(number, capacity);
		System.out.print("Press [enter] to continue.");
		String enter = scanner.nextLine();
	}
	
	public static void removeTable(Restaurant restaurant) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n[ REMOVE A TABLE ]");
		System.out.print("Enter Number: ");
		int number = Integer.parseInt(scanner.nextLine());
		restaurant.removeTable(number);
		System.out.print("Press [enter] to continue.");
		String enter = scanner.nextLine();
	}
	
	public static void listTables(Restaurant restaurant) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n[ LIST ALL TABLE ]");
		restaurant.listTables();
		System.out.print("Press [enter] to continue.");
		String enter = scanner.nextLine();
	}
		
//	== == == == == == == == == == == == == == == == == == == == == == == == == == == == ==
//	Employee
	public static void addEmployee(Restaurant restaurant) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n[ ADD AN EMPLOYEE ]");
		System.out.print("Enter ID: ");
		String id = scanner.nextLine();
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Position: ");
		String position = scanner.nextLine();
		restaurant.addEmployee(id, name, position);
		System.out.print("Press [enter] to continue.");
		String enter = scanner.nextLine();
	}
	
	public static void removeEmployee(Restaurant restaurant) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n[ REMOVE AN EMPLOYEE ]");
		System.out.print("Enter ID: ");
		String id = scanner.nextLine();
		restaurant.removeEmployee(id);
		System.out.print("Press [enter] to continue.");
		String enter = scanner.nextLine();
	}
	
	public static void listEmployee(Restaurant restaurant) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n[ LIST ALL EMPLOYEES ]");
		restaurant.listEmployees();
		System.out.print("Press [enter] to continue.");
		String enter = scanner.nextLine();
	}
	
//	== == == == == == == == == == == == == == == == == == == == == == == == == == == == ==
//	Choice
	public static void mainMenu () {
		System.out.println("\n[ Restaurant Management ]");
		System.out.printf(
			"| %-25s | %-25s | %-25s |\n", 
			"-------------------------", 
			"-------------------------", 
			"-------------------------");
		System.out.printf("| %-25s | %-25s | %-25s |\n", "MENU", "TABLES", "EMPLOYEES");
		System.out.printf(
			"| %-25s | %-25s | %-25s |\n", 
			"-------------------------", 
			"-------------------------", 
			"-------------------------");
		System.out.printf(
			"| %-25s | %-25s | %-25s |\n", 
			"1. Add a Dish", "4. Add a Table", "7. Add an Employee");
		System.out.printf(
			"| %-25s | %-25s | %-25s |\n", 
			"2. Remove a Dish", "5. Remove a Table", "8. Remove an Employee");
		System.out.printf(
			"| %-25s | %-25s | %-25s |\n", 
			"3. Show Menu", "6. List Tables", "9. List Employees");
		System.out.printf(
			"| %-25s | %-25s | %-25s |\n", 
			"-------------------------", 
			"-------------------------", 
			"-------------------------");
	}
	
}
