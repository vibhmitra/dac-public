package com.assignment4.question3;
//import java.time.*;
//import java.time.format.DateTimeFormatter;

public class DateQ {
	
	private int day, month, year;
	
	public DateQ() {
		this.year = 1999;	// default
		this.month = 10;
		this.day = 14;
	}
	
	public DateQ(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	void setDate(int year, int month, int day) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}

	@Override
	public String toString() {
		return (String.format("%02d/%02d/%d", this.getDay(), this.getMonth(), this.getYear()));
	}

	public static void main(String[] args) {
		/* Trying Out new java.time api meh!
		LocalDate datenow = LocalDate.now();
		System.out.println(datenow);
		
		LocalTime timenow = LocalTime.now();
		System.out.println(timenow);
		
		LocalDateTime datetimenow = LocalDateTime.now();
		System.out.println(datetimenow);
		
		ZonedDateTime d3 = ZonedDateTime.of(datetimenow, ZoneId.systemDefault());
		System.out.println(d3);
		
		DateTimeFormatter simpleDate = DateTimeFormatter.ofPattern("yyyy");
		System.out.println(d3.format(simpleDate));
		*/
		
		DateQ date1;
		
		date1 = new DateQ(1, 2, 2014);
		System.out.println(date1);
		
		date1.setDate(2099, 12, 9);
		System.out.println(date1);
		
		System.out.println("Month : " + date1.getMonth());
		System.out.println("Day : " + date1.getDay());
		System.out.println("Year : " + date1.getYear());
		date1.setDate(2016, 4, 3);
		System.out.println(date1.toString());
		
	}
}