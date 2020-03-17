import java.io.*;
public class Buffer {

	public static void main(String[] args) throws IOException {
		
		try(InputStreamReader ipr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ipr)){
			System.out.println("enter m1");
			int m1=Integer.parseInt(br.readLine());
			System.out.println("enter m2");
			int m2=Integer.parseInt(br.readLine());
			System.out.println("enter m3");
			int m3=Integer.parseInt(br.readLine());
			int total=m1+m2+m3;
			System.out.println("Total is"+total);
		}
		}
	}


