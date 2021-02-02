package by.htp.task06.tsk03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class AirPortLogic {
	public List<Airline> findByDestination(List<Airline> airlines, String destination){
		List<Airline> temp = new ArrayList<>();
		
		for(Airline a : airlines) {
			if(a.getDestination().equals(destination)) {
				temp.add(a);
			}
		}
		
		return temp;
	}
	
	public List<Airline> findByDay(List<Airline> airlines, Date departDate){
		List<Airline> temp = new ArrayList<>();
		
		for(Airline a : airlines) {
			if(a.getDepartDate().getDay() == departDate.getDay()) {
				temp.add(a);
			}
		}
		
		return temp;
	}
	
	public List<Airline> findByDayTime(List<Airline> airlines, Date departDate){
		List<Airline> temp = new ArrayList<>();
		
		for(Airline a : airlines) {
			if((a.getDepartDate().getDay() == departDate.getDay()) && (a.getDepartDate().after(departDate))) {
				temp.add(a);
			}
		}
		
		return temp;
	}
	
	public static Date formDate(String s) {
		String[] str = s.split(" ");
		
		SimpleDateFormat sdf;
		
		Date date = new Date();
		
		if (str.length == 2) {
			sdf = new SimpleDateFormat("EEEE HH:mm", Locale.ENGLISH);
		} else {
			sdf = new SimpleDateFormat("EEEE", Locale.ENGLISH);
		}
		
		try {
			date = sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return date;
	}
	
}
