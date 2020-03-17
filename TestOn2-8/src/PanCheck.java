
public class PanCheck {
	public int panvalidate(String pnum)
	{
		
		  if(pnum.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
				  {
			         return 1;
				  }
		  else
		  {
			  return 0;
		  }
	

}
}
