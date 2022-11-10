import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String s;
		Scanner sc = new Scanner(System.in);
		
		long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i ++)
		{
			//s = br.readLine();
			//System.out.println(s);
			System.out.println(sc.next());
		}
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end - start)/1000.0);
	}
}