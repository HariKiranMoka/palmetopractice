import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMainCode {
	public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> a,ArrayList<Integer> b,int n)
	{
		ArrayList<Integer> c=new ArrayList<Integer>();
		a.addAll(b);
		Collections.sort(a);
		for(int i=0;i<2*n;i++)
			
		{
			if(i==0||i==2||i==6)
			{
				c.add(a.get(i));
			}
			
		}
		return c;
		
	}

}
