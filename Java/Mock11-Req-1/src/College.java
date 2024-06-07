import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

//extends Object
public class College {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDept;
	private String location;
	private Date startingDate;
	
	public College()
	{
		
	}
	
	public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.numberOfDept = numberOfDept;
		this.location = location;
		this.startingDate = startingDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public Integer getNumberOfDept() {
		return numberOfDept;
	}
	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return String.format("Name: %s\n"
				+ "Website: %s\n"
				+ "Mobile: %s\n"
				+ "Founder: %s\n"
				+ "Number of Dept: %d\n"
				+ "Location: %s\n"
				+ "Starting Date: %s\n",name, website, mobile, founder, numberOfDept, location, sdf.format(startingDate));
	}

		@Override
	public boolean equals(Object obj) {
		College arg=(College) obj;
		return this.getName().equalsIgnoreCase(arg.getName()) && this.getStartingDate().equals(arg.getStartingDate());
	}
	
	
	
}
