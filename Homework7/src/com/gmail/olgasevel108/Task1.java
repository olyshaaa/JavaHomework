package com.gmail.olgasevel108;

import java.util.Date;
import java.util.Calendar;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		int month = cl.get(Calendar.MONTH);
		cl.set(Calendar.MONTH, month-1);
		Date date = cl.getTime();
		
		long milis = new Date().getTime()-date.getTime();
		System.out.println("current date:"+new Date());
		System.out.println("date a month ago:"+date);
		System.out.println(milis);
	
	}

}