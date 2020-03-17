import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadEmpDa {

	public static void main(String[] args) throws FileNotFoundException, IOException,EOFException        {
		try(FileInputStream fos=new FileInputStream("D:\\cts java\\Examples_23\\src\\shivam.txt");
				BufferedInputStream br=new BufferedInputStream(fos);
			    DataInputStream dr=new DataInputStream(br);)
		{
			   while(true)
			   {
				   int x=dr.readInt();
				   String s=dr.readUTF();
				   Double d=dr.readDouble();
				   System.out.print(x+s+d);
			   }
		}

	}

}
 