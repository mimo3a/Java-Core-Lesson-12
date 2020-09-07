package ua.lviv.lgs.month;

public class Month {
	private String nameOfMonth;
	private String seasOfMonth;
	private int dayInMonth;
	
	public Month(String name,String seas, int day) {
		super();
		this.setNameOfMonth(name);
		this.seasOfMonth = seas;
		this.dayInMonth = day;
		
	}
	public int getDayInMonth() {
		return dayInMonth;
	}
	public void setDayInMonth(int dayInMonth) {
		this.dayInMonth = dayInMonth;
	}
	public String getSeasOfMonth() {
		return seasOfMonth;
	}
	public void setSeasOfMonth(String seasOfMonth) {
		this.seasOfMonth = seasOfMonth;
	}
	
	public String getNameOfMonth() {
		return nameOfMonth;
	}
	public void setNameOfMonth(String nameOfMonth) {
		this.nameOfMonth = nameOfMonth;
	}
	@Override
	public String toString() {
		return "Month [nameOfMonth=" + nameOfMonth + ", seasOfMonth=" + seasOfMonth + ", dayInMonth=" + dayInMonth
				+ "]";
	}
	
	

}
