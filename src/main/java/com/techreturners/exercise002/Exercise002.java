package com.techreturners.exercise002;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

	public int past(int h, int m, int s) {
		LocalDate currentDate = LocalDate.now();
		LocalDateTime actualDateTime = LocalDateTime
				.of(currentDate.getYear(), 
						currentDate.getMonth(), 
						currentDate.getDayOfMonth(),
						h, m, s);
		LocalDateTime midnightDateTime = LocalDateTime
				.of(currentDate.getYear(), 
						currentDate.getMonth(), 
						currentDate.getDayOfMonth(),
						0, 0, 0);
		return (int) ChronoUnit.MILLIS.between(midnightDateTime, actualDateTime);
	}
}