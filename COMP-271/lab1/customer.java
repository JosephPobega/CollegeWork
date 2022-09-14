
public class customer {
	
	private String strfirstName;
	private String strlastName;
	private String stradress;
	private String strcity;
	private String strstate;
	private String strzip;
	
	
	//Create a default constructor a a six argument constructor
	customer(){
	}
	
	customer(String firstName, String lastName, String adress, 
			String city, String state, String zip){
	
		strfirstName = firstName;
		strlastName = lastName;
		stradress = adress;
		strcity = city;
		strstate = state;
		strzip = zip;
	}
	
	//Create Getters (Accessors)  and Setters (Mutators) for all data fields
	public String getfirstName() { return this.strfirstName; }
	public void setfirstName(String firstName){ this.strfirstName = firstName; }

	public String getlastName() { return this.strlastName; }
	public void setlastName(String lastName){ this.strlastName = lastName; }
	
	public String getadress() { return this.stradress; }
	public void setadress(String adress){ this.stradress = adress; }
	
	public String getcity() { return this.strcity; }
	public void setcity(String city){ this.strcity = city; }
	
	public String getstate() { return this.strstate; }
	public void setstate(String state){ this.strstate = state; }
	
	public String getzip() { return this.strzip; }
	public void setzip(String zip){ this.strzip = zip; }
	
	
	
	//Create a method that returns a String address as a concatenated string with line breaks
	public String Adress() {
		String adress = getfirstName() +  " " + getlastName() + "\n" + 
	getadress() + "\n" + getcity() + "\n" + getstate() + "\n" + getzip();
			
		return adress;
		
	}
	
	
	
}
