import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class App6 {

	public static void main(String[] args) throws IOException {
		File f=new File("praveen.dat");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(f));
		dos.writeInt(101);
		dos.writeFloat(2.3f);
		dos.writeBoolean(true);
		dos.writeChar('A');
		
		dos.flush();
		dos.close();
		
	}

}
