import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class output {
	public static void main(String[] args) throws IOException {
		/*FileOutputStream f = new FileOutputStream("./output.txt");
		String s = "가나다";
		f.write(s.getBytes());
		f.close();*/

		String s = "가나다";
		FileWriter t = new FileWriter("./output.txt");
		BufferedWriter b = new BufferedWriter(t);
		b.write(s);
		b.flush();
	}
}