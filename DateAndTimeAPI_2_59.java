package com.skilllync.Programming_workshop;

import java.time.LocalDateTime;
import java.time.Month;

public class DateAndTimeAPI_2_59 {
	public static void main(String[] args) {
		LocalDateTime localdt = LocalDateTime.of(2022, Month.JANUARY, 10, 13, 55, 03);
		System.out.println("Enter the Time to be calculated : " + localdt);
		int hr = localdt.getHour();
		System.out.println("Current Hour of the day : " + hr);
		int min = hr * 60 + localdt.getMinute();
		System.out.println("Current minute of the day : " + min);
		int sec = min * 60 + localdt.getSecond();
		System.out.println("Current second of the day : " + sec);

	}
}
