import java.io.*;
public class FileEx {

	public static void main(String[] args) throws IOException {
		
try(FileReader fin=new FileReader("D:\\cts java\\Examples_23\\src\\hari.txt");
	FileWriter out=new FileWriter("D:\\cts java\\Examples_23\\src\\kiran.txt"))	
{
	int x=fin.read();
	while(x!=-1)
	{
		char ch=(char)x;
		out.write(ch);
		System.out.print(ch);
		x=fin.read();
	}
}
	}

}
