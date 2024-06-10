
public class App2 {

	public static void main(String[] args) {
		Maths m;
		Mathematics mathematics=new Mathematics();
		m=mathematics::add;
		System.out.println(m.sum(2, 3));
	}

}
