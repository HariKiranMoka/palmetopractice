import java.io.*;
public class WriteEmp {

	public static void main(String[] args) throws IOException   {
		try(FileOutputStream fos=new FileOutputStream("D:\\cts java\\Examples_23\\src\\shivam.txt");
		BufferedOutputStream br=new BufferedOutputStream(fos);
	    DataOutputStream dr=new DataOutputStream(br);)
		{
	    dr.writeInt(1);
	    dr.writeUTF("hari");
	    dr.writeDouble(5000.0);
	    dr.writeInt(2);
	    dr.writeUTF("kiran");
	    dr.writeDouble(6000.0);
	    dr.writeInt(3);
	    dr.writeUTF("ramu");
	    dr.writeDouble(4000.0);
	    System.out.println("insereted");
	 
		}
	    
	}
	

}
