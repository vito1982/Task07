package by.htp.task06.tsk03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AirPort implements Serializable {
	private static final long serialVersionUID = -5161554829637953275L;
	
	private List<Airline> airlines = new ArrayList<>();
	
	//----------------------------------------------------------
	
	public AirPort() {}
	
	public AirPort(Airline airline) {
		this.airlines.add(airline);
	}
	
	public AirPort(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	//----------------------------------------------------------
	
	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}
	public List<Airline> getAirlines(){
		return this.airlines;
	}
	
	//----------------------------------------------------------
	
	public void addAirline(Airline airline) {
		this.airlines.add(airline);
	}
	
	public void addAirline(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	//----------------------------------------------------------
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirPort other = (AirPort) obj;
		if (airlines == null) {
			if (other.airlines != null)
				return false;
		} else if (!airlines.equals(other.airlines))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AirPort [airlines=" + airlines + "]";
	}
}
