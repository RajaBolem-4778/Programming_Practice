package com.skilllync.Programming_workshop;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeAnddateAPI_58 {
	public static void main(String[] args) {
		LocalDateTime localdt = LocalDateTime.of(2022, Month.JANUARY, 10, 13, 24);
		ZoneId India = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zone1 = ZonedDateTime.of(localdt, India);
		System.out.println("India Time Zone: " + zone1);
		ZoneId Tokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zone2 = zone1.withZoneSameInstant(Tokyo);
		System.out.println("Tokyo Time Zone: " + zone2);
		int hr = zone2.getHour() - zone1.getHour();
		System.out.println("Hours between two Time Zone: " + hr);
	}
}
