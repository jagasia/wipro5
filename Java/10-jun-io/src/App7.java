import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class App7 {

	public static void main(String[] args) throws IOException {
		File f=new File("praveen.dat");
		DataInputStream dis=new DataInputStream(new FileInputStream(f));
		int i=dis.readInt();
		float fl=dis.readFloat();
		boolean b=dis.readBoolean();
		char c=dis.readChar();
		
		System.out.println(i);
		System.out.println(fl);
		System.out.println(b);
		System.out.println(c);
		
	}

}
