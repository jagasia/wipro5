import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App8 {

	public static void main(String[] args) throws IOException {
		Employee e=new Employee();
		e.id=123;
		e.average=9.4f;
		e.isPermanent=true;
		e.grade='B';
		
		File f=new File("krishn.dat");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(e);
		oos.flush();
		oos.close();
		
	}

}
