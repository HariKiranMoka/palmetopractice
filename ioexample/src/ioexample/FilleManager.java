package ioexample;

//import necessary packages
import java.io.*;
import java.nio.file.Paths;
@SuppressWarnings("unchecked")//Do not delete this line
 class FileManager 
{
   
   static public File createFile()
   {
	      Paths.get("d://visitors.txt");
          File f=new File("visitors.txt");
          try 
          {
              f.createNewFile();
          } 
          catch(Exception e)
          {
          } 
          finally
          {
          }
         
          return f;
   }
   static public void writeFile(File f, String record)
	{
	   
	   
	    try
	    {
	    	
	         FileWriter f1=new FileWriter(f);
	         BufferedWriter br=new BufferedWriter(f1);
	        
	         br.write(record);
	         br.close();
	         
	         
	       	  
	    }
	    
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	} 
	static public String[] readFile(File f)
	{
	    FileReader fr;
	    String s2="";
	    String[] s1 = null;
		try {
			fr = new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			
			
			int i;
		    try 
		    {
		    	String s=br.readLine();
		    	
				while(s!=null)
				{
					s2+=s;
					s=br.readLine();
				     
	            }
				s1=s2.split(";");
				
			} 
		    catch (IOException e)
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return s1;
	   
	}
}

