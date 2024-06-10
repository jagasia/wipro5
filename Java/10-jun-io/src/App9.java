import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class App9 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File f=new File("krishn.dat");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
		Employee emp=(Employee) ois.readObject();
		System.out.println(emp);
	}

}
