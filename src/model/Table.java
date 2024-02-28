/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thanh
 */
public class Table {
	private int number;
	private int capacity;
	private boolean available;

	public Table(int number, int capacity) {
		this.number = number;
		this.capacity = capacity;
		this.available = true;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return number + "/" + capacity + "/" + available;
	}
	
	public void display () {
		System.out.printf("| %-10s | %-10s | %-10s |\n", number, capacity, available);
	}
}
