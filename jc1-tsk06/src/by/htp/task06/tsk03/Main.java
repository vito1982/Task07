package by.htp.task06.tsk03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Airline> airlines = new ArrayList<>();
		
		AirPortLogic apl = new AirPortLogic();
		
		Airline	air1 = new Airline(1, "Minsk", "BOING 777", apl.formDate("Sunday 15:30"));
		Airline	air2 = new Airline(2, "London", "BOING 737", apl.formDate("Monday 16:20"));
		Airline	air3 = new Airline(3, "Moscow", "SUKHOJ JET", apl.formDate("Friday 11:50"));
		Airline	air4 = new Airline(4, "London", "BOING 737", apl.formDate("Monday 20:10"));
		Airline	air5 = new Airline(5, "Minsk", "SUKHOJ JET", apl.formDate("Friday 23:30"));
		
		airlines.add(air1);
		airlines.add(air2);
		airlines.add(air3);
		airlines.add(air4);
		airlines.add(air5);
		
		AirPort ap1 = new AirPort();
		ap1.addAirline(airlines);
		
		for(Airline a : ap1.getAirlines()) {
			System.out.println(a);
		}
		System.out.println();
		
		for(Airline a : apl.findByDestination(ap1.getAirlines(), "London")) {
			System.out.println(a);
		}
		System.out.println();
		
		for(Airline a : apl.findByDay(ap1.getAirlines(), apl.formDate("Friday"))) {
			System.out.println(a);
		}
		System.out.println();
		
		for(Airline a : apl.findByDayTime(ap1.getAirlines(), apl.formDate("Monday 17:00"))) {
			System.out.println(a);
		}		
	}
}
