import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class College implements Comparable<College>
{
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDept;
	private String location;
	private Date startingDate;
	
	public College() {}

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

	
	static College createCollege(String detail) throws ParseException
	{
		String[] arr1 = detail.split(",");
		College college1=new College();	//no arguments passed
		college1.setName(arr1[0]);
		college1.setWebsite(arr1[1]);
		college1.setMobile(arr1[2]);
		college1.setFounder(arr1[3]);
		college1.setNumberOfDept(Integer.parseInt(arr1[4]));
		college1.setLocation(arr1[5]);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		college1.setStartingDate(sdf.parse(arr1[6]));
		return college1;
	}

	@Override
	public int compareTo(College o) {
		return this.getName().compareTo(o.getName());
	}
}
