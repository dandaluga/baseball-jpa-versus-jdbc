package com.daluga.baseball.model.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class DateIterator implements Iterator<Date>, Iterable<Date> {

	private Calendar current = Calendar.getInstance(); 
	private Calendar end = Calendar.getInstance();
	
	public DateIterator(Date start, Date end) {
		this.current.setTime(start); 
		this.current.add(Calendar.DATE, -1); 
		this.end.setTime(end); 
		this.end.add(Calendar.DATE, -1); 		
	}

	@Override
	public Iterator<Date> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		return !current.after(end); 
		
//		boolean b1=false;
//		boolean b2=false;
//		boolean b3=false;
//		boolean b=false;
//		b1 = current.get(Calendar.YEAR) > end.get(Calendar.YEAR);
//		b2 = current.get(Calendar.YEAR) == end.get(Calendar.YEAR);
//		b3 = current.get(Calendar.DAY_OF_YEAR) > end.get(Calendar.DAY_OF_YEAR);
//		b = b1 || (b2 && b3);
//		return !b;
	}

	@Override
	public Date next() {
		current.add(Calendar.DATE, 1); 
		return current.getTime(); 
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Cannot remove"); 		
	}

	public static void main(String[] args) {
		Date d1 = new Date(); 
		Calendar cal = Calendar.getInstance(); 
		cal.add(Calendar.DATE, 20); 
		Date d2 = cal.getTime();
		
		Iterator<Date> i = new DateIterator(d1, d2); 
		while(i.hasNext()) {
			Date date = i.next(); 
			System.out.println(date); 
		}
	}

}