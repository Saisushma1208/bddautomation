package com.oops;

public class User {
	public static void main(String[]args) {
		
		Guest guest = new Guest();
		guest.read();
		
		
		Developer dev = new Developer();
		dev.read();
		dev.Write();
		
		Admin admin = new Admin();
		admin.read();
		admin.Write();
		admin.manage();
		
		
		
	}

}






