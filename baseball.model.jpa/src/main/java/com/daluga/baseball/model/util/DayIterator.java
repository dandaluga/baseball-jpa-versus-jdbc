package com.daluga.baseball.model.util;

import java.util.Iterator;

import org.joda.time.LocalDate;

public class DayIterator implements Iterable<LocalDate>, Iterator<LocalDate> {
	
    private LocalDate current = null;     
    private LocalDate end = null; 	

    public DayIterator(LocalDate start, LocalDate end) {
    	this.current = start.minusDays(1);
    	this.end = end.minusDays(1);
    } 
    
	@Override
	public Iterator<LocalDate> iterator() {
		return this; 
	}
           	
    public boolean hasNext() { 
    	return !current.isAfter(end);
    }          
    	
    public LocalDate next() {
    	this.current = new LocalDate(current.plusDays(1)); // LocalDate is immutable, so creating a new LocalDate.
    	return this.current;         
    }          
    	
    public void remove() {
    	throw new UnsupportedOperationException();
    }
    	     
	public static void main(String[] args) {
		//LocalDate start = new LocalDate(2011, 3, 30); // Before end date
		//LocalDate start = new LocalDate();              // Same Day
		LocalDate start = new LocalDate(2012, 3, 30); // After end date (which should not happen).
		LocalDate end = new LocalDate(); 		
			
        for (LocalDate date : new DayIterator(start, end)) {
        	System.out.println(date);
        } 
	}
}
