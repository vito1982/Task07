package by.htp.task06.tsk03;

import java.io.Serializable;
import java.util.Date;

public class Airline implements Serializable {
	private static final long serialVersionUID = 4871440951672021060L;

	private int flightNumber;
	private String destination;
	private String planeType;
	private Date departDate;
	
	//------------------------------------------------------------------
	
	public Airline() {}
	
	public Airline(int flightNumber, String destination, String planeType, Date departDate) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.planeType = planeType;
		this.departDate = departDate;
	}
	
	//------------------------------------------------------------------
	
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getFlightNumber() {
		return this.flightNumber;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDestination() {
		return this.destination;
	}
	
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}
	public String getPlaneType() {
		return this.planeType;
	}
	
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public Date getDepartDate() {
		return this.departDate;
	}
	
	//------------------------------------------------------------------

	@Override
	public String toString() {
		return flightNumber + " " + destination + " " + planeType + " " + departDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departDate == null) ? 0 : departDate.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((planeType == null) ? 0 : planeType.hashCode());
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
		Airline other = (Airline) obj;
		if (departDate == null) {
			if (other.departDate != null)
				return false;
		} else if (!departDate.equals(other.departDate))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (planeType == null) {
			if (other.planeType != null)
				return false;
		} else if (!planeType.equals(other.planeType))
			return false;
		return true;
	}
	
}
