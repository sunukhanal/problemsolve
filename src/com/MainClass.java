package com;

public class MainClass {

	public static void main(String[] args) {
		
	System.out.println("Bank");
	Bank d=new Bank();
	System.out.println("------------------------");
	
	System.out.println("SBI Bank Interest::");
	Bank sb=new SBIBank();
	sb.Interest(8);
	System.out.println("-------------------------");
	
	System.out.println("ICICI Bank Interest::");
	d=new ICICIBank();
	sb.Interest(7);
	System.out.println("-------------------------");
	
	
	System.out.println("AXIS Bank Interest::");
	d=new AXISBank();
	sb.Interest(9);
	System.out.println("-------------------------");
	
	
	

	}

}
