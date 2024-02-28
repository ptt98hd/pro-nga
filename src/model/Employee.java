/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author thanh
 */
public class Employee {
	private String id;
	private String name;
	private String position;

	public Employee(String id, String name, String position) {
		this.id = id;
		this.name = name;
		this.position = position;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return id + "/" + name + "/" + position;
	}
	
	public void display () {
		System.out.printf("| %-10s | %-20s | %-20s |\n", id, name, position);
	}
}
