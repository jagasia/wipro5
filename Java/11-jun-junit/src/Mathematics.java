
public class Mathematics {
	int no1;
	int no2;
	int result;
	
	public Mathematics() {}

	public Mathematics(int no1, int no2, int result) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.result = result;
	}

	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public void sum()
	{
		result=no1+no2;
	}
	
	public void difference()
	{
		result=no1-no2;
	}
}
