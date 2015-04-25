package com.daluga.baseball.model.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.LocalDate;

public class DateUtil {
	
	private static final String[] dateFormats = {"yyyy-MM-dd", "MM/dd/yyyy"};

	public static List<LocalDate> buildDatesList(LocalDate start, LocalDate end) {
		
		List<LocalDate> dateList = new ArrayList<LocalDate>();
		
		for (LocalDate date : new DayIterator(start, end)) {
			dateList.add(date);	
		}
		
		return dateList;
	}
	
	public static Date parse(String date) {
					
		Date theDate = null;
		try {
			theDate = DateUtils.parseDate("03/30/2011", dateFormats);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return theDate;
	}

}
