package view;

import java.util.Scanner;

public class View {
	
	private Scanner keyboard = new Scanner (System.in);
	
	public View () {
		
	}
	
	public void show () {
		System.out.println("WELCOME TO THE ONLINE STORE");
		System.out.println("What do you want to do? /n "
				+ "1 - Check Items"
				+ "2 - Show Cart /n "
				+ "3 - Purchase /n"
				+ "4 - Exit");
	}

}
