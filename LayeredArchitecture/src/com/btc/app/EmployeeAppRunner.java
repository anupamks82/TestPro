package com.btc.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.btc.app.ui.EmployeeAppUI;

public class EmployeeAppRunner {

	public static void main(String[] args) throws SQLException {
		Scanner scanner =new Scanner(System.in);
		EmployeeAppUI appUI = new EmployeeAppUI();
		
		while (true) {
			System.out.println("Enter a option :\n [1 - Add Employee] \n [2 - Search Employee] \n [0 - Exit]");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				appUI.addEmployee();
				break;
			case 2:
				appUI.showEmployee();
				break;

			case 0:
				System.exit(1);
				break;

			default:
				throw new IllegalArgumentException("Invalid Option: " + option);
			}

			System.out.println("\n");

		}
	}

}
