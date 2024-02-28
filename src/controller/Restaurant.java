/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Dish;
import model.Employee;
import model.Table;

/**
 *
 * @author thanh
 */
public class Restaurant {
	private String name;
	private ArrayList<Dish> menu;
	private ArrayList<Table> tables;
	private ArrayList<Employee> employees;

//	== == == == == == == == == == == == == == == == == == == == == == == == == == == == ==
//	Phương thức khởi tạo & Getter + Setter
	
	public Restaurant (String name) {
		this.name = name;
		menu = new ArrayList<>();
		tables = new ArrayList<>();
		employees = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Dish> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Dish> menu) {
		this.menu = menu;
	}

	public ArrayList<Table> getTables() {
		return tables;
	}

	public void setTables(ArrayList<Table> tables) {
		this.tables = tables;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
//	== == == == == == == == == == == == == == == == == == == == == == == == == == == == ==
//	Quản lý các món ăn trong Menu
	
	public void addDish (String name, double price) {
		menu.add(new Dish(name, price));
	}
	
	public void addDish (Dish dish) {
		menu.add(dish);
	}
	
	public void removeDish (String name) {
		for (Dish dish : menu) {
			if (dish.getName().toLowerCase().equals(name.toLowerCase())) {
				menu.remove(dish);
			}
		}
	}
	
	public void showMenu () {
		System.out.printf(
			"| %-20s | %-20s |\n", 
			"--------------------", 
			"--------------------");
		System.out.printf("| %-20s | %-20s |\n", "Name", "Price");
		System.out.printf(
			"| %-20s | %-20s |\n", 
			"--------------------", 
			"--------------------");
		for (Dish dish : menu) {
			dish.display();
		}
		System.out.printf(
			"| %-20s | %-20s |\n", 
			"--------------------", 
			"--------------------");
	}
	
//	== == == == == == == == == == == == == == == == == == == == == == == == == == == == ==
//	Quản lý bàn ăn
	
	public void addTable (Table table) {
		tables.add(table);
	}
	
	public void addTable (int number, int capacity) {
		tables.add(new Table(number, capacity));
	}
	
	public void removeTable (int number) {
		for (Table table : tables) {
			if (table.getNumber() == number) {
				tables.remove(table);
			}
		}
	}
	
	public void listTables() {
		System.out.printf(
			"| %-10s | %-10s | %-10s |\n", 
			"----------", 
			"----------", 
			"----------");
		System.out.printf("| %-10s | %-10s | %-10s |\n", "Number", "Capacity", "Available");
		System.out.printf(
			"| %-10s | %-10s | %-10s |\n", 
			"----------", 
			"----------", 
			"----------");
		for (Table table : tables) {
				table.display();
		}
		System.out.printf(
			"| %-10s | %-10s | %-10s |\n", 
			"----------", 
			"----------", 
			"----------");
	}
	
	public void listAvailableTables(int capacity) {
		System.out.printf(
			"| %-10s | %-10s | %-10s |\n", 
			"----------", 
			"----------", 
			"----------");
		System.out.printf("| %-10s | %-10s | %-10s |\n", "Number", "Capacity", "Available");
		System.out.printf(
			"| %-10s | %-10s | %-10s |\n", 
			"----------", 
			"----------", 
			"----------");
		for (Table table : tables) {
			if (table.getCapacity() >= capacity) {
				table.display();
			}
		}
		System.out.printf(
			"| %-10s | %-10s | %-10s |\n", 
			"----------", 
			"----------", 
			"----------");
	}
	
//	== == == == == == == == == == == == == == == == == == == == == == == == == == == == ==
//	Quản lý nhân viên
	
	public void addEmpoyee (Employee employee) {
		employees.add(employee);
	}
	
	public void addEmployee (String id, String name, String position) {
		employees.add(new Employee(id, name, position));
	}
	
	public void removeEmployee (String id) {
		for (Employee employee : employees) {
			if (employee.getId().toLowerCase().equals(id.toLowerCase())) {
				employees.remove(employee);
			}
		}
	}
	
	public void listEmployees () {
		System.out.printf(
			"| %-10s | %-20s | %-20s |\n", 
			"----------", 
			"--------------------", 
			"--------------------");
		System.out.printf("| %-10s | %-20s | %-20s |\n", "ID", "Name", "Position");
		System.out.printf(
			"| %-10s | %-20s | %-20s |\n", 
			"----------", 
			"--------------------", 
			"--------------------");
		for (Employee employee : employees) {
			employee.display();
		}
		System.out.printf(
			"| %-10s | %-20s | %-20s |\n", 
			"----------", 
			"--------------------", 
			"--------------------");
	}
}
