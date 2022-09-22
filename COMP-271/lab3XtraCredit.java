package lab3XtraCred;

public class TimeDriver {
	// Use this driver to execute your Time class
	  public static void main(String[] args) {
	    Time time1 = new Time();
	    System.out.println("Hour: " + time1.getHour() + " Minute: " +
	    					time1.getMinute() + " Second: " + time1.getSecond());
	    Time time2 = new Time(555550000);
	    System.out.println("Hour: " + time2.getHour() + " Minute: " +
	    					time2.getMinute() + " Second: " + time2.getSecond());
	  }
	}
	/////////////////////////////////////////////////////////////////////////////
	class Time{
	// Design the Time Class Here
		private int intHour;
	    private int intMinute;
	    private int intSecond;
	    private long intTime;

	    public Time() {intTime = System.currentTimeMillis();}
	    public Time(long time) {intTime = time;}
	    public Time(int hour, int minute, int second) {
	        intHour = hour;
	        intMinute = minute;
	        intSecond = second;
	    }

	    public void setTime(long elapsedTime) {intTime = elapsedTime;}
	    public int getHour() {return (int)(intTime / (1000 * 60 * 60)) % 24;}
	    public int getMinute() {return (int)(intTime / (1000 * 60)) % 60;}
	    public int getSecond() {return (int)(intTime / 1000) % 60;}

	
		
		
	}
