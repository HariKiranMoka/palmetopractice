import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Pro {

	public static void main(String[] args) throws IOException {
       Properties p=new Properties();	
       FileReader f=new FileReader("D:\\cts java\\Examples_23\\src\\db.properties");
       p.load(f);
       System.out.println(p.getProperty("name"));
       System.out.println(p.getProperty("pwd"));
       Set s=p.stringPropertyNames();
       System.out.println(s);
       Properties p1=System.getProperties();
       Set s1=p1.entrySet();
       Iterator ir=s1.iterator();
       while(ir.hasNext())
       {
    	   Map.Entry entry=(Map.Entry)ir.next();
    	   System.out.println(entry.getKey()+" "+entry.getValue());
       }
	}

}
