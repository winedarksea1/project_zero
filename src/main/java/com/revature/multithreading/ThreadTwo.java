package com.revature.multithreading;

import java.util.ArrayList;

public class ThreadTwo extends Thread {
	Incrementer increment = new Incrementer();
	ArrayList<Integer> al = new ArrayList<>();
	
	@Override
	public void run() {
		super.run();
		
		try {
			for (int i = 0 ; i < 1000 ; i++) {
				al.add(new Integer(increment.incrementer()));
			}
			System.out.println(al);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			
 
	@Override
	public void start() {
		super.start();
	}
}
