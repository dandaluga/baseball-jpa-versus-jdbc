package com.daluga.baseball.model.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.joda.time.LocalDate;

public class LocalDateRange implements Iterable<LocalDate> {
	
    private LocalDate start = null;     
    private LocalDate end = null; 	

    public LocalDateRange(LocalDate start, LocalDate end) {
    	this.start = start;
    	this.end = end;
    } 
    
	public Iterator<LocalDate> iterator() {
		return new LocalDateRangeIterator(start, end); 
	}

    private static class LocalDateRangeIterator implements Iterator<LocalDate> {
    	private LocalDate current;         
    	private final LocalDate end;
    	
    	private LocalDateRangeIterator(LocalDate start, LocalDate end) {
    		this.current = start;
    		this.end = end;
    	}          
    	
    	public boolean hasNext() { 
    		return current != null;
    	}          
    	
    	public LocalDate next() {
    		if (current == null) {
    			throw new NoSuchElementException();
    		}
    		
    		LocalDate ret = current;
    		current = current.plusDays(1);
    		
    		if (current.compareTo(end) > 0) {
    			current = null;
    		}             
    		
    		return ret;         
    	}          
    	
    	public void remove() {
    		throw new UnsupportedOperationException();
    	}
    	
    } 
	public static void main(String[] args) {
		LocalDate start = new LocalDate(2011, 3, 30);
		LocalDate end = new LocalDate(2011, 4, 15); 
		
        for (LocalDate date : new LocalDateRange(start, end)) {
        	System.out.println(date);
        } 
	}
}
