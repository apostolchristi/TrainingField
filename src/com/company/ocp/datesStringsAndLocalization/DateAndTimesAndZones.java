package com.company.ocp.datesStringsAndLocalization;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateAndTimesAndZones {

	public static void main(String[] args) {

		System.out.println(ZonedDateTime.now());
		LocalDate date1 = LocalDate.of(2015, Month.APRIL, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);

		System.out.println(date1);
		System.out.println(date2);

		LocalTime time1 = LocalTime.of(6, 15);
		LocalTime time2 = LocalTime.of(6, 15, 30);
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);

		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zoned1 = ZonedDateTime.of(date1, time1, zone);
		ZonedDateTime zoned2 = ZonedDateTime.of(2015, 1, 25, 18, 22, 21, 200, zone);
		System.out.println(zoned1);
		System.out.println(zoned2);

		System.out.println(ZoneId.systemDefault());

//		ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out::println);
//		ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("2") || z.contains("America"))
//				.sorted()
//				.forEach(System.out::println);

		Period annually = Period.ofYears(1);
		Period quarterly = Period.ofMonths(3);
		Period everyThreeWeeks = Period.ofWeeks(3);
		Period everyOtherDay = Period.ofDays(2);
		Period everyYearAndAWeek = Period.of(1, 0,7);
		System.out.println(everyYearAndAWeek);

		Duration.ofHours(2);

		Instant now = Instant.now();
		Instant instant = zoned1.toInstant();
		System.out.println(instant);
		System.out.println(zoned1);

		Locale locale = Locale.getDefault();
		System.out.println(locale);

		System.out.println(Locale.GERMAN);
		System.out.println(Locale.GERMANY);
		System.out.println(new Locale("ro", "MD"));

		System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time1.format(DateTimeFormatter.ISO_LOCAL_TIME));

		LocalDateTime localDateTime = LocalDateTime.of(date1, time1);

		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(localDateTime));

		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy, hh:mm:ss");
		System.out.println(localDateTime.format(f));


	}
}
