import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {
	private String name;
	private List<College> collegeList;

	public University() {
		collegeList=new ArrayList<>();
	}

	public University(String name, List<College> collegeList) {
		super();
		this.name = name;
		this.collegeList = collegeList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<College> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}

	public void addCollegeToUniversity(College college) {
		collegeList.add(college);
	}

	public Boolean removeCollege(String name) {
		// do you remember, inside for-each loop if you remove an element, it causes,
		// ConcurrentModificationException
		Iterator<College> it = collegeList.iterator();
		Boolean status = false;
		while (it.hasNext()) {
			College c = it.next();
			if (c.getName().equals(name)) {
				it.remove();
				status = true;
			}
		}
		return status;
	}

	public void displayColleges() {
		if (collegeList.size() == 0) {
			System.out.println("No colleges to show");
		} else {
			System.out.println("Colleges in "+getName());
			Iterator<College> it = collegeList.iterator();
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name","Website","Mobile","Founder","Number of Dept","Location","Starting Date");
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			while (it.hasNext()) {
				College c = it.next();
				System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf.format(c.getStartingDate()));
			}
		}
	}
}
