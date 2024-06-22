package com.core.dateandtime.demos;
//Getting next Friday and previous friday
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Get_Friday {

	public static void main(String[] args) {
		LocalDate dt=LocalDate.now();
		System.out.println("Next Friday"+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		System.out.println("Previous Friday"+dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));

	}

}
